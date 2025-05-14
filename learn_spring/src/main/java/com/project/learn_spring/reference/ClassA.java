package com.project.learn_spring.reference;

public class ClassA {
    private int x;
    private ClassB ob;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setOb(ClassB ob) {
        this.ob = ob;
    }

    public ClassA() {
        super();
    }

    public ClassA(int x, ClassB ob) {
        this.x = x;
        this.ob = ob;
    }

    public ClassB getOb() {
        return ob;
    }

    @Override
    public String toString() {
        return "ClassA [x=" + x + ", ob=" + ob + "]";
    }
}
