package com.boot.jpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hellojpa")
public class TestController {

    @RequestMapping("/hellojpa")
    public String index() {
        return "Hello jpa";
    }
}
