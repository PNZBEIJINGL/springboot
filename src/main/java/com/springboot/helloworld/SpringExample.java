package com.springboot.helloworld;

import com.springboot.helloworld.SpringbootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration  //开启后自动注解
@SpringBootApplication(scanBasePackages = {"com.springboot.helloworld"})
public class SpringExample {

    @RequestMapping("/home")
    public String home() {
        return "This is first test";
    }

    public static void main(String[] args) {
        //调用委托给Spring Boot的run方法
        //SpringApplication引导启动spring,然后启动配置的tomcat容器
        SpringApplication.run(SpringbootApplication.class, args);
    }
}

