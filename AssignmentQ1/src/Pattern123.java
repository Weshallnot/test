
public class Pattern123 {

    void pattern() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Pattern123 b = new Pattern123();
        b.pattern();
    }
}
