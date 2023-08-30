package Collection1;
import java.util.*;
public class Data1 {
    public static void main(String[] args) {
        List s1=new ArrayList(); 
       // List s2=new ArrayList(s1);
      s1.add(12);
      s1.add("sagar");
      s1.add(12.34465);
      s1.add('a');
      s1.add(-123.456);
      
      
        //System.out.println(s1);
      List s2=new ArrayList(s1);
       
       // s1.add(s1);
        System.out.println(s2);
    }
    
}
