package com.boot.web.service;

public class NameInfo {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Integer a=new Integer(10);
        Integer b=new Integer(10);
        System.out.println(a==b);

    }
}
