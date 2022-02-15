//Program3)
package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

 class List3Demo {
    public static void main(String[] args) {
        List<Integer> list4 = new Stack<>();
        list4.add(200);
        list4.add(30);
        list4.add(20);
        list4.add(3);
        list4.add(140);
        list4.add(30);
        list4.add(null);
        Iterator<Integer> i = list4.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");
        System.out.println(list4.get(3));
        System.out.println(list4.isEmpty());
        System.out.println(list4.remove(3));
        System.out.println(list4.contains(10));
    }
}
/*
 * null - Allowed 
 * Duplicate Elements - Allowed 
 * Order - Insertion 
 * **************OUTPUT********
 * 
 * 200 30 20 3 140 30 null 3 
 * false
 *  3
 *  false
 */
  