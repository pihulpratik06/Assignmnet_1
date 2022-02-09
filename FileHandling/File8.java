//Class ==Subclasses
package FileHandling;

import java.io.*;

class AllSubClasses {
    public static void main(String[] args) throws IOException {
        File f = new File("FileHandling/Abcd.txt");
        File f1 = new File("FileHandling/abc.txt");
        FileInputStream fin = new FileInputStream(f);
        FileInputStream fin1 = new FileInputStream(f1);
        DataInputStream din = new DataInputStream(fin);// Reading primitive data
        FileOutputStream fout = new FileOutputStream(f);
        DataOutputStream dout = new DataOutputStream(fout);// write primitive data  
        
        int i = 0;
        while ((i = din.read()) != -1) {
            System.out.print((char) i);
        }
        String str = "  Coditas has really a great work enviroment;";
        byte[] b = str.getBytes();
        fout.write(b);
        dout.write(b);
        fout.close();
        dout.close();

        System.out.println("After Close");
    }
}
