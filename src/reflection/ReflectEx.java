
package reflection;

import java.lang.reflect.Method;
class Parent {
}
class Person extends Parent {
    public void show(){}
    
}
public class ReflectEx{
public static void main(String[] args){
Person p=new Person();
Class c=p.getClass();
String name= c.getName();
    System.out.println("Class Name :"+name);
    Method method[]=c.getDeclaredMethods();
    for (Method method1 : method) {
        System.out.println("Method Name: "+ method1.getName());
    }
    Class superClasss=c.getSuperclass();
    System.out.println("SuperClass Name :"+superClasss.getName());
}
}
