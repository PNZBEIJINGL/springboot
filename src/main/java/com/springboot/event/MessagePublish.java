package com.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MessagePublish {


    @Autowired
    AnnotationConfigApplicationContext applicationContext;

    public void publish(String msg) {


        applicationContext.publishEvent(new MessageEvent(this,msg));
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);


        MessagePublish publish = context.getBean(MessagePublish.class);
        publish.publish("This is a event msg");
        context.close();
    }

}
