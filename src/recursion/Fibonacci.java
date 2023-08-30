package recursion;
public class Fibonacci {
    public int fib(int n){
        if(n<=1)
            return n;   
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        int n=5;
        System.out.println(f.fib(n));
    }
    
}
