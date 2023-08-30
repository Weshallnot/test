public class Selection {
    public void selectionSort(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;  
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("before Selection sort");
    }

    public static void main(String[] args) {
        Selection sc = new Selection();
        int arr[] = {1, 4, 2, 6, 3};
        int size = arr.length; 
        
        sc.selectionSort(arr, size); 
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
      System.out.println("After Selection sort");  
    }
}
