package seleniumPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	WebDriver driver;
	
	@Test
	public void windowHandles() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://leafground.com/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 WebElement browser = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		 browser.click();
		 
		 WebElement Window = driver.findElement(By.xpath("//*[contains(text(),'Window')]"));
		 Window.click();
		 
		 
		 
		 WebElement Windowvalues = driver.findElement(By.xpath("//*[starts-with(text(),'Open')]"));
		 Windowvalues.click();
		 
		Set<String> allwindows =  driver.getWindowHandles();
		
		List<String> childs = new ArrayList<String>(allwindows);
		
		
		driver.switchTo().window(childs.get(0));
		
		driver.switchTo().window(childs.get(1));
		
		
		
        driver.switchTo().window(childs.get(0));
        
        driver.close();
		
		driver.switchTo().window(childs.get(1));
		driver.close();
		 
		 
		 
		 
		 
		 
		 
		
		
	}

	private void getWindowHandles() {
		// TODO Auto-generated method stub
		
	}
	
	
}
