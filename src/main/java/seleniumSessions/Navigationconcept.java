package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Santhosh mp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().back();

	}

}

