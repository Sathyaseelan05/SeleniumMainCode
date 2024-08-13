package SeleniumTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WindowHandle {
	WebDriver driver;
	
	@BeforeSuite
	public void before() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0zy6ehkzdlkrb52a826w2es2m5073347.node0");
		
		
	}
	
	@Test(priority=-1)
	public void singlechildwindow() throws InterruptedException {
		
		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);
		WebElement button = driver.findElement(By.xpath("//span [(text()='Open')]"));
		button.click();
		
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		
		//the below for each it will correctly when we are fetching from eclipse,
		//if we are trying to write it will now fetch the exact child window
		for (String childwin : allwindows) {
			
			driver.switchTo().window(childwin);
			
			
		}
		WebElement textbox = driver.findElement(By.xpath("//*[@placeholder=\"E-mail Address\"]"));
		textbox.sendKeys("sathyavenkatesan05@gmail.com"+Keys.ENTER);
		
		driver.switchTo().window(parentwin);
		
		
		
	}
	
	@Test(priority=0)
	public void anotherwayofHandlingwindows() throws InterruptedException {
		String parentwin = driver.getWindowHandle();
		
		WebElement button = driver.findElement(By.xpath("//span [(text()='Open')]"));
		button.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		List<String> childs = new ArrayList<String>(allwindows);
		driver.switchTo().window(childs.get(1));
		Thread.sleep(3000);
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"message\"]"));
		textbox.sendKeys("do your Progress"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement textbox1 = driver.findElement(By.xpath("//*[@placeholder=\"E-mail Address\"]"));
		textbox1.sendKeys("sathyaseelan0596@gmail.com"+Keys.ENTER);
		driver.switchTo().window(childs.get(0));
		Thread.sleep(2000);
		
		driver.switchTo().window(childs.get(1));
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(childs.get(0));
		driver.close();
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
