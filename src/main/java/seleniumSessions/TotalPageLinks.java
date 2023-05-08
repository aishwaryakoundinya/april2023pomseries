package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> pageLink = driver.findElements(By.className("gb_q"));
		for(int i=0;i<pageLink.size();i++)
		{
			String pages = pageLink.get(i).getText();
			System.out.println(pages);
		}
	}

}
