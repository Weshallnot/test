package recursion;
public class IndirectRecursion{
    static int a=1;
    public void even(int a){
        if(a==11)
        return;
        System.out.println("even number "+a);
        ++a;
        odd(a);
    }
    public void odd(int a){
    if(a==11)
        return;
        System.out.println("odd number "+a);
        ++a;
        even(a);
          }
    public static void main(String[] args) {
       IndirectRecursion tc=new IndirectRecursion();
        tc.odd(a);
    }
    
}
