package Collection1;
public class ToStringMethod {
    int id;
    String name;
    double marks;

    ToStringMethod(int id,String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString(){
    return +id+" "+name+" "+marks;
       // return s1;
    }
    
    public static void main(String[] args) {
        ToStringMethod s1=new ToStringMethod(123,"sagar",50);
        ToStringMethod s2=new ToStringMethod(345,"shree",60);
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
