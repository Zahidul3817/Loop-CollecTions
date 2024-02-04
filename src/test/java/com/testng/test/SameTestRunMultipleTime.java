package com.testng.test;

import org.testng.annotations.Test;

public class SameTestRunMultipleTime {
	
	@Test(invocationCount = 100)
	public void getRunMultipleTime() {
		System.out.println("Test is run");
	}

}
