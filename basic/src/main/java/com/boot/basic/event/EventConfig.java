package com.boot.basic.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.boot.basic.event")
public class EventConfig {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        MessagePublish publish = context.getBean(MessagePublish.class);
        publish.publish("This is a event msg");
        context.close();
    }
}
