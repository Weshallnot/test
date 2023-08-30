public class Test1 extends Thread {
    @Override
    public void run(){synchronized(this){
        System.out.println("From thread T1");
        
            
        for (int i=2;i<=10;i=i+2) {
            System.out.println(i);
        }
    }
}
}
class Test2 extends Thread {
  
    @Override
    public void run() {
        System.out.println("From thread T2");
        for (int i=1;i<=10;i=i+2) {
            System.out.println(i);
        }
    }
}
class sagar {
    public static void main(String[] args) {
        Test1 T1 = new Test1();
        Test2 T2 = new Test2();
        T1.start();
        T2.start();
       }

}
