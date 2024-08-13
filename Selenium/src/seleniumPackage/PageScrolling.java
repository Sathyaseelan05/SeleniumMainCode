package seleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageScrolling {

	WebDriver driver;
	
	@BeforeTest
	public void driverdetails() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://leafground.com/");
	}
	
	@Test(priority = 1)
	public void scrolldown() throws InterruptedException {
		
	
		 driver.navigate().to("https://leafground.com/");
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
		 executor.executeScript("window.scroll(0,450)" ,"" );
		 Thread.sleep(2000);
		 
		 JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		 executor1.executeScript("window.scroll(0,450)" ,"" );
		 Thread.sleep(2000);
		 
		 JavascriptExecutor executor2 = (JavascriptExecutor) driver;
		 executor2.executeScript("window.scroll(0,-600)" ,"" );
		 
		 
		 
		 
		 
	}
	
	@Test(priority=2)
	public void scrolldownusingRobotclass() throws InterruptedException, AWTException {
		
	
		 driver.navigate().to("https://leafground.com/");
		 driver.manage().window().maximize();
		 
		 
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_PAGE_UP);
		 robot.keyRelease(KeyEvent.VK_PAGE_UP);
		 driver.close();
	
	
	
	
	}
	
	
	
}
