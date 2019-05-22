package com.springboot.scheduled;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 调度测试
 */
public class ScheduledMainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
