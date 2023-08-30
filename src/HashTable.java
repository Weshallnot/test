
import java.util.Hashtable;

public class HashTable 
{
    static final int size=5;
    int arr[]=new int [size];

    public HashTable(){
        
        int i;
        for(i=0;i<size;i++)
            arr[i]=-1;
        
    }
     public int insert(int value){
     int key=value%size;
     int index=key;
     while(arr[index] != -1){
     
         index=(index+1)%size;
         if(index==key){
             System.out.println("hash table full");
         }
     }
     
     arr[index]=value;
     return 1;
     }
     
     public int del(int value){
     int key=value % size;
     int index=key;
     while(arr[index] != value){
         index=(index+1)%size;
         if(index==key)
             return 0;
     
     }
     
     arr[index]=-1;
     return 1;
     
     }
     
     
     public void print(){
     for(int a:arr)
             System.out.println(" "+a);
     }
       
    
    
    
   public static void main(String[] args) {
   Hashtable ht=new Hashtable();
   int value=23;
   //ht.insert(value);
   
}
}
