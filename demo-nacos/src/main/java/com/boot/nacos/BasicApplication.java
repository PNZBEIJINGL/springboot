package com.boot.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
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
