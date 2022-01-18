package com.boot.basic.mvc4x;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    //Profile 为dev时 实例化devDemoBean
    @Profile("dev")
    @Bean
    public DemoBean devDomoBean() {
        return new DemoBean(" from development profile");
    }


    //Profile 为prod时 实例化proDemoBean
    @Profile("prod")
    @Bean
    public DemoBean prodDemoBean() {
        return new DemoBean(" from production profile");
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        //注册Bean的配置类
        context.register(ProfileConfig.class);
        //这里需要刷新容器，不刷新会有找不到Bean的异常
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }

}
