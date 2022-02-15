//Program3)
package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

class ListDemo_3 {
    public static void main(String[] args) {
        List<Integer> list = new Stack<>();
       
        list.add(200);
       
        list.add(30);
       
        list.add(20);
       
        list.add(3);
       
        list.add(140);
       
        list.add(30);
       
        list.add(null);
        
        Iterator<Integer> i = list.iterator();
       
        while (i.hasNext()) {
       
            System.out.print(i.next() + " ");
       
        }
       
        System.out.println(list.get(3));
       
        System.out.println(list.isEmpty());
       
        System.out.println(list.remove(3));
       
        System.out.println(list.contains(10));
       
        System.out.println(list.contains(140));
       
        System.out.println(list.size());
       
        System.out.println(list.hashCode());
       
        System.out.println(list.subList(0, 3));
       
        System.out.println(list.toArray());
    }
}

/*
 * null - Allowed Duplicate Elements - Allowed Order - Insertion
 * **************OUTPUT********
 *  200 30 20 3 140 30 null 3 false 
 * 3
 *  false
 *  true
 *  6
 * -1948163791
 *  [200, 30, 20]
 *  [Ljava.lang.Object;@e2d56bf
 */
