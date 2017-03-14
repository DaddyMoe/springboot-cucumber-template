package com.mosesmansaray.springboot.inegration.cucumber.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String index() {
        return "Hello World... Testing 123!";
    }
    
}
