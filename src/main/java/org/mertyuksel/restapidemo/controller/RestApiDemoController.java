package org.mertyuksel.restapidemo.controller;

import org.mertyuksel.restapidemo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiDemoController {

    @Autowired
    private HelloWorldService helloWorldService;
    @GetMapping("/hello")
    public String hello() {
        return "Hello World, with Docker!";
    }
}
