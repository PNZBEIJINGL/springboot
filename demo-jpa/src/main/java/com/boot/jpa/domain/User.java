package com.boot.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: LIUY
 */
@Entity
@Table(name = "USEREN")
//如果没有指定表名,表名和字段需要一致
public class User {

    @Id
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
