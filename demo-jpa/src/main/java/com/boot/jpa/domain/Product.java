package com.boot.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @javax.persistence.Id
    private String Id;
    private String name;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
