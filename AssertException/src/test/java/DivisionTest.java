


import com.Division;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest {

        @Test
        public  void testDiv() {
            Division division = new Division();

               assertThrows(NullPointerException.class,()->division.div(1,0));
           // assertThrows(ArithmeticException.class,()->division.div(1,0));
        }

    }

