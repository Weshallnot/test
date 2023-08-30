public class LinkedList {
    public static void displayRecursion(Node head){
    if(head==null) return;
        System.out.println(head.data+" ");
        displayRecursion(head.next);
    }
    public static void display(Node head){
    while(head!=null){
        System.out.println(head.data+" ");
        head=head.next;
    } 
    }
    public static class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
    }
    public static void main(String[] args) {
   Node a=new Node(6);
   Node b=new Node(7);
   Node c=new Node(68);
   Node d=new Node(6);
   Node e=new Node(61);
   Node f=new Node(60);
   a.next=b;
   b.next=c;
   c.next=d;
   d.next=e;
   e.next=f;
//   Node temp=a;
//   while(temp!=null){
//       System.out.println(temp.data);
//       temp=temp.next;
//   }
        System.out.println("Without recursion");
        display(a);
        System.out.println("with recursion");
        displayRecursion(a);
}
}
