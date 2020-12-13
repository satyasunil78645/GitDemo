package com.TestNgTest;

import org.testng.annotations.Test;

public class TestNgFeature {
	
	@Test
	public void login()
	{
		System.out.println("application logining....");
	}
	@Test(dependsOnMethods="login")
	public void homePage()
	{
		System.out.println("HomePage....");
	}

}
