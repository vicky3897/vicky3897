package com.maven_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver; 
	public static Actions ac;
	
	public static  WebDriver browserLauch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		}		
		
		else if (name.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.manage().window().maximize();
			}
		
		return driver;
	}
	
	//get
	public static void getUrl(String url) {
driver.get(url);
	}
	//close
	public	static void closeWindow() {
driver.close();
	}
	//Quit
	public static void quitBrowser() {
driver.quit();
	}
	//Navigate TO
	public	static void navigateTo(String url) {
driver.navigate().to(url);
	}
	//Navigate Back
	public static  void navigateBack() {
driver.navigate().back();
	}
	//Navigate Forward
	public static void navigateForward() {
driver.navigate().forward();
	}
	//Navigate Refresh
	public static void navigateRefresh() {
driver.navigate().refresh();
	}
	
	//Alert 
	public static void alertOk() {

	Alert acept = driver.switchTo().alert();
	acept.accept();
   }
	public static void alertCancel() {
		Alert cancel = driver.switchTo().alert();
		cancel.dismiss();
		}

	public static void alertInput(String Input) {
Alert alert = driver.switchTo().alert();
	alert.sendKeys(Input);
	}

	
	//Actions
	public static void actions(String name,WebElement element) {
		ac = new Actions(driver);
		 
		 if ( name.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}
		 else if (name.equalsIgnoreCase("contextClick")) {
			ac.contextClick(element).build().perform();
		}
		 else if (name.equalsIgnoreCase("doubleClick")) {
			ac.doubleClick(element).build().perform();	
		}
		 else if (name.equalsIgnoreCase("moveToElement")) {
			ac.moveToElement(element).build().perform();
		}
		 }
	//drag and drop
	public static void dragAndDrop(WebElement drag, WebElement drop ) {
		ac.dragAndDrop(drag, drop).build().perform();
	}
	
	//Frame
	public  static void frame( WebElement element) {
		
			driver.switchTo().frame(element);
		}
	
	
	//frame defaultContent
	public	static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	//frame parentFrame
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	
	//Robot
	public static void robot() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//WindowHandles
	public static void windowHandle(String name, String website) {
		if (name.equalsIgnoreCase("windowHandle")) {
			driver.getWindowHandle();
		}
		else if (name.equalsIgnoreCase("windowHandles")) {
			   Set<String> windowHandles = driver.getWindowHandles();
	              
	              for (String str : windowHandles) {
					String title = driver.switchTo().window(str).getTitle();
					System.out.println(title);
	              }
	          	String s = website;
				for (String str : windowHandles) {
					if (driver.switchTo().window(str).getTitle().equals(s)) {
						break;
					}	
					}
		}
	}
	//single Dropdown
	public static void dropDownByIndex(WebElement element,int indexValue) {
Select se = new Select(element);
	se.selectByIndex(indexValue);
	}
	
	public static void dropDownByValue(WebElement element , String input) {
Select ss = new Select(element);
ss.selectByValue(input);
	}
	
	public static  void dropDownByVisibleText(WebElement element , String input) {
Select sss = new Select(element);
sss.selectByVisibleText(input);
	}
	
	//MultiDropDown
	public static void multiDropDown(WebElement element,String name) {
Select s = new Select(element);
if (name.equalsIgnoreCase("getOptions")) {
	List<WebElement> options = s.getOptions();
	System.out.println("Options are : "+options );
}
else if (name.equalsIgnoreCase("isMultiple")) {
	boolean multiple = s.isMultiple();
	System.out.println("Whether it is Multiple : "+ multiple);
}
else if (name.equalsIgnoreCase("getAllSelectedOptions")) {
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	System.out.println("The Seleceted Options are : "+allSelectedOptions);
}
else if (name.equalsIgnoreCase("getFirstSelectedOptions")) {
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println("The First Selected Option : "+firstSelectedOption);
}
else if (name.equalsIgnoreCase("deselectAll")) {
	s.deselectAll();
}

}
	
	//get 
	public static void get(String name,WebElement element) {
if (name.equalsIgnoreCase("getAttributeName")) {
	String attribute = element.getAttribute("name");
	System.out.println(attribute);
}
else if (name.equalsIgnoreCase("getAttributeValue")) {
	String attribute2 = element.getAttribute("value");
	System.out.println(attribute2);
}
else if (name.equalsIgnoreCase("getText")) {
	String text = element.getText();
	System.out.println(text);
}
	}
	
	//currentUrl
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL : "+currentUrl); 	
	}
	
	//get title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title names : "+title);
	}
	
	//sendKeys
	public static void sendKeys(WebElement element,String input) {
element.sendKeys(input);
	}
	
	//click
	public static void click(WebElement element) {
		element.click();
		}

	//is 
	public static void is(WebElement element,String name) {
		if (name.equalsIgnoreCase("isDisplayed")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
				}
		else if (name.equalsIgnoreCase("isEnabled")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		}
		else if (name.equalsIgnoreCase("isSelected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
		}
	
	//clear
	public static void clear(WebElement element) {
element.clear();
	}
	
//implicitlywait
    public static void implicitlyWait() {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    
//explicitWait
    public void explicitWait(WebElement element) {
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOf(element));
	}

    //takeScreenshot
    public static void screenshot(String location) throws IOException {
TakesScreenshot ts = (TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(location);
	FileUtils.copyFile(src, dest);
    }
    
    //Scrollup annd down
    public static void scroll(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
