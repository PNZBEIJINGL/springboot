package com.boot.basic.scheduled;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
@EnableScheduling
public class ScheduledTaskService {

    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    //@Scheduled(fixedRate = 5000)
    //@Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)  //可以使用timeUnit设置时间单位
    public void reportCurrentTime() throws InterruptedException {
        System.out.println("间隔5秒执行：" + dataFormat.format(new Date()));
        Thread.sleep(6000);
        System.out.println("间隔5秒结束：" + dataFormat.format(new Date()));
    }


    //@Scheduled(fixedDelay = 5000)
    //@Scheduled(fixedDelay = 5, timeUnit = TimeUnit.SECONDS)  //可以使用timeUnit设置时间单位
    public void reportCurrentTime2() throws InterruptedException {
        System.out.println("间隔5秒执行：" + dataFormat.format(new Date()));
        Thread.sleep(6000);
        System.out.println("间隔5秒结束：" + dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0/3 * * * * ?")
    public void fixTimeExecution() {
        //@Scheduled 不支持7位,即不支持年
        //异常: Cron expression must consist of 6 fields (found 7 in "0/1 * * * * ? 2099")
        //@Scheduled(cron = "-")   不启动任务
        System.out.println("指定时间执行：" + dataFormat.format(new Date()));
    }

}
