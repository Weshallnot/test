/*
 public class Stringrev1 {

 public static void main(String[] args) {
 String str = "sagar baravkar";
 String strr = "";
 int a = str.length();
 for (int i = (a - 1); i >= 0; i--) {
 strr = strr + str.charAt(i);
 }

 System.out.println(" " + strr);
 }
 }
 */
//to reverse the string

import java.util.*;

public class Stringrev1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String a = sc.nextLine();
        String sa = "";
        int c = a.length();
        for (int i = (c - 1); i >= 0; i--) {
            sa = sa + a.charAt(i);
        }
        System.out.println(sa);
    }
}
