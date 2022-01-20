package com.boot.basic.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EventDemoApplication {

    @Autowired
    private MessagePublish messagePublish;

    public static void main(String[] args) {
        SpringApplication springApplication =
                new SpringApplication(EventDemoApplication.class);
        springApplication.addListeners(new TestEventListener());
        springApplication.run(args);
    }

    @GetMapping("/send")
    public String hello(@RequestParam(value = "msg", defaultValue = "Test message") String message) {
        messagePublish.publish(message);
        return "success";
    }

}
