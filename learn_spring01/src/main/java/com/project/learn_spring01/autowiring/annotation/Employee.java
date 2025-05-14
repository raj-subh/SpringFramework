package com.project.learn_spring01.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("address01")
    private Address address;

    Employee() {
        super();
    }

    // @Autowired
    Employee(Address address) {
        super();
        this.address = address;
        System.out.println("Setting Address by Constructor(Autowiring)...");
    }

    // @Autowired
    public void setAddress(Address address) {
        System.out.println("Setting Address at Runtime...");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }
}
