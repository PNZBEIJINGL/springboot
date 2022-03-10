package com.boot.swagger;

import io.swagger.annotations.ApiModelProperty;

public class User {
    @ApiModelProperty(value = "用户id")
    private Long id;

    @ApiModelProperty(value = "用户名称")
    private String username;

    @ApiModelProperty(value = "用户编码")
    private String usercode;

    @ApiModelProperty(value = "用户年龄")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercoce) {
        this.usercode = usercoce;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}