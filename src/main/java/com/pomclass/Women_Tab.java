package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Tab {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Women']")
	private WebElement women;

	public Women_Tab(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);

	
	}

	public WebElement getWomen() {
		return women;
	}
	
	
	
	
}
