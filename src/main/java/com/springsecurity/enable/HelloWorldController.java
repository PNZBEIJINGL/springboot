package com.springsecurity.enable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello2")
public class HelloWorldController {
    @RequestMapping("/hello2")
    public String index() {

        return "Hello World";
    }
}
