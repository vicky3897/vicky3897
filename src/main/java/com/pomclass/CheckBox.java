package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {

	public WebDriver driver;
	
	public CheckBox(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);

	
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	@FindBy(id = "cgv")
	private WebElement checkbox;
	
	
}
