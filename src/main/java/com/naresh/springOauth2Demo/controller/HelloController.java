package com.naresh.springOauth2Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String getHelloMsg(){
        return """
               <!DOCTYPE html>
               <html>
               <head>
                   <title>Spring Security Tutorial</title>
               </head>
               <body>
                   <h1>Welcome to the Spring Security Tutorial</h1>
                   <p>
                       <a href="https://www.youtube.com/watch?v=oeni_9g7too" target="_blank">
                           Spring Security Tutorial
                       </a>
                   </p>
               </body>
               </html>
               """;
    }
}
