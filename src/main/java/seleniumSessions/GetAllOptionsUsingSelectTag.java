package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllOptionsUsingSelectTag {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		//By country=By.id("Form_getForm_Country");
		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		
		Select sel=new Select(country);
		List<WebElement>countrylist=sel.getOptions();
		System.out.println(countrylist.size());
		if(countrylist.size()-1==232) {
			System.out.println("Its correct");
		}
		else {
			System.out.println("its incorrect");
		}
		
		/*
		 * for(WebElement e:countrylist) 
		 * {
		 *  String txt=e.getText();
		 *  System.out.println(txt); 
		 * }
		 */
		
//		for(int i=0;i<countrylist.size();i++) {
//			String text=countrylist.get(i).getText();
//			System.out.println(i+"::"+text);
//		}
		int count = 0;
		for(WebElement m:countrylist)
		{
			String txt=m.getText();
			System.out.println(count +"::"+txt);
			count++;
		}
		
	}

}
