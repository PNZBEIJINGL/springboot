package com.springboot.security;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 角色
 */
@Entity
public class SysRole {

    @Id
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
