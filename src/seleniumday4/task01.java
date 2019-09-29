package seleniumday4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task01 {

	public static void main(String[] args) {
		int a=10;
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\WindowHandling\\driver\\chromedriverVersion76.1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?ref_=nav_ya_signin&_encoding=UTF8&");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("oppo reno z2 mobile phones");
		
		WebElement search1 = driver.findElement(By.xpath("//input[@class='nav-input'][1]"));
		search1.click();

		String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		
		
		for(String X: child)
			
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(X);
				
			
			}
			
		}
		
		WebElement cart = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		cart.click();
		
		Set<String> allWindowhandle = driver.getWindowHandles();
		
		 List<String> Li = new ArrayList();
		 
		 Li.addAll(allWindowhandle);
		 
		 String NewWindow = Li.get(1);
		 driver.switchTo().window(NewWindow);	 
		 
		 WebElement AddToCart = driver.findElement(By.xpath("//input[@id ='add-to-wishlist-button-submit']"));
		 AddToCart.click();
		 
			Set<String> allWindowhandle1 = driver.getWindowHandles();

		 Li.addAll(allWindowhandle1);
		 String LatestWnidow = Li.get(3);
		 driver.switchTo().window(LatestWnidow);
		 
		 WebElement printing1 = driver.findElement(By.xpath("//input[@type='email']"));
		 
		 printing1.sendKeys("karthikeyankandhan@gmail.com");
		 
		 WebElement btn = driver.findElement(By.xpath("//input[@id='continue']"));
		 btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
