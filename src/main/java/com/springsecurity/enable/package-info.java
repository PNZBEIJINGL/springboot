package com.springsecurity.enable;
/*
 * 1. 运行NoSecurityApplication:注解不使用security验证,EnableAutoConfiguration可以关闭验证
 * @EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
 *
 */