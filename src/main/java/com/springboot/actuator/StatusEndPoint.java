package com.springboot.actuator;

import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@ConfigurationProperties(prefix = "management.andpoints.status", ignoreInvalidFields = false)
public class StatusEndPoint implements ApplicationContextAware {

    ApplicationContext applicationcontext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationcontext = applicationContext;
    }
}
