//method overloadinng problem not understood
/*
package inh;
public class POverride {
    void show(int a){
        System.out.println("Parent Show");
    }
    void display(){}
}
....

package inh;
public class COverride extends POverride{
    
    @Override
    void show(int x){
        System.out.println("Child Show");
    }
    
    void display(){
        System.out.println("Display");
    }
}

package inh;
public class TestOverride {
    public static void main(WrapperClass[] args) {
        POverride p=new COverride();
        p.show(10);
        p.display();
    }
}
*/

//package inh;

public class POverride {
    void show(int a){
        System.out.println("Parent Show");
    }
    void display(){}
}

public class COverride extends POverride{
    
    //@Override
    void show(int x){
        System.out.println("Child Show");
    }
    
    void display(){
        System.out.println("Display");
    }
}


public class TestOverride {
    public static void main(WrapperClass[] args) {
        POverride p=new COverride();
        p.show(10);
        p.display();
    }
}
