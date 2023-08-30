
public class Queue {

    int rear = 0;
    int front = 0;
    int size;
    int arr[];

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isfull() {
        if (rear == size) {
            return true; //System.out.println("QUEUE IS FULL");
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
            System.out.println("Queue is full");
        } else {
            arr[rear] = s;
            System.out.println("element added in queue " + arr[rear]);
        }
        rear++;
    }

    void pop() {
        if (isempty()) {
            System.out.println("queue is empty");
        } else {
            System.out.println("queue is popped " + arr[front]);
        }
        front++;
    }

    public static void main(String[] args) {
        Queue qe = new Queue(3);
        qe.push(34);
        qe.push(30);
        qe.push(67);
        qe.pop();
        int [] arr={1,2,3,4};
    }

}
