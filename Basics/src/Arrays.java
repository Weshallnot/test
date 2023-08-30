interface A{};
class C{}
class D extends C{}
class B extends D implements A{}





public class Arrays extends Thread{
    
    public static void main(String[] args) {
        B b=new B();
        if(b instanceof C)
        {System.out.println("abcd");
        }
        if(b instanceof D)
        {System.out.println("pqrs");
        }
        if(b instanceof A)
        {System.out.println("asdvhsvdsj");
        }
    }
}
