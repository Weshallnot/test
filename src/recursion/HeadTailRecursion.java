package recursion;

public class HeadTailRecursion {
    public void printCharhead(String str){
    if(str.length()==0)
        return;
        printCharhead(str.substring(1));//HEAD RECURSION....FUNCTION 
        System.out.println(str.charAt(0));
}
    public void printChartail(String str){
    if(str.length()==0)
        return;
        System.out.println(str.charAt(0));
        printChartail(str.substring(1));
}
    public static void main(String[] args) {
        HeadTailRecursion tr=new HeadTailRecursion();
        String s="CDAC";
        String s1="DAC";
        tr.printChartail(s);
        
        System.out.println("*****************");
        
        tr.printCharhead(s1);
    }
}

