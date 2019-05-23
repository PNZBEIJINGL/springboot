package com.springboot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomerUserService implements UserDetailsService {

    @Autowired
    private SysUserRepository sysUserRepository;

    //重写loadUserByUsername方法获取用户
    //SysUser 实现了UserDetails接口,返回的是一个子类对象
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SysUser user = sysUserRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("user.not.found");
        }

        return user;
    }
}
