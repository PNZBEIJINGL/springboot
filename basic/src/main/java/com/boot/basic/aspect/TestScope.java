package com.boot.basic.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScope {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Scopeconfig.class);
        DemoSingletonService s1=context.getBean(DemoSingletonService.class);
        DemoSingletonService s2=context.getBean(DemoSingletonService.class);

        DemoPrototypeService d1=context.getBean(DemoPrototypeService.class);
        DemoPrototypeService d2=context.getBean(DemoPrototypeService.class);

        System.out.println("sigleton test=======>"+s1.equals(s2));
        System.out.println("prototyped test=======>"+d1.equals(d2));

    }

}
