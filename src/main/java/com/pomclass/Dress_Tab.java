package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Tab {
public WebDriver driver;

@FindBy(xpath = "(//img[@itemprop='image'])[1]")
private WebElement dress;

public WebElement getDress() {
	return dress;
}

public Dress_Tab(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);

}
	
}
