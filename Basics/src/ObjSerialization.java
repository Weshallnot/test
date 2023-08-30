
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.*;
import java.util.logging.Logger;

public class ObjSerialization implements Serializable {
    int id;
    String name;
    
    public ObjSerialization(int id,String name){
    this.id=id;
    this.name=name;
    }
    public static void main(String[] args) 
            
            
            
 throws Exception{
         ObjSerialization obj=new ObjSerialization(101,"Sagar");
         String name="file1.txt";
         
         
         FileOutputStream file= new FileOutputStream(name);
         ObjectOutputStream out=new ObjectOutputStream(file);
         out.writeObject(obj);
         System.out.println("seri done"); 
         
         ObjSerialization obj1=null;
         
         FileInputStream fis=new FileInputStream(name);
         ObjectInputStream ois=new ObjectInputStream(fis);
         
         obj1=(ObjSerialization)ois.readObject();
         System.out.println(obj1.id+"   "+obj1.name);
        
}
}
