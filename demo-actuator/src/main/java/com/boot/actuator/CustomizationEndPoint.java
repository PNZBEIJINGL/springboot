package com.boot.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customizationEndPoint")
public class CustomizationEndPoint {

    public String getStatus(@Selector String name) {

        return "Customization name" + name;
    }
}
