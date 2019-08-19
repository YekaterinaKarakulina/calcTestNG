package com.epam.tat.module4.testClasses.math;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorDivTest extends BaseTest {
    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "longTwoValues")
    @Parameters({"a", "b"})
    public void testSumLong(long a, long b) {
        long result = a / b;
        Assert.assertEquals(getCalculator().div(a, b), result);
    }

    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "doubleTwoValues")
    @Parameters({"a", "b"})
    public void testSumDouble(double a, double b) {
        double result = a / b;
        Assert.assertEquals(getCalculator().div(a, b), result);
    }

    @Test(groups = "math", expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        getCalculator().div(1, 0);
    }
}
