package com.springboot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //注册一个CustomerUserService
    @Bean
    UserDetailsService getCustomerUserService() {
        return new CustomerUserService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(getCustomerUserService());
    }

    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().anyRequest().authenticated()  //所有请求都要验证
                .and()
                .formLogin().loginPage("/login").failureUrl("/login?error").permitAll()  //定制登录行为
                .and()
                .logout().permitAll();  //订制注销行为

    }


}
