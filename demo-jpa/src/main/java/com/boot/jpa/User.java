package com.boot.jpa;

import javax.persistence.*;

/**
 * @Author: LIUY
 */
@Entity
@Table(name = "USEREN1")
//如果没有指定表名,表名和字段需要一致
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 50, nullable = false)
    private String code;
    @Column(length = 50, nullable = true)
    private String name;

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

}
