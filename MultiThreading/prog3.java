//Question 4)
//Print odd number 
package MultiThreading;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MultiThreadDemo1 implements Runnable {

    public void run() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Enter the range from which number upto which nummber  : ");
            int number1 = Integer.parseInt(br.readLine());
            int number2 = Integer.parseInt(br.readLine());
            for (int i = number1; i <= number2; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        } catch (IOException ie) {
            System.out.println("I0Exception Caught ");
        }
    }

    public static void main(String[] args) {
    
        MultiThreadDemo1 mt1 = new MultiThreadDemo1();
      

        Thread t = new Thread(mt1);
    
        t.start();
    }
}
    
    