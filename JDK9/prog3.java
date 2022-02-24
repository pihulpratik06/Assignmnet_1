//Question::3
package JDK9;

import java.util.HashSet;
import java.util.Set;

 class JDK9Update_3a {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        for (Integer a : set)
            System.out.print(a + " ");
        System.out.println();
        Set<Integer> set1 = Set.of(60, 70, 80, 90, 100);
        for (Integer a : set1)
            System.out.print(a + " ");
    }
}

/**
 * 50 20 40 10 30 
 * 60 70 80 90 100
 */