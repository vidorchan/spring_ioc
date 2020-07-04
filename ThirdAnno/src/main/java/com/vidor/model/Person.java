package com.vidor.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
