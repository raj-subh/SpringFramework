package com.project.learn_spring01.javaConfiguration;

import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    private Samosa samosa;

    public Student(Samosa samosa) {
        super();
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        samosa.display();
        System.out.println("Student is reading book...");
    }
}
