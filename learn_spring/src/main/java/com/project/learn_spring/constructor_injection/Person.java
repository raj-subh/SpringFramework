package com.project.learn_spring.constructor_injection;

public class Person {
    private String name;
    private int personID;
    private Certificate certificate;

    public Person(String name, int personID, Certificate certificate) {
        this.name = name;
        this.personID = personID;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Name:" + this.name + "\nPerson ID:" + this.personID + "\nCertificate: {" + this.certificate.name + "}";
    }
}
