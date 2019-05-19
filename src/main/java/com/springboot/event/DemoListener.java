package com.springboot.event;

import com.springboot.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {


    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("==========================");
        System.out.println(this.getClass().getName() + ":" + msg);
        System.out.println("==========================");
    }


}
