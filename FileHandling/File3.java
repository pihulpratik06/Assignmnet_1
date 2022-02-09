//Writing the file
//Class -- FileOutputStream 
package FileHandling;
import java.io.*;
class FileOutputStreamDemo{
       public static void main(String[] args) throws IOException,FileNotFoundException {
   
           File f=new File("FileHandling/Abcd.txt");
            
           FileOutputStream fout=new FileOutputStream(f);   
  
            if(f.exists()){
                  
                fout.write(65);

                String s="  , Hi I am Pratik Pihul.Founder and CEO of ThreadPoint ;";
                 
                 byte[] b=s.getBytes();

                  fout.write(b);
                 System.out.println("we are writing into the file");


            }
          else{
               System.out.println("File is not present");
          }        

       }
}