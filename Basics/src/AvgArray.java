
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

public class AvgArray {
    
    
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int num;
   int sum=0;
   int avg=0;
   int count=0;
       System.out.println("Enter series of numbers you want:");
   List<Integer> list=new ArrayList<Integer>();
   for(;;){
   num=sc.nextInt();
   if(num>0){
       list.add(num);
   
   }
   else{
       break;
   }
   }
       for(Integer a:list){
       count++;
       sum+=a;
       }
   avg=(sum/count);
       System.out.println("Average of numbers you entered: "+avg);
}
 
}
