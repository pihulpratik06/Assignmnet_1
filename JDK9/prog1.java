//Question::2
package JDK9;

import java.util.ArrayList;
import java.util.List;

 class JDK9Update_1 {


    private void safeVarargs(List<Integer>... list) {
        for (List<Integer> num : list) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        JDK9Update_1 obj = new JDK9Update_1();
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(84);
        obj.safeVarargs(list);
    }
}

/**
 * [20, 84]
 */
