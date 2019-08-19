package com.epam.tat.module4.testClasses.math;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSqrtTest extends BaseTest {
    @Test(groups = "math", dataProviderClass = DataProvider.class, dataProvider = "doubleOneValue")
    @Parameters({"a"})
    public void testSqrtDouble(double a) {
        double result = Math.sqrt(Math.abs(a));
        Assert.assertEquals(getCalculator().sqrt(a), result);
    }
}
