package com.boot.actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAdminServer
@SpringBootApplication(scanBasePackages = {"com.boot.actuator"})
public class ActuatorApplication {
    public static void main(String[] args) {

        new SpringApplicationBuilder(ActuatorApplication.class).run(args);

    }
}
