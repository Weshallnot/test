public class StaticBlock1 {
  static int num1=100;
  static int num2=200;
  static{
      num1+=1;
      num2+=1;
      //System.out.println("");
  
  }
  public static void main(String[] args) {
   num1+=5;
   num2+=10;
      System.out.println(num1+num2);
      
}
  static{
  num1=200;
  num2=300;
  }
}
