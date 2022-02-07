package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Method {

	
	@Test
	public void potato() {

		System.out.println("potato");
	}
	@Ignore
	@Test
	public void tomato() {

		System.out.println("tomato");
	}
	
	@Test
	public void carrot() {

		System.out.println("carrot");
	}
	
	
	@Test(enabled = false)
	public void apple() {

		System.out.println("apple");
	}
	@Test
	public void orange() {

		System.out.println("orange");
	}
}
