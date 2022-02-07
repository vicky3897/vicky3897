package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

	public WebDriver driver;
	
	@FindBy(name = "processCarrier")
private	WebElement shipping;

	public Shipping(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);

	
	}

	public WebElement getShipping() {
		return shipping;
	}

	
	

}
