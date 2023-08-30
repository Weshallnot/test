import java.util.*;
class Square{
 void sagar(){
 Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number to find square of it");
     int a=sc.nextInt();
     int b=(a*a);
     System.out.println("Number="+a+"SquareofNumber="+b);
 }
    public static void main(String[] args) {
        Square sq=new Square();
        sq.sagar();
        
    }

}