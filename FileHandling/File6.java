//class -- DataOutputDemo
package FileHandling;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputDemo {
     public static void main(String[] args) throws FileNotFoundException ,IOException  {
          
           FileOutputStream fout=new FileOutputStream("FileHandling/Abcd.txt");
         
        DataOutputStream dt = new DataOutputStream(fout);  
        dt.writeInt(65);  
        
        dt.flush();  
        dt.close();  
        System.out.println("This is changed by DataoutputStream");
   


     }
}
