package com.boot.basic.restful;

import java.util.Date;

/**
 * @Author: LIUY
 */
//如果没有指定表名,表名和字段需要一致
public class User {


    private Long id;

    private String code;

    private String name;

    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
