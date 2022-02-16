//Prog2 
//
package Collection_1;

import java.util.*;

 class ArrayDequeDemo {
    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        
        deque.add("Pratik");
        
        deque.add("Sakshi");
        
        deque.add("Prachi");
        
        deque.add("Atharv");
        
        deque.add("Shubham");
        // Traversing elements
        
        for (String str : deque) {
        
            System.out.println(str);
        } 
       
        System.out.println("********Adding element to Deque*******");
       
        System.out.println(deque.add("Gavrav"));
        
        System.out.println("********After Adding element to Deque*******");
        
        for(String str : deque) {
            
            System.out.println(str);
            
        }
        
        System.out.println("Does it Contain: Pratik::"+deque.contains("Pratik"));
        System.out.println("Does it Contain: Barkha::"+deque.contains("Barkha"));
        
        System.out.println("poll()::"+deque.poll());
        System.out.println("pollFirst()::"+deque.pollFirst());
        
        System.out.println("peek()::"+deque.peek());
        System.out.println("peekFirst()::"+deque.peekFirst());
        
        System.out.println("isEmpty()::"+deque.isEmpty());
        
        System.out.println(deque.remove("Pratik"));  
        
        System.out.println("********After removing element of Deque*******");
        
        for (String str : deque) {
            
            System.out.println(str);
        }
        
        System.out.println("pop()::"+deque.pop());
        
        System.out.println("********After poping element of Deque*******");
   
        for (String str : deque) {

            System.out.println(str);
        }
        System.out.println("**************************");
   // Size()
        System.out.println(deque.size());
   
  
  
  
  
  
  
  
    }
}
