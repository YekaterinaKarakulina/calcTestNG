package com.epam.tat.module4.testClasses.math;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorSumTest extends BaseTest {
    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "stringNumbers")
    @Parameters({"a", "b"})
    public void testSng(String a, String b) {
        long result = Long.parseLong(a) + Long.parseLong(b);
        Assert.assertEquals(getCalculator().sum(Long.parseLong(a), Long.parseLong(b)), result);
    }

    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "longTwoValues")
    @Parameters({"a", "b"})
    public void testSumLong(long a, long b) {
        long result = a + b;
        Assert.assertEquals(getCalculator().sum(a, b), result);
    }

    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "doubleTwoValues")
    @Parameters({"a", "b"})
    public void testSumDouble(double a, double b) {
        double result = a + b;
        Assert.assertEquals(getCalculator().sum(a, b), result);
    }
}



