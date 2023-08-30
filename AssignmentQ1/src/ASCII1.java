
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import java.util.Scanner;


public class ASCII1 {
                          // PRINTING THE ASCII VALUES OF CHARACTERS//
    static boolean val1;
    static double val2;
    static float val3;
    static int val4;
    static long val5;
    static String val6;

    public static void main(String[] args) {
        System.out.println("Default values.....");
        System.out.println("Val1 = " + val1);
        System.out.println("Val2 = " + val2);
        System.out.println("Val3 = " + val3);
        System.out.println("Val4 = " + val4);
        System.out.println("Val5 = " + val5);
        System.out.println("Val6 = " + val6);
    }
}                            //CALCULATING POWER OF A NUMBER
/*
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        int d=(int)Math.pow(a, b);
        System.out.println("Base is "+a+" and power is "+b+" and answer is "+d);
    }
  
    
               //SWAPPING OF TWO NUMBERS WITHOUT THIRD VARIABLES//
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number one by one");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        
        
          System.out.println("numbers before swapping are "+a+"    "+b);
          
          temp=a;
          a=b;
          b=temp;
           System.out.println("numbers after"
                   + " swapping are "+a+"    "+b);        
    }
}           //SWAPPNG TWO VARIABLES WITHOUT USING THIRD VARIABLE


    public static void main(String[] args) {
        int a=12;
        int b=10;
        System.out.println("before"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("after"+a+" "+b);
    }
                //AREA AND PERIMETER OF CIRCLE USING DIFFERENT CLASSES//

void show1(){
int rad=0;
Scanner sc = new Scanner(System.in);
rad=sc.nextInt();
double result=(3.14*rad*rad);
System.out.println("AREA OF CIRCLE IS "+result);

}
}
class Ascii extends ASCII1{
void show(){
int rad=0;
Scanner sc = new Scanner(System.in);
rad=sc.nextInt();
double result=(3.14*2*rad);
System.out.println("circumference OF CIRCLE IS "+result);
}
    public static void main(String[] args) {
        Ascii a=new Ascii();
        a.show();
        a.show1();
    }

            //TO CALCULATE COMPOUND INTEREST//
    
    
   public static void main (String args[]){
      double principle, rate, time, ci;
      principle = 100000;
      rate = 5;
      time = 3;
      ci= principle * (Math.pow((1 + rate / 100), time)) - principle;
      System.out.println("The Compound Interest is: " +ci);
   }
}
    |
    
    
         //FINDING ASCII VALUE OF CHARACTER
    public static void main(String[] args) {
        
    
char as='k';
int ascii=as;
        System.out.println(ascii);


     
}              //FABONACCI SERIES//
//import java.util.*;
//class FibonNumSeries{  
public static void main(String args[])  
{    
 int a=0,b=1,c,i,n;
 Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number for range");
    n=sc.nextInt();
 
 System.out.print(a+" "+b);//printing 0 and 1 a=0 and b=1   
    
 for(i=1;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  c=a+b;    
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
    System.out.println("");
}}  

public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        //b=sc.nextInt();
        
        int d=(int)Math.pow(a,0.5);
        System.out.println("Base is "+a+" and power is and answer is "+d);
    }



    final int a=10;
    static void sagar(){
    System.out.println(a);
}
    public static void main(String[] args) {
        //ASCII1 s=new ASCII1();
        sagar();
    }
    */
