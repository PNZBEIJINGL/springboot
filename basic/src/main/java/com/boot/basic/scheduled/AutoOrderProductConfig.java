package com.boot.basic.scheduled;

import cn.hutool.extra.spring.SpringUtil;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
//@Configuration
public class AutoOrderProductConfig {

    @Bean("autoOrderPorduct")
    public AutoOrderProduct getAutoOrderProduct() {
        return new AutoOrderProduct();
    }

    @Bean("jobDetail")
    public MethodInvokingJobDetailFactoryBean getMethodInvokingJobDetailFactoryBean(AutoOrderProduct autoOrderProduct) {
        MethodInvokingJobDetailFactoryBean factoryBean = new MethodInvokingJobDetailFactoryBean();
        factoryBean.setTargetObject(autoOrderProduct);
        factoryBean.setTargetMethod("executeJob");
        factoryBean.setConcurrent(false);
        return factoryBean;
    }

    @Bean("jobTrigger")
    public CronTriggerFactoryBean cronTriggerFactoryBean() {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setName("jobTrigger");
        cronTriggerFactoryBean.setGroup("Order_Trigger_Group");
        cronTriggerFactoryBean.setCronExpression("0/2 * * * * ?");
        cronTriggerFactoryBean.setJobDetail(SpringUtil.getBean("jobDetail"));
        return cronTriggerFactoryBean;
    }

    @Bean("myScheduler")
    public SchedulerFactoryBean getSchedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers((CronTriggerImpl)SpringUtil.getBean("jobTrigger"));
        return schedulerFactoryBean;
    }

}
