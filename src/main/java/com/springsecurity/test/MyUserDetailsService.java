package com.springsecurity.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class MyUserDetailsService implements UserDetailsService {


    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //TODO 根据用户名，查找到对应的密码，与权限

        //只要是1234567就成功
        String password = this.passwordEncoder.encode("1234567");
        logger.info("用户用户名: {}", username);
        logger.info("用户的密码：{}", password);

        // 封装用户信息，并返回。参数分别是：用户名，密码，用户权限
        User user = new User(username, password,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        //自定义加密方式
        return new BCryptPasswordEncoder();
    }
}
