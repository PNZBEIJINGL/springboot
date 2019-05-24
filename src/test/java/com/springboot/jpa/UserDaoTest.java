package com.springboot.jpa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootApplication
//使用JUnit单元测试
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Before
    public void before() {
        User user = new User();
        user.setId(1L);
        user.setCode("1000");
        user.setName("PNZ.LIUY");
        userDao.save(user);

    }

    @Test
    public void testAdd() {
        User user2 = new User();
        user2.setId(2L);
        user2.setCode("2000");
        user2.setName("PNZ.beijingl");
        userDao.save(user2);
    }

    @Test
    public void testFindbyId() {
        Optional<User> user = userDao.findById(1L);
        if (user.isPresent()) {
            System.out.println(user.get().getName());
            System.out.println(user.get().getCode());
        }
    }

    @After
    public void after() {
        Optional<User> user = userDao.findById(2L);
        if (user.isPresent()) {
            System.out.println(user.get().getName());
            System.out.println(user.get().getCode());
        }
    }
}
