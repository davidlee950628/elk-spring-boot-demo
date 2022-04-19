# How to test the ELK with this project

1. Build the jar file

`./gradlew build`

2. Go the directory build/libs

`cd build/libs`

3. Download the elastic APM agent at https://mvnrepository.com/artifact/co.elastic.apm/elastic-apm-agent/1.30.1 and move to build/libs

4. Create a file elasticapm.properties at build/libs with the content:
```
enable=true
environment=Local
service_name=elk-spring-boot-demo
application_packages=com.example.demo
server_url=http://localhost:8200
capture_body=all
transaction_sample_rate=1
metrics_interval=5m
```

4. Execute the command to run the application

`java -javaagent:elastic-apm-agent-1.30.1.jar -jar demo-0.0.1-SNAPSHOT.jar`

5. Run the following command to send data to ELK

`curl -X POST http://localhost:8080/test-string-request-body --data "{\"name\": \"test\"}"`

`curl -X POST http://localhost:8080/test-object-request-body --data "{\"name\": \"test\"}" -H "Content-Type: application/json"`