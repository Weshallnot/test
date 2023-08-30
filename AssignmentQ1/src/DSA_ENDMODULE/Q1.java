package DSA_ENDMODULE;//not able to take string as input in stack...

import java.util.Stack;
import javax.swing.text.html.HTML;

public class Q1{
   
   
    public static void main(String[] args) {
      char arr[]={'s','a','g','a','r'};
      String s="sagar";
        System.out.println("Regular String is: "+s);
      Stack<Character> st = new Stack<Character>();
      //for(int i=0; i<arr.length(); i++) {
            //st.push(arr.charAt(i));
        
StringBuilder reversed = new StringBuilder(s);
        System.out.println("String after reversed is: "+reversed.reverse());
    }
}