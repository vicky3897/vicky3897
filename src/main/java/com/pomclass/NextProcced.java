package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextProcced {
public WebDriver driver;

@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
private WebElement NextProcced;

public NextProcced(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver, this);

}

public WebElement getNextProcced() {
	return NextProcced;
}



}
