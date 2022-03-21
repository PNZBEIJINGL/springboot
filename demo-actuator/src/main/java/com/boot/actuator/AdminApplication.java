package com.boot.actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAdminServer  //开启Admin监控
@SpringBootApplication(scanBasePackages = {"com.boot.actuator"})
public class AdminApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminApplication.class).run(args);
    }
}
