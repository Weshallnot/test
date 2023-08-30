package datatypes;
public class Programm1 {
    int amount;
    String currencyCode;
    
    
    public Programm1(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static void main(String[] args) {
     String s0="sagar";
     String s2="sagar";
     System.out.println(s0.equals(s2));
     
     String s=new String("sagar"); 
     String s1=new String("sagar");
     System.out.println(s.hashCode());
     System.out.println(s1.hashCode());
     System.out.println(s.equals(s1));
     System.out.println("from == operator "+(s==s1));
     Programm1 income = new Programm1(55, "INR");
     Programm1 expenses = new Programm1(55, "INR");
     System.out.println(income.hashCode());
     System.out.println(expenses.hashCode());
     System.out.println(income.equals(expenses));
       }
     
}