
public class Except {
    
    int a=10;
    int b=0;
    void sample(){
    
        System.out.println("Sample method executed");
    }
    
    void add(){
    try{
    int c=a/b;
        System.out.println("sum is "+c);
    }
    catch(Exception e)
    {System.out.println("executed");
        System.out.println(e);
    }
    finally{
        System.out.println("FINALLY EXECUTED");
        sample();
    
    }
        sub();
    } 
    void sub(){
    int c=a-b;
        System.out.println("sub is "+c);
        sample();
    }
    public static void main(String[] args) {
        Except e=new Except();
        e.add();
//        e.sub();
        //e.add();
    }
    
    }
    


