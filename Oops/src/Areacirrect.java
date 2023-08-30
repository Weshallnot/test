import java.util.*;
public class Areacirrect{
    Scanner sc=new Scanner(System.in);
    static double r,a,b,c;
    void circlerectangle(double r){
       // Scanner sc=new Scanner(System.in);
        //r=sc.nextDouble();
        double b=(3.14*(r*r));
        System.out.println("AREA OF CIRCLE IS:"+b);
    }
    void circlerectangle(double a,double b){
       // System.out.println("Enter length of rectangle");
        //a=sc.nextDouble();
        //System.out.println("Enter breadth of rectangle");
        //b=sc.nextDouble();
        //c=(a*b);
        System.out.println("AREA OF RECTANGLE IS:"+(a*b));
    }
    public static void main(String[] args) {
        Areacirrect rc=new Areacirrect();
        rc.circlerectangle(3);
        rc.circlerectangle(12,2);
    }
    
}
