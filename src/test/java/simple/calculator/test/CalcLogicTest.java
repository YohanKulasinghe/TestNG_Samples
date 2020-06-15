package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.CalcLogic;

public class CalcLogicTest {

    CalcLogic calc;

    @BeforeMethod
    public void setUp() {
        calc = new CalcLogic();
    }

    @Test
    public void testSum() {
        Assert.assertEquals(calc.sum(100, 50), 150, "Failed to add two integers");
    }
}
