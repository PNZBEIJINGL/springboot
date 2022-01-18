package com.boot.basic.restful;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    //@GetMapping("/{id}") 等价于 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String findUser(@PathVariable("id") Long id) {
        System.out.println("param=" + id);
        return "return query result";
    }

    //@GetMapping = @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<User> getAllUser() {
        return new ArrayList<User>();
    }

    //@PostMapping = @RequestMapping(method = RequestMethod.POST)
    @PostMapping("/{id}")
    public int addUser(@PathVariable("id") Long id, @RequestBody User user) {
        System.out.println("do add user,id=" + id);
        return 1;
    }

    @PutMapping("/{id}")
    public int updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        System.out.println("do update user ,id=" + id);
        return 1;
    }


    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable("id") Long id, @RequestBody User user) {
        System.out.println("do delete user,id=" + id);
        return 1;
    }

}
