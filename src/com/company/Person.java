package com.company;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private String gender;

    Person() {
    };

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
    }
}