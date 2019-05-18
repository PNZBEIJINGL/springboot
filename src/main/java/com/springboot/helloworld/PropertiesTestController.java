package com.springboot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesTestController {

    @Value("${example.author}")
    private String author;
    @Value("${example.remark}")
    private String remark;

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/example")
    public String properties() {
        return "Eaxmple,Author:" + author + " " + remark;
    }

    @RequestMapping("/author")
    public String author() {
        return "Name:" + authorSettings.getName() + "\n City:" + authorSettings.getCity();
    }
}
