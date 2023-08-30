/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint;

/**
 *
 * @author Sagar
 */
public class Threadrun implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        
    }
    
    public static void main(String[] args) {
        Thread thread=new Thread(new Threadrun());
        thread.run();
        thread.run();
        thread.start();
        
    }
    
}
