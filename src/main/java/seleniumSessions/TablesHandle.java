package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablesHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		int rownumCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
//		String firstHalf = "//table[@id='customers']//tr[";
//		String secondfHalf = "]//td";
		
//		for(int rownum=rownumCount;rownum>=2;rownum--) {
//		String combine = firstHalf + rownum + secondfHalf;
//		String print = driver.findElement(By.xpath(combine)).getText();
//		System.out.println(print);
//		}
		print(driver,"Island Trading");
		
		
		//table[@id='customers']//tr//td[contains(text(),"Island Trading")]
	}
		public static void print(WebDriver driver,String company) {
		
		String fHalf = "//table[@id='customers']//tr//td[contains(text(),'";
		String sHalf = "')]/following-sibling::td";
		String combine = fHalf + company + sHalf;
		int siblingCount = driver.findElements(By.xpath(combine)).size();
		
		for(int rownum=1;rownum<=siblingCount;rownum++) {
			String print = driver.findElement(By.xpath(combine+"["+rownum+"]")).getText();
			System.out.println(print);
		}
		
		
	}
}
