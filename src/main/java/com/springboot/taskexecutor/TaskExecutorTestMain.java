package com.springboot.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskExecutorTestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExcutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {

            asyncTaskService.executeAsynTask(i);
            asyncTaskService.executeAsynTaskPlus(i);
        }

    }
}
