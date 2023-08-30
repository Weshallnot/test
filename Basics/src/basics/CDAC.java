public class CDAC {
public static void main (String[] args) {
StringBuffer sb1 = new StringBuffer("ABC");
StringBuffer sb2 = new StringBuffer("ABC");
System.out.println("Prints:"+(sb1==sb2)+","+sb1.equals(sb2));
}
   
}