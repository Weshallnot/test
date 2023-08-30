public class Merge {

    void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[(end - start) + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) { 
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        k = 0;
        for (i = start; i <= end; i++) {
            arr[i] = temp[k];
            k++;
        }
    }

    public static void main(String[] args) {
        Merge ms = new Merge();
        int arr[] = {3, 2, 5, 9, 1, 3, 6, 0};
        int start = 0;
        int end = arr.length - 1;

        System.out.print("Unsorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        ms.mergeSort(arr, start, end);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
