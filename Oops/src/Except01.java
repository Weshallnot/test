//package excp;
public class Except01 {
    int x = 12;
    int y = 0;
    int arr[]={1,2,3};
    void emergencyCall(){
        System.out.println("It's Emergency call");
    }
    void show() {
        System.out.println("C");
        try{
        int z = x / y;
        arr[4]=100;
        System.out.println("D");
        System.out.println("Value of z= "+z);
        }
        catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println("Catch execute");
            System.out.println(e);
            emergencyCall();
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Catch execute");
//            System.out.println(e);
//            emergencyCall();
//        }
//        catch(Exception e){
//            System.out.println("Catch execute");
//            System.out.println(e);
//            emergencyCall();
//        }
        finally{
            System.out.println("Finally Executed");
        }
        System.out.println("E");
    
    }

    public static void main(String[] args) {
        System.out.println("A");
        Except01 o = new Except01();
        System.out.println("B");
        o.show();
        System.out.println("F");//Rest of the Programm
    }
}