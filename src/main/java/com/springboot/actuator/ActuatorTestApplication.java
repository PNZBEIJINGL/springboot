package com.springboot.actuator;

import com.springboot.helloworld.SpringbootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = {"com.springboot.actuator"})
//不启动安全验证和数据库
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class
})
public class ActuatorTestApplication {
    public static void main(String[] args) {

        new SpringApplicationBuilder(ActuatorTestApplication.class).run(args);

    }
}
