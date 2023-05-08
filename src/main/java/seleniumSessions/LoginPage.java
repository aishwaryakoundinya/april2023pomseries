package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			Thread.sleep(5000);
			
//			WebElement email = driver.findElement(By.id("username"));
//			WebElement loginbtn = driver.findElement(By.id("loginBtn"));
//			Actions action = new Actions(driver);
//			action.sendKeys(email, "test@gmail.com").build().perform();
//			action.click(loginbtn).build().perform();
			
			By username = By.id("username");
			By password = By.id("password");
			By loginbtn = By.id("loginBtn");
			Util util = new Util(driver);
			util.sendKeys(username, "test@gmail.com");
			util.sendKeys(password, "test@123");
			util.doClick(loginbtn);
			util.justWaitforElement(loginbtn, 4);
			util.getElement(loginbtn).click();
			

	}

}
