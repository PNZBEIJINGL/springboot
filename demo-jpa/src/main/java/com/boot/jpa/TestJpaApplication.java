package com.boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class TestJpaApplication {


    public static void main(String[] args) {

        SpringApplication.run(TestJpaApplication.class, args);

        //使用fluent API
        //new SpringApplicationBuilder(SpringbootApplication.class).run(args);

    }

}
