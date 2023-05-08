package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			driver.findElement(By.id("username")).sendKeys("test@gmail.com");
			driver.findElement(By.id("password")).sendKeys("test@123");
			driver.findElement(By.id("loginBtn")).click();
			Thread.sleep(3000);

			//List<WebElement> pageLink = driver.findElements(By.className("gb_q"));
			//String printerror = driver.findElement(By.className("private-alert__title")).getText();
			String printerror2 = driver.findElement(By.className("private-alert__inner")).getText();
			//System.out.println(printerror);
			System.out.println(printerror2);
			driver.quit();

	}

}
