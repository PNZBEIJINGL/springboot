package com.boot.basic.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
        User a = ctx.getBean(User.class);
        Customer b = ctx.getBean(Customer.class);
    }
}
