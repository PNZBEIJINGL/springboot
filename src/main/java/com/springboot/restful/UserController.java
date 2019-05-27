package com.springboot.restful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String findUser(@PathVariable("id") Long id) {
        System.out.println("param=" + id);
        return "return query result";
    }
}
