package com.boot.basic.firststep.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
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
