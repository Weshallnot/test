import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //String c="";
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        StringBuffer sb=new StringBuffer(A);
        //System.out.println(sb.reverse());
        //String b=sb.reverse();
        
        String a="";
        int i;
        String res="";
        for(i=A.length();i>=0;i--)
        {
             res=A.substring(i);

        }
        //System.out.println(b);
        if(res.equals(A)){
           System.out.println("Yes");
       }
        else{
            System.out.println("No");
        }
        
    }
}




