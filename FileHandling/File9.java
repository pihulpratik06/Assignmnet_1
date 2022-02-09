package FileHandling;

import java.io.*;

 class BufferedReaderDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File f = new File("FileHandling/Abcd.txt");

        BufferedReader br = new BufferedReader(new FileReader(f));
        if (f.exists()) {
            int i = 0;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
        } else
            System.out.println("File is not there");
    }
}
