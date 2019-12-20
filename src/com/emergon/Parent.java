/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tasos
 */
public class Parent extends Person{
    private List<Person> descendants;
    public Parent(String name, int age) {
        super(name, age);
        descendants = new ArrayList();
    }
    
    public List<Person> getDescendants() {
        return descendants;
    }

    public void addDescendant(Person p) {
        descendants.add(p);
    }
    
    public void printFamily() {
        System.out.println("family member "+getName());
        String familyExists = descendants.isEmpty()?"no descendent":"descendants";
        System.out.println(getName()+" has "+familyExists+"\n");
        for(Person p:descendants){
            p.printFamily();
        }
        //getDescendants().forEach(System.out::println);
    }
}
