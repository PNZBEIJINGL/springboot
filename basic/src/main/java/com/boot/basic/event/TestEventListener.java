package com.boot.basic.event;

import org.springframework.context.ApplicationListener;

public class TestEventListener implements ApplicationListener<MessageEvent> {

    public void onApplicationEvent(MessageEvent messageEvent) {
        System.out.println("Message Tesing######## "+this.getClass().getName() + ":" + messageEvent.getMessage());
    }

}
