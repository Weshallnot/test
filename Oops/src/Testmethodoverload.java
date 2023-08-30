//polymorphism problem....when we use one thing in diff manners as per our requirements
//2 types....1.static poly...2.dynamic poly
/*1.under static poly...1)Method overloading:-here we create more than one method
 having same name but different signatures under a same class */
//signatures means parameters of a method:

import java.util.*;

public class Testmethodoverload {

    //Scanner sc = new Scanner(System.in);
    //float a,int b,int c;
    //   a = sc.next();
    // b = sc.nextInt();
    //c = sc.nextInt();
    void sagar(int a, int b) {
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        System.out.println(" " + (a + b));
    }

    void sagar(double a, double b) {
        //a = sc.nextInt();
        //b = sc.nextInt();
        System.out.println(" " + (a - b));
    }

    void sagar(int a, int b, int c) {
        // a = sc.nextInt();
        //b = sc.nextInt();
        //c = sc.nextInt();
        System.out.println(" " + (a * b * c));
    }

    public static void main(String[] args) {
        Testmethodoverload st = new Testmethodoverload();
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("ENTER THE FIRST NUMBER");
        a = sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        b = sc.nextInt();
        st.sagar(a, b);
        st.sagar(123.23, 120.56);
        st.sagar(4, 4, 5);

    }
}
