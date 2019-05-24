package com.springboot.scheduled;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.springboot.scheduled")
@EnableScheduling //开启计划任务
public class TaskSchedulerConfig {

}
