package com.boot.basic.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myapplication.properties")
@EnableConfigurationProperties(MyProperties.class)
@ConfigurationProperties(prefix = "demo.conf.test")
public class MyProperties {

    private String name;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
