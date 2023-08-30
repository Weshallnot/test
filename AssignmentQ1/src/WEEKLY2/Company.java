package WEEKLY2;
public class Company {
    int n;
    boolean f=false;
    public synchronized void produce_item(int n) throws InterruptedException{
        if(f){
            wait();
        }
        this.n=n;
        System.out.println("Produced "+this.n);
        f=true;
        notify();
    }
    
    public synchronized int consume_item() throws InterruptedException{
        if(!f){
            wait();
        }
        System.out.println("Consumed "+this.n);
        f=false;
        notify();
        return n;
    }
    public static void main(String[] args) {
        Company c=new Company();
        Producer pro=new Producer(c);
        Consumer con=new Consumer(c);
        
        pro.start();
        con.start();
        
    }
}