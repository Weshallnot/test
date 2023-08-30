public class ThisDemo {
    int a=10;
    void display(){
        System.out.println("Display");
    }
    void show(int a){
        //int a=100;
        //this.a=a;
        System.out.println("a= "+a);
        System.out.println("instance a= "+this.a);
       //this.display();
    }
    public static void main(String[] args) {
   ThisDemo td=new ThisDemo();
   td.show(1000);
   
}
}
