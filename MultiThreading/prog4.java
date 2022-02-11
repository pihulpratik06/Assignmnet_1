//Question 2
//Can we call run method explicitly

package MultiThreading;

class RunDemo extends Thread  {
       
        public void run(){
         
            System.out.println("In run method::");
        
        }
      public static void main(String[] args) {
      
        RunDemo r=new RunDemo();

        r.start();
        r.run();
        
          
          
    }
    
}

/*
 * Output
 * 
 * In run method::
 *  In run method::
 * 
 * Yes we can call the method explicitly
 */