package com.epam.tat.module4.testClasses.trigonometric;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorSinTest extends BaseTest {
    @Test(groups = "trigonometric", dataProviderClass = DataProvider.class, dataProvider = "doubleOneValue")
    @Parameters({"a"})
    public void testSin(double a) {
        double result = Math.sin(a);
        Assert.assertEquals(getCalculator().sin(a), result);
    }
}
