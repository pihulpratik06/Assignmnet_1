//Program 2)
package Collection;

import java.util.List;
import java.util.Vector;
import java.util.ListIterator;

class ListDemo_2 {

    public static void main(String[] args) {

        List<Integer> list = new Vector<>();
      
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
        
        System.out.println(list.remove(2));
        
        System.out.println(list.contains(30));
        
        System.out.println(list.contains(140));
        
        System.out.println(list.size());
        
        System.out.println(list.hashCode());
        
        System.out.println(list.subList(0, 3));
        
        System.out.println(list.toArray());
    }
}
/*
 * Spefication
 * 
 * null - Allowed Duplicate Elements - Allowed Order - Insertion
 * 
 * 
 * 
 * /**** Output******
 * 
 * 20 30 2 3 140 30 null false 
 * 2 
 * true 
 * true
 *  6
 *  1488017174 
 * [20, 30, 3]
 * [Ljava.lang.Object;@16b3fc9e
 * 
 * 
 */