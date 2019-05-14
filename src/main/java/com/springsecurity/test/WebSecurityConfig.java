package com.springsecurity.test;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Java配置的最基本示例
 */
@EnableWebSecurity
public class WebSecurityConfig implements WebMvcConfigurer {

    /**
     * 作用：
     * 1.要求对应用程序中的每个URL进行身份验证，为您生成登录表单
     * 2.允许具有  user 用户和密码password 的用户使用基于表单的身份验证进行身份验证
     * 3.允许用户注销
     *
     * @return
     * @throws Exception
     */
    @Bean
    public UserDetailsService userDetailsService() throws Exception {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("username").password("password").roles("USER").build());
        return manager;
    }
}
