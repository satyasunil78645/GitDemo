package com.TestNgTest;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	@Test(invocationTimeOut = 2000, expectedExceptions = NumberFormatException.class) // This test case should pass in 2000 milliseconds means within 2sec
	public void ExceptionTime() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}
	

}
