package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Collect01 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Ramesh");
        al.add("Suresh");
        al.add("Dinesh");
        al.add(0,"sagar");
        System.out.println(al);
        Collections.sort(al);
        //Simple Loop
//        for(int i=0;i<al.size();i++)
//        {
//            System.out.print(al.get(i)+"\t");
//        }
        
        //for-each loop
//        for(String s:al){
//            System.out.println(s);
//        }
        
        //Iterarator
        
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
//        ListIterator lit=al.listIterator(al.size());
//        while(lit.hasPrevious()){
//            System.out.println(lit.previous());
//        }
    }
}
