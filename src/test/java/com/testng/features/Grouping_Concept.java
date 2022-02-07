package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Vegetables")
	public void potato() {

		System.out.println("potato");
	}

	@Test(groups = "Vegetables")
	public void tomato() {

		System.out.println("tomato");
	}

	@Test(groups = "Vegetables")
	public void carrot() {

		System.out.println("carrot");
	}

	@Test(groups = "fruits")
	public void apple() {

		System.out.println("apple");
	}

	@Test(groups = "fruits")
	public void orange() {

		System.out.println("orange");
	}

	@Test(groups = "HomeApplieance")
	public void fridge() {

		System.out.println("fridge");

	}

	@Test(groups = "HomeApplieance")
	public void ac() {

		System.out.println("ac");
	}

}
