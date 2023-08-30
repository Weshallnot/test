public class VarArgsMethod{
    
    public static void show(String str,int ... a){
        System.out.println("Number of arguments: "+a.length);
        System.out.println(str);
        
        for(int d:a){
            System.out.println(d);
        }
        
    }
public static void main(String[] args) {
    show("sagar");
    show("ajit",199);
    show("nandu",1,2,3,4,5,6);
   
}
}