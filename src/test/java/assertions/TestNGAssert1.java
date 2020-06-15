package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssert1 {

    @Test
    public void testAssert1(){

        int x = 12;

        Assert.assertNotEquals(x, 12, "Failed to Match Value");
    }
}
