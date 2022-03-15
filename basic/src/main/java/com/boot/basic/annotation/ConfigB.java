package com.boot.basic.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigB {

    @Bean
    public Customer getCustomer() {
        return new Customer();
    }
}