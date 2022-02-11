//Question 1
//Can we restart a Thread

package MultiThreading;

class StartDemo extends Thread{
   
        public void run(){ 
              
             System.out.println("Can we restart the thread??");
             
        }
     
}
class MainDemo3{
       
        public static void main(String[] args) {
             
            
             StartDemo t=new StartDemo();

             t.start();
             t.start(); // Exception is caught here . 


             
            
        }
 }

 /*
  * Output
  * 
  * Can we restart the thread?? 
     Exception in thread "main"
  * java.lang.IllegalThreadStateException at
  * java.base/java.lang.Thread.start(Thread.java:794) at
  * MultiThreading.MainDemo3.main(prog1.java:21)
  * 
  * 
  */