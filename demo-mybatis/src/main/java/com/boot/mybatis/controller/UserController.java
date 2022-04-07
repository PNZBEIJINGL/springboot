package com.boot.mybatis.controller;


import com.boot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/findAll")
    public List findAll() {
        return userService.findAllUser();
    }
}
