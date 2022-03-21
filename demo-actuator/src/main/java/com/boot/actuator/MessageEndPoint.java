package com.boot.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Endpoint(id = "message-endpoint")
public class MessageEndPoint {


    //@EndPoint中的id不能使用驼峰法，需要以-分割
    //@Spring Boot会去扫描@EndPoint注解下的@ReadOperation, @WriteOperation, @DeleteOperation注解，
    //分别对应生成Get/Post/Delete的Mapping。注解中有个produces参数，可以指定media type, 如：application/json等

    //management.endpoints.web.exposure.include=test-endpoint

    @ReadOperation
    public Map<String, Object> endpoint() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("message", "this is my endpoint");
        return map;
    }
}
