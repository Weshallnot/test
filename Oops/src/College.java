
import java.util.Scanner;

public class College{
    public static void main(String[] args) {
   int a;
   Scanner sc=new Scanner(System.in);
        System.out.println("enter a positive number");
        a=sc.nextInt();
        int b=1;
        for(int i=1;i<=a;i++){
            b=b*i;
            //--a;
        }
        System.out.println(b);
}

}