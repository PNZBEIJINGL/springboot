package com.boot.mybatis.service;

import com.boot.mybatis.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List findAllUser() {
        return userMapper.findAllUser();
    }
}
