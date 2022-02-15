// Program 1 
//
package Collection;

import java.util.LinkedList;
import java.util.List;

 class ListDemo {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(100);
        list.add(305);
        list.add(200);
        list.add(355);
        list.add(140);
        list.add(300);
        list.add(null);
        for(Integer i:list){
            System.out.print(i+" ");
        }
    
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list.contains(140));

    }
}
/*
 * Specification 
 * null - Allowed 
 * Duplicate Elements - Allowed 
 * Order - Insertion
 * 
 * 
 * 
 * // ***************Output************** /*
 *  100 305 200 355 140 300 
 * null
 *  false
 * 100 
 * true
 */

    
     
