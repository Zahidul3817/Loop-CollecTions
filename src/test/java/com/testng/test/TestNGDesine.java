package com.testng.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDesine {
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Browser is opened");
	}

	@Test
	public void runTestCasesOne() {
		System.out.println("Test is executed one");
	}

	@Test
	public void runTestCasesTwo() {
		System.out.println("Test is executed two");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}

}
