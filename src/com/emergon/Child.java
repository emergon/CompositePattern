package com.emergon;

public class Child extends Person{

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected void printFamily() {
        System.out.println(this);
        System.out.println("No descendants");
    }
    
}
