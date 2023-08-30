package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList{
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(177);
        //ls.println(ls);
        //int a=ls.get(0);
        
        System.out.println(ls.get(2));//retrieving arraylist element at specified index
        ls.add(0,351);//inserting arraylist element in its first position
        System.out.println(ls);
        Collections.sort(ls);//sorting arraylist elements in ascending order 
        System.out.println(ls);

        Collections.reverse(ls);//sorting array elements in descending order
        System.out.println(ls);
        

    }
}/*
package col.mp;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //Does not follow the squence and order
        Map<Integer,String> m1=new HashMap<>();
        m1.put(101, "Ramesh");
        m1.put(102, "Jayesh");
        m1.put(104, "Dinesh");
        m1.put(103, "Suresh");
        System.out.println(m1);
        
        
        //Follows the Sequernce but not order
        Map<Integer,String> m2=new LinkedHashMap<>();
        m2.put(101, "Ramesh");
        m2.put(102, "Jayesh");
        m2.put(104, "Dinesh");
        m2.put(103, "Suresh");
        System.out.println(m2);
        //Does not follow Sequence but follow Order on the basis of key
        Map<Integer,String> m3=new TreeMap<>(Collections.reverseOrder());
         m3.put(101, "Ramesh");
        m3.put(102, "Jayesh");
        m3.put(104, "Dinesh");
        m3.put(103, "Suresh");
        System.out.println(m3);
        
        System.out.println(m3.get(104));
        
         
        for(Map.Entry e:m3.entrySet())
            System.out.println(e.getKey()+":"+e.getValue());
       
    }
}

*/