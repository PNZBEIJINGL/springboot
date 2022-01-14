package com.boot.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//1.@SpringBootApplication注解默认扫描注解类所在包和下属包
//@SpringBootApplication
//2.可以使用scanBasePackages来设置扫描路径
@SpringBootApplication(scanBasePackages = {"com.boot"})
public class BasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }

}
