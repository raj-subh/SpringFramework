package com.project.learn_spring01.autowiring;

public class Employee {
    private Address address;

    Employee() {
        super();
    }

    Employee(Address address) {
        super();
        this.address = address;
        System.out.println("Setting Address by Constructor(Autowiring)...");
    }

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
