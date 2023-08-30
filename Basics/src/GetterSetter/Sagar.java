package GetterSetter;
public class Sagar{
    private int s1;
    private  String s2;
    public int getS1(){
    return s1;
    }
    public void setS1(int s1){
        if(s1>0)
        this.s1 = s1;
        System.out.println(this.s1);
    }
    public String getS2() {
    return s2;
    }
    public void setS2(String s2) {
        this.s2 = s2;
    }
   
}
