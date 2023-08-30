import java.util.Scanner;


public class CliQ7 {
    void show(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+n+" element");
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sumE=0,cnt=0,count=0,sumO=0;
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]%2==0)
            {
                sumE=sumE+arr[k];
                cnt++;
                
            }
            else if(arr[k]%2!=0)
            {
                sumO=sumO+arr[k];
                count++;
               
            }
        }
        int Avg=sumE/cnt;
        int Avg1=sumO/count;
        System.out.println("sum of even number = "+sumE);
         System.out.println("sum of odd number = "+sumO);
        System.out.println("Average of even numbers ="+Avg+"\n Average of odd number ="+Avg1);
    }
    public static void main(String[] args) {
        CliQ7 ab=new CliQ7();
        int n=Integer.parseInt(args[0]);
        ab.show(n);
    }
}