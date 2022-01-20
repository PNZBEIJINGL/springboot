package com.boot.basic.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MessagePublish {

    @Autowired
    AbstractApplicationContext applicationContext;

    public void publish(String msg) {
        applicationContext.publishEvent(new MessageEvent(this,msg));
    }
}
