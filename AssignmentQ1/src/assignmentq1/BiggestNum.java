//2.Findout biggest between3 integer usingternary operator, 3 numbers should
//comefromcommandline.
//import java.util.*;
//package assignmentq1;
public class BiggestNum {
   void GreaterNum(int a,int b,int c){
   int bigger;
   bigger=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
       System.out.println("Biggest Number Among "+a+" "+b+" and "+c+" is "+bigger);
  }
    public static void main(String[] args) {
    BiggestNum bg=new BiggestNum();
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int c=Integer.parseInt(args[2]);
    bg.GreaterNum(a,b,c);
}
}