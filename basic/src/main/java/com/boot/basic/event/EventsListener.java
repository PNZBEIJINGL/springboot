package com.boot.basic.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 基于注解驱动 使用注解 @EventListener实现Spring事件监听
 */
@Component
class EventsListener {

    @EventListener(MessageEvent.class)
    public void onEvent(MessageEvent event) {
        String msg = event.getMessage();
        System.out.println();
        System.out.println("Message Tesing######## "+this.getClass().getName() + ":" + msg);
    }
}
