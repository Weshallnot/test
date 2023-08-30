public class ST {
    int top=-1;
    int size;
    int arr[];

    public ST(int size) {
        this.size = size;
        arr= new int[size];
        //this.arr = arr;
    }
     public boolean isempty(){
     if(top==-1)
         return true;
     else
         return false;
     }

    
     
     public boolean isfull(){
     if(top==(size-1))
         return true;
     else
         return false;
    }
     
     public void push(int value){
     if(isfull())
             System.out.println("STACK IS FULL");
     else
     {      top++;
            arr[top]=value;
            System.out.println("ELEMENT ADDED TO STACK "+arr[top]);
     }
        }
    public void peek(){
    if(isempty())
            System.out.println("STACK IS EMPTY");
    else
        
            System.out.println("ELEMENT PEEKED OUT FROM STACK "+arr[top]);
            ;
    }
    public void pop(){
    if(isempty())
            System.out.println("STACK IS EMPTY");
    else
            System.out.println("Element is popped from stack "+arr[top]);
            top--;
    }
    
    public static void main(String[] args) {
   ST sk=new ST(3);
   
   
   sk.push(3);
   sk.push(4);
   sk.push(5);
   sk.push(6);
    }   
    
    
    
}




