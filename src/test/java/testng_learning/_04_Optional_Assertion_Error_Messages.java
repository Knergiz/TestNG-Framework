package testng_learning;

import org.junit.Assert;
import org.testng.annotations.Test;

public class _04_Optional_Assertion_Error_Messages {

    @Test
    public void method1(){
        //TestNG way
        //Assert.assertTrue(false, "Error message");

        //JUnit way
        //Assert.assertTrue("Error message", false);

        //TestNG way
        //Assert.assertEquals("actual", "expected", "Error message");

        //JUnit way
        //Assert.assertEquals("Error message", "expected", "actual");


    }

}
