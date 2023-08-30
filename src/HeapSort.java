public class HeapSort {
    
    void buildHeap(int arr[],int size){
    int i;
    for(i=size/2;i>=0;i--)
        
     heapify(arr,i,size);
    
    }
    void heapify(int arr[],int index,int size){    
    int left=2*index+1;
    int right=left+1;
    int max=index;
    
    if(left<=size && arr[left]> arr[max])
        max=left;
    
   if(right<=size && arr[right]>arr[max])
       max=right;
   if(index != max){
   swap(arr,max,index);
       heapify(arr, index, size);
      }
        }
        void heapsort(int arr[],int size)
    {
        buildHeap(arr, size);
        while(size>0)
        {
        swap(arr,0,size);
        size--;
            heapify(arr, 0, size);
          
         
        }
        }
    void swap(int arr[],int max,int size){
     int t=arr[max];
     arr[max]=arr[size];
     arr[size]=t;
    }
    
    void print(int arr[]){
    for(int a:arr)
    System.out.println(" sorted array is "+a);
    
    }
             
    public static void main(String[] args) {
        HeapSort hs=new HeapSort();
        int arr[]={3,4,2,1,8,5,9};
        System.out.println("unsorted array is "+arr);
        int size=arr.length-1;
        hs.heapsort(arr, size);
        hs.print(arr);
    }
}
