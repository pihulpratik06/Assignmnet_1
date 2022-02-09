// class -- DataInputStream

//If we want to Insert the data
package FileHandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class DataInputDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fout = new FileInputStream("FileHandling/abc.txt");

        DataInputStream dt = new DataInputStream(fout);

        int i = fout.available();
        // available return remaining bytes
        byte[] ary = new byte[i];
        dt.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+"-");

        }
    }
}
