package com.boot.basic.firststep.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class HelloWorldControllerTest {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    public void testHello(){
        String result=helloWorldController.hello();
        System.out.println(result);
    }
}
