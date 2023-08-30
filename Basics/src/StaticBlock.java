
public class StaticBlock {
     static int a=10;
    static void show(){
        //static int c=34;
        System.out.println("from show method "+a);
    
    }
     static int b=0;
   static
     {
     
       System.out.println("from static block "+b);
   } 
    public static void main(String[] args) {
        //StaticBlock sb=new StaticBlock();
        show();
    }
}
