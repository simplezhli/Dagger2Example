package com.zl.dagger2example.bean;

import javax.inject.Inject;

/**
 * Created by weilu on 2016/1/27.
 */
public class Person {
    private String name = "Jack";
    private int age = 15;

    @Inject
    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
