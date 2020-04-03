package com.aws.test.awstest.controllers;

import com.aws.test.awstest.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

    TestService testService;

    @GetMapping(path = "/getRandomString/{length}")
    public ResponseEntity<Object> testEndpoint(@PathVariable int length){

        String testString = testService.returnSomeRandomString(10);

        return new ResponseEntity<Object>(testString, null,  HttpStatus.OK);
    }
}
