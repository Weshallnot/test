//Java Program to demonstrate the use of static variable  
public class StaticVariable{  
   int rollno;  
   String name;  
   static String college ="IIM";  
        public StaticVariable(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
          void display (){System.out.println(rollno+" "+name+" "+college);} 
          
          
          static{
              System.out.println("i am static block");
          }
}
 class Static1{
     public static void main(String args[]){ 
      StaticVariable s1 = new StaticVariable(111,"Karan");  
      StaticVariable s2 = new StaticVariable(222,"Aryan");  
   
  
 
 s1.display();  
 s2.display(); 
 
 StaticVariable.college="IIT";
 
 s1.display();
 s2.display(); 
 }  
}  
