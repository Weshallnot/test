
import java.nio.file.Files;


public class BinarySearch{
    
            int bsearch(int arr[],int start,int end,int key){
                int mid;
                while(start <= end)
                {mid=(start+end)/2;
                if(arr[mid]==key)
                    return 1;
                if(arr[mid]<key)
                    start=mid+1;
                else
                    end=mid-1;
                }
                return 0;
                
                
            }
         
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5}; 
        int start=0;
               
        int key=1;
        int size;
        int end=arr.length-1;
        BinarySearch bn=new BinarySearch();
        
        if(bn.bsearch(arr,start,end,key)==1)
            System.out.println("ELEMENT FOUND ");
        else
            System.out.println("ELEMENT NOT FOUND");
    }
    }
  

