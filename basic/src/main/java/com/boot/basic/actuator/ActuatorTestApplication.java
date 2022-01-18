package com.boot.basic.actuator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = {"com.boot.basic.actuator"})
public class ActuatorTestApplication {
    public static void main(String[] args) {

        new SpringApplicationBuilder(ActuatorTestApplication.class).run(args);

    }
}
