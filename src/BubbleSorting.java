
import java.util.Arrays;


public class BubbleSorting {
//   static void swap(int arr[],int i,int j){
//        int t=arr[j];
//        arr[j]=arr[j+1];
//        arr[j+1]=t;
//    } 
    
    void sort(int arr[]){
        int i,j,t=0;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                   t=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=t;
            }
        }
        }
}
    public static void main(String[] args) {
        int arr[]={7,6,5,4,9,1};
        BubbleSorting s=new BubbleSorting();
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

