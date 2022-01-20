package com.boot.basic.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 面向接口编程，实现ApplicationListener接口
 */
@Component
public class MessageListener implements ApplicationListener<MessageEvent> {

    @Async
    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {
        try {
            Thread.sleep(1000L);
            String msg = messageEvent.getMessage();
            System.out.println();
            System.out.println("Message Tesing######## "+this.getClass().getName() + ":" + msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
