package com.vidor.model;

import org.springframework.context.annotation.Configuration;

//@Component
@Configuration
public class Definition {
    private String name;

    public Definition(){

    }

    public Definition(String name) {
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
        return "Definition{" +
                "name='" + name + '\'' +
                '}';
    }
}
