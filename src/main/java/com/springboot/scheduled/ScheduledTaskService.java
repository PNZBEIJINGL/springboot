package com.springboot.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dataFormat=new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("间隔5秒执行："+dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0/15 * * 23 * *")
    public void fixTimeExecution(){
        System.out.println("指定时间执行："+dataFormat.format(new Date()));
    }

}
