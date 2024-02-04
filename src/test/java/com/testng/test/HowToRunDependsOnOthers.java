package com.testng.test;

import org.testng.annotations.Test;

public class HowToRunDependsOnOthers {

	@Test
	public void getOpenBrowser() {
		System.out.println("Open Browser");
	}

	@Test(dependsOnMethods = "getOpenBrowser")
	public void getLoginTheApplication() {
		System.out.println("Loging successfully ");
	}

}
