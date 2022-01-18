package com.boot.basic.mvc4x;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(String name, Model m) {

        m.addAttribute("name", name);
        //跳转读取templates/greeting.html
        return "greeting";
    }

    @RequestMapping("/getIndex")
    public String getIndexPage(String name, Model m) {

        return "index";
    }

    //静态页面的return默认是跳转到/static/index.html，
    //当在pom.xml中引入了thymeleaf组件，动态跳转会覆盖默认的静态跳转，
    // 默认就会跳转到/templates/index.html，注意看两者return代码也有区别，动态没有html后缀
    @RequestMapping("/hi")
    public String getStaticPage() {

        return "hello.html";
    }


}
