import java.util.*;
class FibonNumSeries{  
public static void main(String args[])  
{    
 int a=0,b=1,c,i,n;
 Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number for range");
    n=sc.nextInt();
 
 System.out.print(a+" "+b);//printing 0 and 1 a=0 and b=1   
    
 for(i=1;i<=n;i++)//loop starts from 2 because 0 and 1 are already printed    
 {    
  c=a+b;        
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
    //System.out.println("");
}}  
