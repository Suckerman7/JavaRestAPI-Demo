package org.mertyuksel.restapidemo.service.impl;

import org.mertyuksel.restapidemo.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {


    @Override
    public String helloWorld() {
        return "Hello World from service layer!";
    }
}
