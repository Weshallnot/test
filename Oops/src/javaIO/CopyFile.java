package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
     static void showFile() throws FileNotFoundException, IOException{
        int i=0;
        FileInputStream fin=new FileInputStream("C:\\Users\\Sagar\\Downloads\\cdac\\cdac\\admin\\Employee.java");
        FileOutputStream fout=new FileOutputStream("C:\\Users\\Sagar\\Downloads\\cdac\\emplo.java");
        while(i!= -1){
          i=fin.read();
          fout.write(i);
           // System.out.println("File Copied");
        }
        System.out.println("File Copied");
    }
    public static void main(String[] args)throws FileNotFoundException, IOException {
        showFile();
    }
}

