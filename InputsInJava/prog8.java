package InputsInJava;

import java.io.*;

class Demo{
   public static void main(String args[])
    {
        try
        {   String logFileName = args[0];
            File f = new File("InputsInJava/pratik.txt/");
            boolean grant = false;
            String password = "";
            int integer = 5;
            if (args.length == 2)
            {
                System.out.println("Checking command-line password");
                password = password + args[1];
                if (password.equals("Pratik_22085"))
                {
                    grant =  true;
                    System.out.println("Congratsss!!!!!!! You got the grant to Access.");
                }
                else
                    System.out.println("OOPS!!!!!!! Passwords do no match");
            }

            if (grant)
            {
                System.out.println("Your  Access is granted!");

                PrintWriter out = new PrintWriter(new FileOutputStream(f, true));
                FileInputStream fi_1=new FileInputStream(f);
                int i=0;
                while((i=fi_1.read())!=-1){
                    System.out.print((char) i);
                }
                out.println();
                out.print("Updated...");
                out.println();
                out.flush();
                out.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("an error has occured.");
        }
    }
}
