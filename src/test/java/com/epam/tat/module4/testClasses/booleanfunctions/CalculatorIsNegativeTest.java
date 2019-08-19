package com.epam.tat.module4.testClasses.booleanfunctions;

import com.epam.tat.module4.testClasses.BaseTest;
import com.epam.tat.module4.testClasses.DataProvider;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorIsNegativeTest extends BaseTest {
    @Test(groups = "boolean", dataProviderClass = DataProvider.class, dataProvider = "longNegative")
    @Parameters({"a"})
    public void testIsNegative(long a) {
        Assert.assertTrue(getCalculator().isNegative(a));
    }
}
