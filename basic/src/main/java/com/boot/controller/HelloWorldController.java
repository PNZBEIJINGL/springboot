package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//不再主类默认扫描路径下
@RestController
public class HelloWorldController {

    //第一个测试
    @RequestMapping("/helloworld")
    public String index() {
        return "HelloWorldController:Hello World";
    }
}
