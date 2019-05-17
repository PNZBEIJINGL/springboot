package com.springboot.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello1")
public class HelloWorldController {

    @RequestMapping("/hello1")
    public String index() {
        return "Hello World";
    }
}
