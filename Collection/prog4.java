//Program 4)
package Collection;
import java.util.Iterator;
import java.util.Stack;

class ListDemo_4 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(20);
        stack.push(30);
        stack.push(200);
        stack.push(300);
        stack.push(140);
        stack.push(null);
        stack.push(30);
        stack.pop();
        Iterator<Integer> i=stack.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");
        System.out.println(stack.peek());

    }
}
/*
 * null - Allowed 
 * Duplicate Elements - 
 * Allowed Order - Insertion 
 * ********************OUTPUT********
 * Duplicate Elements - Allowed
 *  20 30 2 3 140 null null
 */ 
