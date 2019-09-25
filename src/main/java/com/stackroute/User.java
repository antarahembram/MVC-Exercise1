package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name;
    private int age;

    @Autowired
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String printUserDetails()
    {
        return name+" "+age;
    }

}
