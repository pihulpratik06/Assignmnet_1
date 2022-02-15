// Program 1 
//
package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


 class ListDemo_1 {
    public static void main(String[] args) {
        List<Integer> list= new LinkedList<>();
        list.add(200);
        list.add(30);
        list.add(20);
        list.add(3);
        list.add(140);
        list.add(30);
        list.add(null);
        ListIterator<Integer> li = list.listIterator();
    
        while (li.hasNext()) {

        System.out.print(li.next() + " ");
        
    }
        System.out.println(list.isEmpty());
        System.out.println(list.subList(0, 2));
        System.out.println(list.toArray());
        System.out.println(list.contains(120));
        System.out.println(list.remove(0));
        System.out.println(list.contains(3));
        System.out.println(list.size());
        System.out.println(list.hashCode());

    }
}
/*
 * Specification null - Allowed Duplicate Elements - Allowed Order - Insertion
 * 
 * 
 * 
 * 200 30 20 3 140 30 null false 
 * [200, 30] 
 * 200 
 * false true
 *  6
 *  1765073474
 * [Ljava.lang.Object;@200a570f   // HashCode
 */

    
     
