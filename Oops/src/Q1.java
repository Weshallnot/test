import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        char[] charArray = {'S','A','G','A','R'};
        int a = 0;
        int b = charArray.length - 1;
        while (a < b) {
            char temp = charArray[a];
            charArray[a] = charArray[b];
            charArray[b] = temp;
            a++;
            b--;
        }
        System.out.println("Reversed char array: "+ Arrays.toString(charArray));

    }

}