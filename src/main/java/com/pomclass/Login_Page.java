package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement mail;
	
	public Login_Page(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);
	
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubLogin() {
		return subLogin;
	}

	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement subLogin;
	
	
	
}
