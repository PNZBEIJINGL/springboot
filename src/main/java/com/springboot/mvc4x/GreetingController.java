package com.springboot.mvc4x;

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

    @RequestMapping("/hi")
    public String getStaticPage() {
        return "hello.html";
    }


}
