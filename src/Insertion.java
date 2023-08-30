
import java.nio.file.Files;

public class Insertion{

        public void sort(int size,int arr[]){
       for(int i=1;i<size;i++)
       {int value=arr[i];
       int index=i;
       while(index > 0 && arr[index-1]>arr[index])
       {
           int temp=arr[index];
           arr[index]=arr[index-1];
           arr[index-1]=temp;
           index--;
       
       }
       arr[index]=value;
       
       }
             for(int x:arr)
                System.out.println(" "+x);
            
        }
        public static void main(String[] args) {
            int arr[]={66,7,3,5,9};
        Insertion in=new Insertion();
        in.sort(arr.length, arr);
        
    }

}

