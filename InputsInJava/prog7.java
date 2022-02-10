package InputsInJava;

import java.io.Console;
import java.io.PrintWriter;

class PrintWriterDemo {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter Name: ");
        String name;
        name = c.readLine();
        System.out.println("Name:"+name);
        System.out.println("Enter Password");
        char[] password = c.readPassword();
        String pwd = new String(password);
        System.out.println("Password Entered is: " + pwd);
        PrintWriter out = c.writer();
        out.println("Writer() method");
        String format = "%34&$%";
        c.printf(format, "Emp_NAME", "Emp_PROJECT");

        c.printf(format, "Siri", "ML");
        c.printf(format, "MicroController", "Linux");
        c.flush();
    }
}