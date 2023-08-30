
/*public class Cat extends AnimalSound{
        void sound(){
            System.out.println("maeuooo sound");
        }
        
}


*/
import java.util.*;

public class Cat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.println("ENTER THE NUMBERS");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("NUMBER BEFORE SWAP WERE " + a + " and" + b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("NUMBERS AFTER SWAPPING ARE " + a + " and " + b);

    }

}
