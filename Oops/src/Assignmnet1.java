//TAKE A INPUT OF NAME,MOBILE NUMBER AND EMAIL ADDRESS FROM USER AND CHECK VALIDITY OF EACH. 

import java.util.*;
public class Assignmnet1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the Name");
        name=sc.nextLine();
       
       
        for(int i=0; i<name.length(); i++){
        int ascii = (int)name.charAt(i);
            
        if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122)
        continue;
        else{
                System.out.println("Invalid name format");
                break;
        }
            
        }  
         System.out.println("You have entered valid name,please enter phone number");
        //System.out.println("Enter the phone munber");
        String phone;
        //System.out.println("Enter the phone munber");
        phone=sc.nextLine();
        for(int i=0;i<phone.length();i++){
            int Ascii = (int)phone.charAt(i);
            if(phone.length()== 10){
                if(Ascii>=48 && Ascii<=57){
                   // continue;
                }
                else{
                    System.out.println("Invalid phone number");
                    break;
                }
                
            }
            
        }
       System.out.println("You have entered valid phone number,please enter email ID");
        
       String mail;
       mail=sc.nextLine();
       int cnt1 = (int) mail.codePoints().filter(ch -> ch == '@').count();
       //long cnt2 = mail.codePoints().filter(ch -> ch == '.').count();
        //System.out.println(cnt1);

       //int j=mail.length();
      // for(int i=0;i<=j;i++);
       
       //if(cnt2 == 1)    
       if(mail.contains(".") && mail.contains("@") && cnt1==1 && mail.lastIndexOf(".")> mail.indexOf("@") )
      // if(mail.indexOf(".")> mail.indexOf("@")){
               System.out.println("YOU HAVE ENTERED ALL CORRECT DATA YOU CAN LOG IN");
              // }
           else{
               System.out.println("Invalid Email");
           }
       
       
       
       
       
       
       
       
        
    }
    
}
