//Question 1
package JDK11;

import java.util.Optional;

class JDK11Update_1 {
    public static void main(String[] args) {
        String name = "Pratik Anant Pihul";
        Optional<String> nullCheck = Optional.ofNullable(name);
        nullCheck.ifPresentOrElse((a) -> System.out.println("Name is:: " + a),
                () -> System.out.println("No value present"));
    }
}
/**
 * Name is:: Pratik Anant Pihul
 */