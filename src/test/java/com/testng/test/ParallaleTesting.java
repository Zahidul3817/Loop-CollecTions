package com.testng.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallaleTesting {
	WebDriver driver;

	@Test
	public void getTest1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome driver node 100");
	}

	@Test
	public void getTest2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome driver node 200");
	}

	@Test
	public void getTest3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome driver node 300");
	}
	@Test
	public void sameTestRunMultpleBrowser() {
		driver.get("https://magento.softwaretestingboard.com/");
	}


}
