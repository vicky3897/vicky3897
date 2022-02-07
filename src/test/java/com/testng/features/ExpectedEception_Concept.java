package com.testng.features;

import org.testng.annotations.Test;

public class ExpectedEception_Concept {

	@Test(expectedExceptions = ArithmeticException.class )
	public void demo() {

	int a = 25;
	System.out.println(a/0);
		
	}
}
