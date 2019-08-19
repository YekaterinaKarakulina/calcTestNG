package com.epam.tat.module4.testClasses;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "stringNumbers")
    public Object[][] dataProviderString() {
        return new Object[][]{
                {"100000", "500000"},
                {"1000000", "452000"},
                {"-500000", "-700000"}
        };
    }

    @org.testng.annotations.DataProvider(name = "longTwoValues")
    public Object[][] dataProviderLong() {
        return new Object[][]{
                {100000, 500000},
                {1000000, 452000},
                {-500000, -700000}
        };
    }

    @org.testng.annotations.DataProvider(name = "longPositive")
    public Object[][] dataProviderLongPositive() {
        return new Object[][]{
                {100000},
                {100000000},
                {50}
        };
    }

    @org.testng.annotations.DataProvider(name = "longNegative")
    public Object[][] dataProviderLongNegative() {
        return new Object[][]{
                {-100000},
                {-100000000},
                {-50}
        };
    }

    @org.testng.annotations.DataProvider(name = "doubleTwoValues")
    public Object[][] dataProviderDouble() {
        return new Object[][]{
                {15.1, 87.9},
                {0.19, 5.7},
                {-12.5, -87.5}
        };
    }

    @org.testng.annotations.DataProvider(name = "doubleOneValue")
    public Object[][] dataProviderDouble2() {
        return new Object[][]{
                {15.1},
                {0.19},
                {-12.5}
        };
    }
}
