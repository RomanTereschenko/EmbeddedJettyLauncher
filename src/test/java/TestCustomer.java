/**
 * Created by home on 6/14/2014.
 */

import org.junit.Before;
import org.junit.Test;
import java.lang.Math;
import static org.junit.Assert.*;

public class TestCustomer {

    int number;

    @Before
    public void init() {
        number = (int) (Math.random() * 6);
    }

    @Test
    public void checkCondition(){
        assertNotEquals("Number is not Equal to 5",5, number);
    }
}
