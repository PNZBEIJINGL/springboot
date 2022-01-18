package com.boot.basic.mvc4x;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.springboot.mvc4x"})
public class TestApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestApplication.class, args);
    }

}
