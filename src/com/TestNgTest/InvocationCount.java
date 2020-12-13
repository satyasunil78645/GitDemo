package com.TestNgTest;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10)
	public void sum() {
		System.out.println("sum");
	}

}
