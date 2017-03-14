package com.mosesmansaray.springboot.inegration.cucumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World... Testing 123!";
    }
    
}
