//Program 2)
package Collection;
import java.util.List;
import java.util.Vector;

 class List2Demo {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        list.add(200);
        list.add(30);
        list.add(140);
        list.add(30);
        list.add(null);
        for (Integer i : list)
            System.out.print(i + " ");
        System.out.println(list.isEmpty());
        System.out.println(list.remove(2));
        System.out.println(list.contains(30));
    }
}
/*
 * Spefication 
 * 
 * null - Allowed Duplicate 
 * Elements - Allowed 
 * Order - Insertion
 * 
 * 
 * 
 * /**** Output******
 * 
 * 200 30 140 30 null false 140 true
 * 
 * 
 */