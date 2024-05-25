package org.mertyuksel.restapidemo.controller;

import org.mertyuksel.restapidemo.service.HelloWorldService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiDemoController {

    private final HelloWorldService helloWorldService;

    public RestApiDemoController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>(helloWorldService.helloWorld(), HttpStatus.OK);
    }
}
