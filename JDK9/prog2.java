//Question::3
package JDK9;

import java.util.ArrayList;
import java.util.List;

 class JDK9Update_2 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('p');
        list.add('r');
        list.add('a');
        list.add('t');
        list.add('i');
        list.add('k');
        for (Character a : list)
            System.out.print(a + " ");
        System.out.println();
        List<Character> list1 = List.of('p', 'i', 'h', 'u', 'l');
        for (Character a : list1)
            System.out.print(a + " ");

    }
}
/**
 * p r a t i k 
 * p i h u l
 */