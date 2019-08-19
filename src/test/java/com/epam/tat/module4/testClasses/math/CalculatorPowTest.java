package com.epam.tat.module4.testClasses.math;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorPowTest extends BaseTest {
    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "doubleTwoValues")
    @Parameters({"a", "b"})
    public void testPowDouble(double a, double b) {
        double result = Math.pow(a, b);
        Assert.assertEquals(getCalculator().pow(a, b), result);
    }
}
