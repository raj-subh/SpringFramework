package com.project.learn_spring01.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;

    @Value("#{2+5+9+12}")
    private int y;

    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private double z;

    @Value("#{ T(java.lang.Math).PI}")
    private double PI;

    @Value("#{ new java.lang.String('Raj Subhash') }")
    private String name;

    @Value("#{ 8>3 }")
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double pI) {
        PI = pI;
    }

    @Override
    public String toString() {
        return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", PI=" + PI + ", name=" + name + ", isActive=" + isActive
                + "]";
    }

}
