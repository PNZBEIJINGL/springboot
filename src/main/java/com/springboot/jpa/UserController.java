package com.springboot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/addUser")
    public String addUser(Long id, String name, String code) {
        User user = new User();
        user.setId(id);
        user.setCode(code);
        user.setName(name);
        userDao.save(user);

        Optional<User> result = userDao.findById(id);
        return result.get().toString();
    }

    @RequestMapping("/get")
    public String getUser(Long id) {
        Optional<User> result = userDao.findById(id);
        return result.get().toString();

    }
}
