package com.boot.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {

    /**
     * Restful: 【POST】 /users # 新建用户信息
     *
     * @param username
     * @param usercode
     * @return
     */
    @PostMapping("/")
    @ApiOperation("新建用户接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名称", defaultValue = "测试用户"),
            @ApiImplicitParam(name = "usercode", value = "用户编码", defaultValue = "99999", required = true)
    }
    )
    public User addUser(@RequestParam(required = true) String username, @RequestParam(required = true) String usercode) {
        System.out.println("do addUser");
        User user = new User();
        user.setId(1000L);
        return user;
    }

    /**
     * Restful: 【PUT】 /users/1001 # 更新用户信息(全部字段)
     *
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    @ApiOperation("更新用户接口")
    public User updateUser(@RequestBody User user) {
        System.out.println("do update");
        return user;
    }

    /**
     * Restful: 【GET】 /users/1000 # 查询用户信息列表
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation("查询用户接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    public User getUser(@PathVariable Long id) {
        System.out.println("do getUserById");
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        user.setUsercode("1000");
        user.setAge(20);
        return user;
    }

    /**
     * Restful: 【DELETE】 /users/1001 # 删除用户信息
     */
    @DeleteMapping("/{id}")
    @ApiOperation("删除用户接口")
    @ApiImplicitParam(name = "id", value = "用户id")
    public void deleteUser(@PathVariable Long id) {
        System.out.println("do deleteUser");
    }

    /**
     * Restful: 【GET】 /users # 查询用户信息列表
     *
     * @return
     */
    @GetMapping("/")
    @ApiOperation("查询所有用户接口")
    public List<User> getUser() {
        User user = new User();
        user.setId(1000L);
        user.setUsername("zhangsan");
        user.setUsercode("1000");
        user.setAge(20);

        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}
