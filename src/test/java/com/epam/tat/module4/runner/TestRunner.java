package com.epam.tat.module4.runner;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");
        List<String> files = Arrays.asList("./src/test/resources/suites/CalculatorOneByOne.xml");
        suite.setSuiteFiles(files);
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        tng.setXmlSuites(suites);
        tng.run();
    }
}
