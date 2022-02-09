package com.boot.redis.controller;


import com.boot.redis.domain.UserDTO;
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

    //顺序生成ID,用于测试
    private static Long index = 1L;

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/login")
    public String login(@RequestParam(value = "username", defaultValue = "zhangsan") String name) {
        UserDTO user = new UserDTO();
        user.setCode(""+1000+index);
        user.setName(name);
        user.setId(index++);

        redisTemplate.execute(new RedisCallback<Object>() {
            @Override
            public Object doInRedis(RedisConnection connection)
                    throws DataAccessException {

                byte[] key = redisTemplate.getStringSerializer().serialize("user.id." + user.getId());

                JdkSerializationRedisSerializer s = (JdkSerializationRedisSerializer) redisTemplate.getValueSerializer();

                connection.set(key, s.serialize(user));
                System.out.println("add");
                return null;
            }
        });

        return String.format("success", name);
    }

    @GetMapping("/get")
    public String get(@RequestParam(value = "userid", defaultValue = "1") String userId) {

        Object object = redisTemplate.execute(new RedisCallback() {

            public Object doInRedis(RedisConnection connection)
                    throws DataAccessException {
                byte[] key = redisTemplate.getStringSerializer().serialize("user.id." + userId);
                if (connection.exists(key)) {
                    JdkSerializationRedisSerializer s = (JdkSerializationRedisSerializer) redisTemplate.getValueSerializer();
                    return s.deserialize(connection.get(key));
                }
                return null;
            }
        });

        if (object == null) {
            return "null";
        } else {
            return ((UserDTO) object).toString();
        }

    }
}
