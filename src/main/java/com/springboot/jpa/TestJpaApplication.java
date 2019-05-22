package com.springboot.jpa;

import com.springboot.helloworld.SpringbootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class TestJpaApplication {

        public static void main(String[] args) {

            //SpringApplication.run(SpringbootApplication.class, args);

            //使用fluent API
            new SpringApplicationBuilder(SpringbootApplication.class).run(args);

        }

}
