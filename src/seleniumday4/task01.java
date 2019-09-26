package seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task01 {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		System.setProperty("wedriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\seleniumday4\\driverPath\\chromedriverVersion76.1.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("karthikeyankandhan@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		
		password.sendKeys("Amazon@123");
		
		WebElement button = driver.findElement(By.xpath("//input[@class='Log In']"));
		button.click();
	}
}
