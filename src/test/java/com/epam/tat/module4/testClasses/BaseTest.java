package com.epam.tat.module4.testClasses;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


public class BaseTest {
    private static Calculator calculator;

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @BeforeSuite(groups = "math")
    public void createInstance() {
        System.out.println("Created instance of Calculator");
        calculator = new Calculator();
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeGroups(value = {"trigonometric"})
    public void beforeGroupTrigonometric() {
        System.out.println("Before group named 'trigonometric'");
    }

    @BeforeGroups(value = {"math"})
    public void beforeGroupMath() {
        System.out.println("Before group named 'math'");
    }

    @BeforeGroups(value = {"boolean"})
    public void beforeGroupBoolean() {
        System.out.println("Before group named 'boolean'");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }
}
