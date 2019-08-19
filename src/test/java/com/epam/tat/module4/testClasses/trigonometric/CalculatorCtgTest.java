package com.epam.tat.module4.testClasses.trigonometric;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorCtgTest extends BaseTest {
    @Test(groups = "trigonometric", dataProviderClass = DataProvider.class, dataProvider = "doubleOneValue")
    @Parameters({"a"})
    public void testCtg(double a) {
        double result = 1 / (Math.tan(a));
        Assert.assertEquals(getCalculator().ctg(a), result);
    }
}
