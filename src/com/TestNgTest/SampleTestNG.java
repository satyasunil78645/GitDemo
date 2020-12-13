package com.TestNgTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	//Pre - condition starts with @Before
	
	@BeforeSuite
	public void setUp() {
		System.out.println("BeforeSuite -- setup system property for chrome");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("BeforeTest -- Launching browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("BeforeClass -- Login to app");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("BeforeMethod -- enter Url");
	}
	@Test(priority=1,groups="A")
	public void googleTitleTest() {
		System.out.println("Test1 -- google Title Test");
	}
	@Test(priority=2,groups="A")
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=3,groups="B")
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority=4,groups="B")
	public void test4() {
		System.out.println("Test4");
	}
	@Test(priority=5,groups="C")
	public void test5() {
		System.out.println("Test5");
	}
	
	//post conditions starts with -- After
	@AfterMethod
	public void logOut() {
		System.out.println("After Method -- logout the application");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass -- close the browser");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("AfterTest -- Delete all cookies");
	}
}
