package com.boot.basic.aspect;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DemoPrototypeService {

    public void add() {

    }
}
