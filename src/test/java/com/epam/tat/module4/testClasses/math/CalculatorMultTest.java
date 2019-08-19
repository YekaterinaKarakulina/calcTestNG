package com.epam.tat.module4.testClasses.math;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorMultTest extends BaseTest {
    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "longTwoValues")
    @Parameters({"a", "b"})
    public void testMultLong(long a, long b) {
        long result = a * b;
        Assert.assertEquals(getCalculator().mult(a, b), result);
    }

    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "doubleTwoValues")
    @Parameters({"a", "b"})
    public void testMultDouble(double a, double b) {
        double result = a * b;
        Assert.assertEquals(getCalculator().mult(a, b), result);
    }
}
