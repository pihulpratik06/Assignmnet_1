import static org.junit.Assert.*;
import  org.junit.Test;

public class AdditionTest {
     @Test
    public void testAdd(){
        
         Addition addition=new Addition();
         int sum=addition.add(5,5);
         assertEquals("Succes",10,sum);


     }

     @Test
    public  void testDiv() {
         Division division = new Division();
         int div = division.div(25, 5);
         assertEquals(5,div);
     }

     @Test
    public  void testMul(){

         Multiplication multiplication=new Multiplication();
         assertEquals(60,multiplication.mul(5,12));


     }

}
