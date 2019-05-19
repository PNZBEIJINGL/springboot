package com.springboot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublish {


    @Autowired
    AnnotationConfigApplicationContext applicationContext;

    public void publish(String msg) {


        applicationContext.publishEvent(new DemoEvent(this,msg));
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);


        DemoPublish publish = context.getBean(DemoPublish.class);
        publish.publish("This is a event msg");
        context.close();
    }

}
