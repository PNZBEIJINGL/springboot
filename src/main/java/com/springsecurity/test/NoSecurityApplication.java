package com.springsecurity.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * EnableAutoConfiguration 关闭springsecurity默认验证
 */
@SpringBootApplication(scanBasePackages = {"com"})
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class NoSecurityApplication {

    public static void main(String[] args) {

        SpringApplication.run(NoSecurityApplication.class, args);
    }

}
