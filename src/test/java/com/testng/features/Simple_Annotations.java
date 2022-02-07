package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	public void setProperty() {

		System.out.println("Set Property");
		
	}
	@BeforeTest
	public void browserLaunh() {

		System.out.println("browser Launch");
		
	}
	
	@BeforeClass
	public void urlLaunch() {
         System.out.println("url Launch");

	}

	@BeforeMethod
	public void logIn() {

		System.out.println("log In");
		
	}
	
	@Test(priority = 1)
	public void women() {

		System.out.println("women");
		
	}
	@Test(priority = -1)
	public  void men() {

		System.out.println("men");
		
	}

	@Test(invocationCount = 3,priority = 0)
	public  void kids() {

		System.out.println("kids");
		
	}
	@AfterMethod
	public void logout() {

		System.out.println("logout");
		
	}
	@AfterClass
	public void homePage() {

		System.out.println("homePage");
		
	}
	@AfterTest
	public void deleteCookies() {

		System.out.println("cookies deleted");
		
	}
	@AfterSuite
	public void quit() {

		System.out.println("quit");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
