package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("justAnInputBox")).click();
		chooseInput(driver,"//div//div[@class='comboTreeDropDownContainer']//ul//li//span[@class = 'comboTreeItemTitle']","choice 1","choice 2");
	}
	
		
		public static void chooseInput(WebDriver driver,String xpath,String... choiceText) {
			List<WebElement> choices = driver.findElements(By.xpath(xpath));
			
			for(int i=0;i<choices.size();i++) {
				String text = choices.get(i).getText();
				//System.out.println(text);
				
					for(int j=0;i<choiceText.length;j++) {
						if(text.equals(choiceText[j])) {
							choices.get(i).click();
							break;
						}
					}
			}
		}
}
