package thread.syn;
public class Synch implements Runnable{
    static int k=0;
    @Override
    public void run() {
        synchronized(this){
        for(int i=0;i<10000;i++){
            k++;
            k--;
        }
        }
    }
    
    public static void main(String[] args) {
        Synch s=new Synch();
        Thread t[]=new Thread[1000];
        for(int i=0;i<t.length;i++){
            t[i]=new Thread(s);
            t[i].start();
        }
        
        System.out.println("Final Value of K = "+k);
    }
}
