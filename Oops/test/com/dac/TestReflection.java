package com.dac;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        try {
                    Person p=null;
            
            //Dynamically load the class
            Class c=Class.forName("com.dac.Person");
            System.out.println(c.getName());
            System.out.println(c.getSuperclass().getName());
            
            Constructor constructor[]=c.getDeclaredConstructors();
            System.out.println("Name of the constructor");
            for(Constructor c1:constructor){
                System.out.println(c1);
                c1.setAccessible(true);
                //System.out.println(c1);
                p=(Person)c1.newInstance();
                p.showName();
            }
            
            System.out.println("Fields are");
            Field field[]=c.getDeclaredFields();
            for(Field f:field){
                f.setAccessible(true);
                System.out.println(f);
                System.out.println(f.get(p));
                
            }
            
            Method methods[]=c.getDeclaredMethods();
            System.out.println("Methods are");
            for(Method m:methods){
                System.out.println(m);
            }
            
            
        
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
