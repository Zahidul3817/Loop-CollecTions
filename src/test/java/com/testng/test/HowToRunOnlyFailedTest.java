package com.testng.test;
import org.junit.Assert;
import org.testng.annotations.Test;

public class HowToRunOnlyFailedTest {

	

	@Test 
	public void getRun1() {
		Assert.assertTrue(false);
		System.out.println("Test one");
	}
	@Test 
	public void getRun2() {
		Assert.assertTrue(false);
		System.out.println("Test 2");
	}
	@Test 
	public void getRun3() {
		Assert.assertTrue(true);
		System.out.println("Test 3");
	}
	@Test 
	public void getRun4() {
		Assert.assertTrue(true);
		System.out.println("Test 4");
	}
	@Test 
	public void getRun5() {
		Assert.assertTrue(true);
		System.out.println("Test 5");
	}
}
