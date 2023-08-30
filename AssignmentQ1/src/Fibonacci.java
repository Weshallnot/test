
import java.util.Scanner;
public class Fibonacci {    
        public static void main(String[] args) {
        int n;
        int a=1;
        int b=2;
        int c;
            System.out.println("Enter the range of series");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            System.out.println("ENTER TWO INITIAL NUMBERS");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.print(a+" "+b);//initially it will print values as same as entered by user 
            
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
    }
    
}
