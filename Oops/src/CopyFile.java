/*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int i=0;
        FileInputStream inp=new FileInputStream("C:\\Users\\Sagar\\Desktop\\PG-DAC Syllabus\\APTITUDE.pdf");
        FileOutputStream opt=new FileOutputStream("C:\\Users\\Sagar\\Desktop\\CORE JAVA\\NOTES\\APTITUDE.pdf");
       while(i != -1){
       i=inp.read();
       opt.write(i);
         System.out.println("File copied");
        }
                //System.out.println("File copied");

    }
    
}
*/
//package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
     static void showFile() throws FileNotFoundException, IOException{
        int i=0;
        FileInputStream fin=new FileInputStream("C:\\Users\\Sagar\\Desktop\\PG-DAC Syllabus\\APTITUDE.pdf");
        FileOutputStream fout=new FileOutputStream("C:\\Users\\Sagar\\Desktop\\CORE JAVA\\NOTES\\APTITUDE.pdf");
           while(i!= -1)
           i=fin.read();
           fout.write(i);
            System.out.print("File Copied");
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        showFile();
    }
}
