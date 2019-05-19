package com.springboot.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener implements ApplicationListener<MessageEvent> {


    @Override
    public void onApplicationEvent(MessageEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("==========================");
        System.out.println(this.getClass().getName() + ":" + msg);
        System.out.println("==========================");
    }


}
