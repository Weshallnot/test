public class Quicksort {
    
        int partition(int arr[],int start,int end){
        int pIndex=start;
        int pivot=arr[end];
        int i;
        for(i=start;i<end;i++)
        {
        if(arr[i]<pivot){
        swap(arr,i,pIndex);
        pIndex++;
        }
        }
             
    swap(arr,end,pIndex);
    return pIndex;
    }
       
    void quicksort(int arr[],int start,int end){
    if(start<end){
        int pIndex;
        pIndex=partition(arr, start, end);
        quicksort(arr, start,pIndex-1);
        quicksort(arr, pIndex+1, end);
    }
    }
        
   void swap(int arr[],int a,int b){
     int t=arr[b];
     arr[b]=arr[a];
     arr[a]=t;
    }
    
    void print(int arr[]){
    for(int a:arr)
    System.out.println(a);
   
    }
   public static void main(String[] args) {
   Quicksort qs=new Quicksort();
   int arr[]={2,4,3,2,7,9,5};
   int start=0;
   int end=arr.length-1;
   System.out.println("Unsorted array is ");
       for (int i : arr) {
           System.out.println(i);
       }
   qs.quicksort(arr,start,end);
       System.out.println("Sorted array");
   qs.print(arr);
}
}
