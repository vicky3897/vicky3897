package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Procced {
public WebDriver driver;

public Procced(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);


}

public WebElement getProced() {
	return proced;
}

@FindBy(xpath = "//a[@title='Proceed to checkout']")
private WebElement proced;





}
