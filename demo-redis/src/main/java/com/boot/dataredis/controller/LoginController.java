package com.boot.dataredis.controller;

import com.boot.dataredis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/login")
    public String login(@RequestParam(value = "username", defaultValue = "zhangsan") String name) {
        User user = new User();
        user.setName(name);

        redisTemplate.execute(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection connection)
                    throws DataAccessException {

                byte[] key = redisTemplate.getStringSerializer().serialize("username."+name);

                JdkSerializationRedisSerializer s = (JdkSerializationRedisSerializer) redisTemplate
                        .getValueSerializer();
                byte[] value = s.serialize(user);


                connection.set(key, value);
                System.out.println("add");
                return null;
            }
        });

        return String.format("success", name);
    }

    @GetMapping("/get")
    public String get(@RequestParam(value = "username", defaultValue = "zhangsan") String name) {

        Object object = redisTemplate.execute(new RedisCallback() {

            public Object doInRedis(RedisConnection connection)
                    throws DataAccessException {
                byte[] key = redisTemplate.getStringSerializer().serialize("username."+name);
                if (connection.exists(key)) {
                    byte[] value = connection.get(key);

                    JdkSerializationRedisSerializer s = (JdkSerializationRedisSerializer) redisTemplate.getValueSerializer();
                    return s.deserialize(value);
                }
                return null;
            }
        });

        if (object == null) {
            return "null";
        } else {
            return ((User) object).getName();
        }

    }
}
