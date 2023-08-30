import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] array = {25, 65, 80, 15, 77, 69};

        System.out.println("Original Array:");
        printArray(array);

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Sorted Array (Descending):");
        printArray(array);
    }

    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}





