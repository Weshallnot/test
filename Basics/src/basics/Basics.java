package basics;

import java.util.*;

class Basics {
     int a,b,c;
       void  addition()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num");
        a=sc.nextInt();
        System.out.println("enter second num");
        b=sc.nextInt();
        c=(a+b);
        System.out.println("sum is " +c);
    }
      /*static void subtraction()
      {
         Scanner sc=new Scanner(System.in);
       // System.out.println("enter first num");
         a=sc.nextInt();
       // System.out.println("enter second num");
         b=sc.nextInt();
         c=(a-b);
        System.out.println("sub is " +c);
      
      }*/
        public static void main(String[] args) {
            Basics bs = new Basics();
        bs.addition();
        //subtraction();

    }
    
}
