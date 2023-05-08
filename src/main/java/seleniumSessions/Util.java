package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	WebDriver driver;
	
	//constructors
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element =null;
		try{
			element = driver.findElement(locator);
		}
		catch(Exception e){
			System.out.println("Exception occured");
			e.getMessage();
		}
		return element;
	}
	//		WebElement email = driver.findElement(By.id("username"));
	public void doClick(By locator) {
		try {
		getElement(locator).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void sendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public WebElement waitforElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return getElement(locator);
	}
	
	public void justWaitforElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	public List<WebElement> getElements(By locator) {
		List<WebElement> elements = null;
		try {
			elements = driver.findElements(locator);
			elements.size();
		}
		catch(Exception e) {
			
		}
		return elements;
		
	}
	
	public List<WebElement> visibilityAllElements(List<WebElement> elements, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		return getElements(locator);
	}
	
	public WebElement nosuchFrame(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		return getElement(locator);
	}
	
	public boolean waitForAlertToBEPresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
	}
}
