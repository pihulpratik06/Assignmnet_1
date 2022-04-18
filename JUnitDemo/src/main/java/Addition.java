public class Addition {

    public int add(int a, int b){

        return  a+b;

     }

}
class Division{

    public int div(int a,int b){

        if(b==0){
             throw  new ArithmeticException("Zero:::");
        }

        return  a/b;


    }
}
class Multiplication{

    public int mul(int a,int b){

        return  a*b;
    }
}
class MainApp{
    public static void main(String[] args) {

        Addition addition=new Addition();
        Multiplication multiplication=new Multiplication();
        Division division=new Division();

        int sum=addition.add(5,1);
        int div=division.div(25,5);
        int mul=multiplication.mul(5,12);

        System.out.println(sum);
        System.out.println(div);
        System.out.println(mul);




    }
}