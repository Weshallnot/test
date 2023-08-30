package odd;

import java.util.Scanner;

public class BankingApp {
     private static float avlbal=10000;
     private static float withdraamount=3000;
     private static float credamount;
     
    private  float getbalance(){
        
        return (avlbal+credamount);
       
        
    
    }
    private  float withdrawl(){
        
        return (avlbal-withdraamount);
       
        
    
    }
    private  float credit(){
       credamount=1200;
       //getbalance();    
    return (avlbal+credamount);
    }
    
    public static void main(String[] args) {
       BankingApp bp=new BankingApp();
       System.out.println("After creditnig balnce is :"+bp.credit());
       //System.out.println("After creditnig balnce is :"+bp.getbalance());
       System.out.println("After withdrawing balnce is :"+bp.withdrawl());
    } 
    
}
