//5. WAP to print all the prime numbers in an array of n elements by taking
//commandlineArguments.

import java.util.*;
public class PrimeArray {
    public static void main(String[] args) {
   int arr[]=new int[5];
    //arr[]=Integer.parseInt(args[]);
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<5;i++){
   arr[i]=sc.nextInt();
   }
   for(int i=0; i<arr.length; i++){
        boolean isPrime = true;
        
        for (int j=2; j<i; j++){

            if(i%j==0){
                isPrime = false;
                break;
            }
        }
        
    if(isPrime)

            System.out.println(i+" are the prime numbers in the array ");
    }
   
}
}