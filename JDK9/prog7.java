//Question::6
package JDK9;
abstract class concat<T> {
    abstract T join1(T str_a, T str_b, T str_c);
    abstract T join2(T str_a, T str_b, T str_c);
}

 class Ques8 {
    public static void main(String[] args) {
        
        concat<String> obj=new concat<>() {
    
            String join1(String str1, String str2,String str3) {
                return str1.concat(str2);
            }
            String join2(String str1, String str2,String str3) {
                return str1.concat(str3);
            }
        };
        System.out.println(obj.join1("Pratik ","Pihul","::Coditas"));
        System.out.println(obj.join2("Pratik ","Pihul","::Coditas"));
    }
}
/**
 * Pratik Pihul 
 *  Pratik ::Coditas
 */