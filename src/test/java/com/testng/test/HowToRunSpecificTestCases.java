package com.testng.test;

import org.testng.annotations.Test;

public class HowToRunSpecificTestCases {

	
	@Test (enabled = false)
	public void getRun1() {
		System.out.println("Test one");
	}
	@Test (enabled = false)
	public void getRun2() {
		System.out.println("Test 2");
	}
	@Test (enabled = false)
	public void getRun3() {
		System.out.println("Test 3");
	}
	@Test (enabled = true)
	public void getRun4() {
		System.out.println("Test 4");
	}
	@Test (enabled = false)
	public void getRun5() {
		System.out.println("Test 5");
	}
}
