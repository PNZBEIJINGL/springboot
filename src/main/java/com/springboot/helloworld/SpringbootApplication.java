package com.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;


@RestController
@SpringBootApplication(scanBasePackages = {"com.springboot.helloworld"})
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})//关闭Securitye
public class SpringbootApplication {

    @RequestMapping("/")
    public String index() {
        return "Hello World ,This is index";
    }

    public static void main(String[] args) {

        //SpringApplication.run(SpringbootApplication.class, args);

        //使用fluent API
        new SpringApplicationBuilder(SpringbootApplication.class).run(args);

    }

}
