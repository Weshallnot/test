
import java.util.*;

public class Assignment1a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter the Name");
        name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            int ascii = (int) name.charAt(i);

            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                //System.out.println("valid");
            
            }
            //System.out.println("valid");
            else{

}
 {
                System.out.println("Invalid name format");
                //break;
            }

        }
        //System.out.println("You have entered valid name,please enter phone number");

    }
}  //System.out.println("Enter the phone munber");
