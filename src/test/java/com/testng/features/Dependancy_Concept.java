package com.testng.features;

import org.testng.annotations.Test;

public class Dependancy_Concept {

	@Test
	public void school() {

		System.out.println("school");
	}
	
	@Test(dependsOnMethods = "school")
	public void college() {

	System.out.println("college");
	
	}
}
