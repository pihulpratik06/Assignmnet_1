//Question 3)
//Checking the  methods in Thread class
package MultiThreading;

class MultiThreadDemo implements Runnable {

    public void run() {

        System.out.println("In Run method");

        System.out.println("Name of the Tread:" + Thread.currentThread().getName());

        for (int i = 1; i <= 3; i++) {

            System.out.println(" Welcome to Coditas ");
    

        }

    }

}

class MainDemo {

    static public void main(String[] args) {

        MultiThreadDemo mt = new MultiThreadDemo();
        MultiThreadDemo mt1 = new MultiThreadDemo();
        MultiThreadDemo mt2 = new MultiThreadDemo();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt1);
        Thread t3 = new Thread(mt2);

        t1.start();
        t2.start();
        t3.start();

        // Changing Name Thread 0 Thread 1 Thread 2
        t1.setName("Mt Thread");
        t2.setName("Mt1 Thread");
        t3.setName("Mt3 Thread");

        // Name of the main Thread
        System.out.println("Name of the Main Tread:" + Thread.currentThread().getName());

        // Setting priorities

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);

        for (int i = 1; i < 4; i++) {
            try {

                t1.sleep(1000);
                t2.join();

            } catch (InterruptedException w) {

            }
            System.out.println(" I am Pratik Pihul ");

        }

    }
}
/*
 * OutPut
 *  After changing  prirrity threadName and using sleep and join on t1 and t2 respectively
 * 
 * Name of the Main Tread:main 
 * In Run method 
 * In Run method
 *  In Run method
 *  Name of the Tread:Mt1 Thread 
 * Name of the Tread:Mt Thread
 *  Welcome to Coditas 
 * Welcome to Coditas 
 * Welcome to Coditas 
 * Welcome to Coditas
 *  Welcome to Coditas
 *  Welcome to Coditas
 *  Name of the Tread:Mt3 
 * Thread Welcome to Coditas
 *  Welcome to Coditas
 * Welcome to Coditas 
 * I am Pratik Pihul
 *  I am Pratik Pihul
 *  I am Pratik Pihul
 * 
 * 
 */