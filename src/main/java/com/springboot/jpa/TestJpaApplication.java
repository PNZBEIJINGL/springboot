package com.springboot.jpa;

import com.springboot.helloworld.SpringbootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.springboot.jpa"})
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@RestController
public class TestJpaApplication {

    @RequestMapping("/")
    public String index() {
        return "Hello JPA TESTING";
    }

        public static void main(String[] args) {

            //SpringApplication.run(SpringbootApplication.class, args);

            //使用fluent API
            new SpringApplicationBuilder(SpringbootApplication.class).run(args);

        }

}
