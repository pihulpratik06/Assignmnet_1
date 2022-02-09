package FileHandling;

import java.io.*;

class FileDemo {
    public static void main(String[] args) throws IOException {

        File f = new File("FileHandling/abc.txt");

        if (f.exists()) {
            System.out.println("File is present");
            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath());
            // System.out.println(f.getPath());
            System.out.println(f.getCanonicalPath());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.getParent());
            System.out.println(f.getParentFile());

        } else {
            System.out.println("File is not there");
        }

    }
}
