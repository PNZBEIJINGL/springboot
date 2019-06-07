package com.springboot.jpa;

import com.springboot.helloworld.SpringbootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


//不启动安全验证和数据库
@EnableAutoConfiguration
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class TestJpaApplication {


    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);

        //使用fluent API
        //new SpringApplicationBuilder(SpringbootApplication.class).run(args);

    }

}
