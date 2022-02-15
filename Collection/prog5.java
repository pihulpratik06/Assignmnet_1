//Program 5

package Collection;

import java.util.ArrayList;
import java.util.List;

class ListDemo5 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(210);
        list1.add(305);
        list1.add(20);
        list1.add(30);
        list1.add(300);
        list1.add(140);
        list1.add(null);

        for (Integer i : list1) {

            System.out.print(i + " ");

        }

        System.out.println(list1.remove(0));
        System.out.println(list1.contains(140));
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains(140));
        System.out.println(list1.size());
        System.out.println(list1.hashCode());
        System.out.println(list1.subList(0, 3));
        System.out.println(list1.toArray());

    }
}

// ***************************
/*
 * null - Allowed Duplicate Elements - Allowed Order - Insertion
 */

// Output
/**
 * 210 305 20 30 300 140 null 210 true false true 6 1049116934 [305, 20, 30]
 * [Ljava.lang.Object;@782830
 */
