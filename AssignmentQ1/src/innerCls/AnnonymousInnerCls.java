package innerCls;
class Parent{
    void getName(){
        System.out.println("I'm Parent");
    }
}

class noname{
    
    
    Parent po=new Parent(){
        @Override
        void getName() {
            System.out.println("I'm Child NO NAME");
        }
    };
}
public class AnnonymousInnerCls {
    public static void main(String[] args) {
        noname ob=new noname();
        ob.po.getName();
    }
}
