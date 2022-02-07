package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay_Method {

	public WebDriver driver;
	
	public Pay_Method(WebDriver driver2) {
this.driver= driver2;
PageFactory.initElements(driver, this);


	
	}

	public WebElement getPay() {
		return pay;
	}

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement pay;
	
	
}
