package com.boot.basic.firststep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication  //1.@SpringBootApplication注解默认扫描注解类所在包和下属包
@SpringBootApplication(scanBasePackages = {"com.boot.basic.firststep.controller"})  //2.可以使用scanBasePackages来设置扫描路径
public class BasicApplication {

    public static void main(String[] args) {
        //调用委托给Spring Boot的run方法
        //SpringApplication引导启动spring,然后启动配置的tomcat容器
        SpringApplication.run(BasicApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
