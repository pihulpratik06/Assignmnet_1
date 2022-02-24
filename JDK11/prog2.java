//Question 3
package JDK11;

class JDK11Update_2 {
    
    static final int allocateMem = 1024 * 1024 * 1024;
    static final int iterations = 20;

    public static void main(String[] args) {
        System.out.println("Allocating Memory");

        for (int i = 0; i < iterations; i++) {
            byte[] array = new byte[allocateMem];
        }
        System.out.println("Terminating");
    }
}

/**
 * Allocating Memory 
 * Terminating due to java.lang.OutOfMemoryError: Java heap
 *
 */