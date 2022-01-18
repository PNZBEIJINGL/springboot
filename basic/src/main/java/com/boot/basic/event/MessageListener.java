package com.boot.basic.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener implements ApplicationListener<MessageEvent> {


    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {

        String msg = messageEvent.getMessage();
        System.out.println("======Message Tesing======");
        System.out.println(this.getClass().getName() + ":" + msg);
        System.out.println("==========================");
    }

}
