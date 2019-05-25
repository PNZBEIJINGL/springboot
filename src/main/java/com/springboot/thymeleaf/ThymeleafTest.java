package com.springboot.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.springboot.thymeleaf"})
//不启动安全验证和数据库
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class
})
@Controller
public class ThymeleafTest {

    @RequestMapping("/thymeleaf")
    public String getThymeleaf(Model model) {
        Person single = new Person("PNZ.orl", "30");

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("PNZ.LIUY", "20"));
        people.add(new Person("PNZ.BeijingL", "33"));
        people.add(new Person("PNZ.orcl", "29"));

        model.addAttribute("titlename", "=== Test INFO ===");
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        model.addAttribute("people1",new ArrayList<Person>());

        return "thymeleaf";
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafTest.class, args);
    }
}
