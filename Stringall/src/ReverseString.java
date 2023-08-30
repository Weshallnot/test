//TO REVERSE A STRING AND SUBSTRING FUNCTION
//import java.lang.*;
//public class ReverseString {
//    public static void main(String[] args) {
//        String s="gefyuegfyuegfeeu";
//         int b=s.length();
//        String sa="";
//        for(int i=(b-1);i>=0;i--){
//            sa=sa+s.charAt(i);
//        }
//         System.out.println(" "+sa);
//         System.out.println(" "+s.substring(2,5));
//    }
//}
public class ReverseString{
    public static void main(String[] args) {
        String s1="madam";
        String s2="";
        int a=s1.length();
        System.out.println(a);
        for(int i=(s1.length()-1);i>=0;i--)
        {
        s2+=s1.charAt(i);
          
        
        }           
        System.out.println("string after reversed "+s2);
        if(s1.equals(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}