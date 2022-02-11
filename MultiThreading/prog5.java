//Question 5
package MultiThreading;

class ThreadDemo2 extends Thread{
          
      public void run(){
           int i=0;
           while(i<2){
                System.out.println("We are completing Java assigment");
                i++;
           }

      }
}
class MainDemo4{
 
      public static void main(String[] args) {
          

             ThreadDemo2 t=new ThreadDemo2();

             t.start();
             t.run();

      }
     
}
