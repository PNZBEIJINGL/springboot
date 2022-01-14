package com.boot.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello1")
public class HelloWorldController {

    //第一个测试
    @RequestMapping("/helloworld")
    public String index() {
        return "Hello World";
    }
}
