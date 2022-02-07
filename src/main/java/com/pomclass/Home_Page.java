package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	public Home_Page(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//a[@class='login']")
private WebElement login;
	
}
