package com.project.learn_spring.constructor_injection;

public class Certificate {
    String name;

    public Certificate(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
