package com.project.learn_spring.reference;

public class ClassB {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ClassB() {
        super();
    }

    public ClassB(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ClassB [y=" + y + "]";
    }
}
