package com.naresh.springOauth2Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String getHelloMsg(){
        return "Hello, welcome to Telusuko";
    }
}
