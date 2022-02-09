package FileHandling;

import java.io.*;
class SequenceFileDemo {
    
     public static void main(String[] args) throws FileNotFoundException ,IOException{
      
          File f1 =new File("FileHandling/Abcd.txt"); 
          File f2 =new File("FileHandling/abc.txt"); 
 

         FileInputStream fout1=new FileInputStream(f1);
         FileInputStream fout2=new FileInputStream(f2);
         
         SequenceInputStream s1=new SequenceInputStream(fout1,fout2);
          
           int i=0;

           while((i=s1.read())!=-1){ 
               
                System.out.print((char)i);
             
            
           }
           
       

    
    }

     
}
