
package WEEKLY2;
class THREAD1 extends Thread{

    @Override
    public void run() {
        synchronized(this){
       System.out.println("I AM FROM THREAD 1");
        
    }
       }
}
class THREAD2 extends Thread{

    @Override
    public void run() {
        synchronized(this){
        System.out.println("I AM FROM THREAD 2");
    }
    }
}
class THREAD3 extends Thread{

    @Override
    public void run() {
        synchronized(this){
        System.out.println("I AM FROM THREAD 3");
    }
    }
}
public class Q1
{
    public static void main(String[] args) {
          THREAD1 T1=new THREAD1();
          THREAD2 T2=new THREAD2();
          THREAD3 T3=new THREAD3();
        
         T1.setPriority(10);
         T2.setPriority(5);
         T3.setPriority(10);
        T1.start();
        T2.start();
        T3.start();
    }
}
