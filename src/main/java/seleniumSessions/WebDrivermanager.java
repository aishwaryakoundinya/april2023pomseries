package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDrivermanager {
	static String browsername;

	public static void main(String[] args) {
		
		browsername="chrome";
		if(browsername=="chrome") {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.quit();
		}
		else if(browsername=="firefox") {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.quit();
		}
		
		
		

	}

}