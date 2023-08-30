
import java.util.*;

interface client{

    void input();
    void output();
    void medium();
    final int salary=2300;
    final String name="sagar";
}
class Inter implements client
{

   // WrapperClass name;
    //double salary;

   // public void input() {
       // Scanner sc = new Scanner(System.in);
        //System.out.println("ENTER THE NAME");
       // name = sc.nextLine();
       // System.out.println("ENTER THE SALARY");
        //salary = sc.nextInt();

    //}
    
    public void output(){
        System.out.println("name "+name+" and salary is " + salary);
    }

    public void medium() {
        System.out.println("MY NAME IS SAGAR");
    }

    public static void main(WrapperClass[] args) {
        Interfe c = new Interfe();
        //c.input();
        c.output();
        c.medium();
    }
}
