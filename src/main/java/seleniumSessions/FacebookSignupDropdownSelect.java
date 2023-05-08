package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignupDropdownSelect {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		Actions action = new Actions(driver);
		Thread.sleep(7000);
		WebElement create= driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		action.click(create).build().perform();
		Thread.sleep(7000);
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Test");
		
		//By element = By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
		//WebElement create = getElement(element);
		//action.click(create).build().perform();
		//WebElement day = getElement(By.name("birthday_day"));
		//sel.selectByIndex(3);
		
		By day = By.id("day");
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.presenceOfElementLocated(day));
		
		By month = By.name("birthday_month");
		By year = By.name("birthday_year");
		dodropdownselectbyIndex(day,3);
		dodropdownselectbyValue(month,"Apr");
		dodropdownselectbyVisibleText(year,"2020");
		//getElements()
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static int getElements(By locator) {
		Select sel = new Select(getElement(locator));
		List<WebElement>getlist = sel.getOptions();
		return getlist.size();
	}
	public static void dodropdownselectbyIndex(By locator,int Index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(Index);
	}
	public static void dodropdownselectbyValue(By locator,String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}
	public static void dodropdownselectbyVisibleText(By locator,String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(value);
	}

}
