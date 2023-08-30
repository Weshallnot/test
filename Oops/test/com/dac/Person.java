package com.dac;
public class Person{
    private String name="Abhshek";

    private Person() {
        System.out.println("I'm private constructor");
    }
    
     public void showName(){
         System.out.println("My name is "+name);
     }
    
    
}
