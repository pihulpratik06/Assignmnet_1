//Prog 1 
//Linked List implementation of Queue
//Checking all methods

package Collection_1;

import java.util.Queue;
import java.util.LinkedList;

class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        // Add elements to the Queue
        q1.add(10);

        q1.add(20);

        q1.add(30);

        q1.add(40);

        q1.add(50);

        q1.add(60);

        q1.add(70);

        q1.add(80);

        q1.add(90);

        q1.add(100);

        // Elements Initially
        System.out.println("Elements in Queue:" + q1);
        // Size of the Initail Queue
        System.out.println("Size of the  Initail Queue:" + q1.size());
        // Removing head of the queue
        System.out.println("Element removed from the queue: " + q1.remove());

        // Size of the Queue after removing the element:
        System.out.println("Size of the Queue after removing the element:" + q1.size());

        // Checking head
        System.out.println("Head of the queue: " + q1.element());

        // Checking the queue is empty is not
        System.out.println("Queue isEmpty() : " + q1.isEmpty());

        // Adding element to the queue
        System.out.println("Addiing element to queue : " + q1.add(110));

        // Elements after adding 110
        System.out.println("Elements in Queue:" + q1);

        // Checking Poll
        System.out.println("Poll():Returned Head of the queue: " + q1.poll());

        // Checking peek
        System.out.println("peek():Head of the queue: " + q1.peek());

        // using offer method without violating capacity

        System.out.println("Offer:: " + q1.offer(120));

        // Final Queue
        System.out.println("Final Queue:" + q1);

        // Size of the queue(final)
        System.out.println("Size of the  final Queue:" + q1.size());

    }
}
/*
 * ************** Output******* 
 * Elements in Queue:[10, 20, 30, 40, 50, 60, 70,80, 90, 100] 
 * Size of the Initail Queue:10 
 * Element removed from the queue: 10
 * Size of the Queue after removing the element:9 
 * Head of the queue: 20 
 * Queue isEmpty() : false 
 * Addiing element to queue : true 
 * Elements in Queue:[20, 30,40, 50, 60, 70, 80, 90, 100, 110]
 *  Poll():Returned Head of the queue: 20
 * peek():Head of the queue: 30 
 * Offer:: true 
 * Final Queue:[30, 40, 50, 60, 70,80, 90, 100, 110, 120] 
 * Size of the final Queue:10
 * 
 * 
 * 
 * 
 * 
 */