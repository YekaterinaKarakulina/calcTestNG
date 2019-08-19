package com.epam.tat.module4.testClasses.trigonometric;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorCosTest extends BaseTest {
    @Test(groups = "trigonometric", dataProviderClass = DataProvider.class, dataProvider = "doubleOneValue")
    @Parameters({"a"})
    public void testCos(double a) {
        double result = Math.cos(a);
        Assert.assertEquals(getCalculator().cos(a), result);
    }
}
