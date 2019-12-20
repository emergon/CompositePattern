package com.emergon;

public class MainClass {

    public static void main(String[] args) {
        Parent grandFather = new Parent("Pappous", 65);
        Parent dad = new Parent("Mpampas", 45);
        Person kid1 = new Child("Nick", 10);
        Person kid2 = new Child("Mary", 13);
        
        grandFather.addDescendant(dad);
        dad.addDescendant(kid1);
        dad.addDescendant(kid2);
        
        grandFather.printFamily();
    }
    
}
