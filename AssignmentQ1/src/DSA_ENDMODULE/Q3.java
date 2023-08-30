package DSA_ENDMODULE;

import java.io.*;
import java.util.*;

public class Q3
{
    private int V;                              
    private LinkedList<Integer> adj[];             
    private Queue<Integer> queue;                  
 
    Q3(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
    public static void main(String[] args) {
        Q3 sc=new Q3(5);
        
        
    }
}