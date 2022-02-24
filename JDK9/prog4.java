//Question::3
package JDK9;

import java.util.HashMap;
import java.util.Map;

 class JDK9Update_3b  {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'd');
        map.put(4, 'd');
        for (Map.Entry<Integer, Character> m : map.entrySet())
            System.out.println(m.getKey() + "::" + m.getValue());
        System.out.println("*************************");
        Map<Integer, Character> map1 = Map.of(5, 'e', 6, 'f', 7, 'g', 8, 'h');
        for (Map.Entry<Integer, Character> m1 : map1.entrySet())
            System.out.println(m1.getKey() + "::" + m1.getValue());

    }
}
/**
 * 1::a 2::b 3::d 4::d
 *************************
 * 5::e 8::h 7::g 6::f
 */