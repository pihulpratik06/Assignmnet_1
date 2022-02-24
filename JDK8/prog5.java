package JDK8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

 class UptadeDemo_3 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(23, 34, 45, 56, 67, 78, 89, 90);
        Stream<Integer> mapN = list1.stream().map(a -> a * a);
        mapN.forEach(a-> System.out.print(a+" "));

    }
 }
 /**
  * 529 1156 2025 3136 4489 6084 7921 8100
  */