//Reading the File
//Class--  FileInputStream
package FileHandling;

import java.io.*;

public class File2 {
       public static void main(String[] args) throws FileNotFoundException ,IOException {
           File f1=new File("FileHandling/Abcd.txt");
    
           FileInputStream fs=new FileInputStream(f1);
           if(f1.exists()){
             
            System.out.println("Here we are doing Reading operation");
             int i=0;
            while((i=fs.read())!=-1){
                  
                 System.out.print((char)i);

             }
             
             
           }
     else {
         System.out.println("File is not present");
     }          
           

       }
}
