package DSA_ENDMODULE;

//Q4-Write a Java program to Queue using Array.
public class Q4{

    int rear = 0;
    int front = 0;
    int size;
    int arr[];

    public Q4(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isfull() {
        if (rear == size) {
            return true; 
        } else {
            return false;
        }
    }

    public boolean isempty() {
        if (rear == front) {
            if (rear == size) {
                rear = front = 0;
            }
            return true;
        } else {
            return false;
        }
    }

    void push(int s) {
        if (isfull()) {
            System.out.println("Please don't add further elements queue is full");
        } else {
            arr[rear] = s;
            System.out.println("Element is added to Queue" + arr[rear]);
        }
        rear++;
    }

    void pop() {
        if (isempty()) {
            System.out.println("Queue is empty,You can add elements to queue exactly equal to size");
        } else {
            System.out.println("Element is popped from Queue:" + arr[front]);
        }
        front++;
    }

    public static void main(String[] args) {
        Q4 qe = new Q4(5);
        System.out.println("Queue is implemented using array");
        

    }

}