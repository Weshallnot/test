
import java.util.*;

public class IncomeTax{

    static void IncTax() {
        Scanner sc = new Scanner(System.in);
        int Salary, addAmt;
        double Tax;
        System.out.println("Enter the income of the Employee to Check the Tax to be Paid = ");
        Salary = sc.nextInt();
        if (Salary < 50000) {
            System.out.println(" No Tax to be Paid");
        } else if (Salary < 60000) {
            addAmt = Salary - 50000;
            Tax = addAmt / 10.0;
            System.out.println(" Tax to be Paid = " + Tax);
        } else if (Salary < 150000) {
            addAmt = Salary - 50000;
            Tax = addAmt * (20.0 / 100);
            System.out.println(" Tax to be Paid = " + Tax);
        } else {
            addAmt = Salary - 50000;
            Tax = addAmt * (30.0 / 100);
            System.out.println("3.Income Tax to be Paid = " + Tax);
        }
    }

    public static void main(String[] args) {
        IncTax();
    }
}
