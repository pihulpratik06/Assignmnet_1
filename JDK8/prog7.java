package JDK8;
 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class UptadeDemo_3b {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(23,87 ,20,20,58,45,34, 45, 56, 67, 78, 89, 90);
        int prod1 = list1.stream().reduce(1, (n1, n2) -> n1 + n2);
        System.out.println(prod1);
        System.out.println(list1.stream().map(a -> a * a).collect(Collectors.toList()));
    }
}

/**
* 713
 [529, 7569, 400, 400, 3364, 2025, 1156, 2025, 3136, 4489, 6084, 7921,
 * 8100]
 */