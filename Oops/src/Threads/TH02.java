package Threads;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TH02 implements Runnable{
    
    

    @Override
    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TH02.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sagar");
        
    }
    
    public static void main(String[] args)  {
        TH02 t1=new TH02();
        Thread tt=new Thread(t1);
        tt.start();
       
    }
           
}
