package com.testng.test;

import org.testng.annotations.Test;

public class HowToPriotyTheTest {

	@Test (priority = 0)
	public void getRun5() {
		System.out.println("Test 5 - 1st");
	}
	
	@Test (priority = 1)
	public void getRun1() {
		System.out.println("Test 2nd");
	}
	@Test (priority = 2)
	public void getRun2() {
		System.out.println("Test 2");
	}
	@Test (priority =4)
	public void getRun3() {
		System.out.println("Test 3");
	}
	@Test (priority =7)
	public void getRun4() {
		System.out.println("Test 4");
	}

}
