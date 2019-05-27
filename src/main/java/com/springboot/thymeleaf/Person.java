package com.springboot.thymeleaf;

/**
 * 测试类，用于模版展示数据
 */
public class Person {

    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAge() {

        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
