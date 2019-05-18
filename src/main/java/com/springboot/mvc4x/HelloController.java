package com.springboot.mvc4x;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *第一个测试
 */
@Controller  //声明一个控制器
public class HelloController {

    @RequestMapping("/index")
    public String hello() {
        return "index";
    }
}
