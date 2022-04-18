package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping(value = "/test-string-request-body")
    public @ResponseBody
    ResponseEntity<Object> testStringRequestBody(@RequestBody String requestBody) {
        throw new IllegalStateException("test exception");
    }

    @PostMapping(value = "/test-object-request-body")
    public @ResponseBody
    ResponseEntity<Object> testStringRequestBody(@RequestBody TestModel requestBody) {
        throw new IllegalStateException("test exception");
    }
}
