package com.springboot.scheduled;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduledMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
