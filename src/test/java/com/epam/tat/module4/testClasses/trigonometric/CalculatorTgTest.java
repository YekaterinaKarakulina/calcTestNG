package com.epam.tat.module4.testClasses.trigonometric;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTgTest extends BaseTest {
    @Test(groups = "trigonometric", dataProviderClass = DataProvider.class, dataProvider = "doubleOneValue")
    @Parameters({"a"})
    public void testTg(double a) {
        double result = Math.tan(a);
        Assert.assertEquals(getCalculator().tg(a), result);
    }
}
