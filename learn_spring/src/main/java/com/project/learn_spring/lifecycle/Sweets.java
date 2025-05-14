package com.project.learn_spring.lifecycle;

public class Sweets {

    private double price;

    public void setPrice(double price) {
        System.out.println("Setting price...");
        this.price = price;
    }

    public Sweets() {
        super();
    }

    @Override
    public String toString() {
        return "Sweets [price " + price + "]";
    }

    public void init() {
        System.out.println("Inside init method!");
    }

    public void destroy() {
        System.out.println("Inside destroy method!");
    }
}
