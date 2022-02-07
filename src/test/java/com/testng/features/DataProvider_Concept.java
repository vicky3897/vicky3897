package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider_Concept {

	@Test(dataProvider = "inputdata")
	public void credentials(String username , String password) {

		System.out.println("username is :"+username);
		System.out.println("password is :"+password);
		
	}
	
	@DataProvider
	public Object[][] inputdata() {

		return new Object[][] {
			
			{"vicky" , "123"},
			{"vishal" , "567"}
		};
		
		}
	}

