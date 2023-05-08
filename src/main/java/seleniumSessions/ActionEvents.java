package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.id("username"));
		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		Actions action = new Actions(driver);
		action.sendKeys(email, "test@gmail.com").build().perform();
		action.click(loginbtn).build().perform();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		
		
		JavascriptExecutor jsNew = new ChromeDriver();
		jsNew.executeScript("window.scrollBy(0,350)","");
	}

}
