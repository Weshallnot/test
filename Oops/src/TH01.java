//creating 
public class TH01 extends Thread{
    int a=10,b=12,c;
    @Override
    public void run(){
        c=a+b;
        System.out.println("sum is: "+c);
    
    }
    }
    class TH02 extends Thread{
        int a=15,b=10;
        int c=a-b;
        @Override
        public void run(){
        System.out.println("sub is: "+c);

        }
    }

    class Sagar{
         
    public static void main(String[] args) {
        TH01 t1=new TH01();
        TH02 t2=new TH02();
       // TH01 t3=new TH01(); 
        t1.setName("first");
        t2.setName("second");
        //t3.setName("third");
        t1.setPriority(1);
        t2.setPriority(10);
        //t3.setPriority(9);
        //System.out.println(   t1.isAlive());
        //System.out.println(t1.getPriority());
        //System.out.println(t2.getPriority());
        //System.out.println(t3.getPriority());
        t1.start();
        //t1.start();
        t2.start();
        //t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        
      
    }


}
