
import java.io.*;
import java.util.LinkedList;
class Q2 {
    public static void main(String[] args)
    {
     LinkedList<String> ll = new LinkedList<String>();
  
       
        ll.add("sagar");
        ll.add("jayesh");
        ll.add("kshitij");
    System.out.println("after addition of values list is: "+ll);

     for (int i = 0; i < ll.size(); i++) {
     System.out.println("Element at index " + i+ " is: " + ll.get(i));
        }
    }
}