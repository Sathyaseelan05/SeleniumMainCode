package seleniumAdvanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node03x8kyvxg7wlfxxahbif3m6x94982962.node0");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String oldwin = driver.getWindowHandle();
		
		WebElement button = driver.findElement(By.xpath(""));
		button.click();
		
		Set<String> Multiplewins = driver.getWindowHandles();
		
		for(String newwin : Multiplewins) {
			
			driver.switchTo().window(newwin);
			
			
		}
		WebElement button2 = driver.findElement(By.xpath(""));
		button2.click();
		
		driver.close();
		
		driver.switchTo().window(oldwin);
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
