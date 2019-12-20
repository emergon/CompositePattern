package com.emergon;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {

    private String name;
    private int age;
    

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected abstract void printFamily();

    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

}

//    public void printFamily() {
//        System.out.println(this);
//        if (descendants.isEmpty()) {
//            return;
//        }
//        for (Person p : descendants) {
//            p.printFamily();
//        }
//    }
