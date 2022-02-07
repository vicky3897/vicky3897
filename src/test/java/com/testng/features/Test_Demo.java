package com.testng.features;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Test_Demo {

	@Test
	public void demo_username() {

		String exp = "vicky";
		String act = "vicky";
		
		assertEquals(act, exp);
		
	}
	
	@Test(retryAnalyzer = Rerun.class)
	public  void demo_password() {

	String act ="ddd";
	String exp = "sdf";
	
	assertEquals(act, exp);
			
		
	}
	
}
