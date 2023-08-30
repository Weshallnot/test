package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    static void showFile()throws FileNotFoundException, IOException{
        int i=0;
        FileInputStream fin=new FileInputStream("C:\\Intel\\vowelss.txt");
        while(i!= -1){
           i=fin.read();
            System.out.print((char)i);
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        showFile();
    }
}
