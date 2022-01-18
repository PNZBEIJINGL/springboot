package com.boot.basic.aspect;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截add()")
    public void add() {

    }

}
