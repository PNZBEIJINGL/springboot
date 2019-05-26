package com.springboot.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ServiceProperties.class)
//ConditionOnClass判断HelloService是不是在类路径中是否存在，容器中没有这个Bean就自动配置这个Bean
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)
public class ServiceAutoConfiguration {

    @Autowired
    private ServiceProperties serviceProperties;

    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(serviceProperties.getMsg());
        return helloService;
    }


}
