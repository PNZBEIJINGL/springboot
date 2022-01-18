package com.boot.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("uuser")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/jpa")
    public String index() {

        return "Hello JPA TESTING";
    }
  /*
    @RequestMapping("/addUse")
    public String addUser(Long id, String name, String code) {
        System.out.println("addUser");
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
        System.out.println("getuser");
        Optional<User> result = userDao.findById(id);
        return result.get().toString();

    }

    */
}
