package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
	@Test(timeOut = 7000)
	public void demo() throws Throwable {

		System.out.println("BrowserLauch");
		Thread.sleep(2000);
		
		System.out.println("Url");
		Thread.sleep(1000);
		
		System.out.println("Login");
		Thread.sleep(3000);
	}

}
