package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Formfill {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(5000);
//		driver.findElement(By.name("namebf4e90bb")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Tester");
//		driver.findElement(By.name("loginbf4e90bb")).sendKeys("test@rediff.com");
//		driver.findElement(By.className("btn_checkavail")).click();
//		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.quit();

	}

}
