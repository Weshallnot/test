
public class Nonstatic {
    
  static void a(){
 
     System.out.println("call to a");
 }
 
   static void b(){
     System.out.println("call to b");
     a();
 }
 
    public static void main(String[] args) {
        //Nonstatic n=new Nonstatic();
        a();
        b();
        //a();
    }
    
}
