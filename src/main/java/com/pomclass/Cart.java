package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	
	public WebDriver driver;
	public Cart(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);
	
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath = "//iframe[@scrolling='auto']")
	private WebElement frame;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement submit;
	
	
	
}
