package odd;

public class HunToOne {
    
    public static void main(String[] args) {
        System.out.println("Printing odd numbers between 100 to 1000 which are divisible by 5");
        for(int i=100;i<=1000;i++){
            
        if((i%2 != 0) && (i%5==0)){
            
            System.out.println("odd numbers are "+i);
            
        }
            
        }
    }
    
}
