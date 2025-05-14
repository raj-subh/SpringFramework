package com.project.learn_spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drinks implements InitializingBean, DisposableBean {
    private double pepsiPrice;

    public double getPrice() {
        return pepsiPrice;
    }

    public void setPrice(double price) {
        this.pepsiPrice = price;
    }

    public Drinks() {
        super();
    }

    @Override
    public String toString() {
        return "Drinks [price=" + pepsiPrice + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Drinking Pepsi (init)...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("pepsi is out (destroy)...");
    }
}
