//Question 1
package JDK8;
 
class AdditionDemo extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++)
                System.out.println("Thread Running:: " + Thread.currentThread());
             Thread.sleep(100);
        } catch (Exception ae) {

            ae.printStackTrace();
            
        }
    }

}

 class  UpdatesDemo {
    public static void main(String[] args) throws Throwable {
        AdditionDemo obj1 = new AdditionDemo();
        AdditionDemo obj2 = new AdditionDemo();
        System.out.println(obj1.getClass());
        System.out.println(obj1.hashCode());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.toString());
        obj1.start();
        obj2.start();
    }
}

/*
 * 
 * class JDK8.AdditionDemo 
 * 1617791695
 *  false 
 * Thread[Thread-0,5,main] 
 * Thread
 * Running:: Thread[Thread-1,5,main] 
 * Thread Running:: Thread[Thread-0,5,main]
 * Thread Running:: Thread[Thread-1,5,main] 
 * Thread Running::Thread[Thread-0,5,main] 
 * Thread Running:: Thread[Thread-1,5,main] 
 * Thread Running:: Thread[Thread-0,5,main] 
 * Thread Running:: Thread[Thread-1,5,main]
 * Thread Running:: Thread[Thread-0,5,main] 
 * Thread Running::Thread[Thread-1,5,main] 
 * Thread Running:: Thread[Thread-0,5,main]
 * 
 * 
 * 
 */