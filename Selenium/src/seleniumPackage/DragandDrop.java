package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	
WebDriver driver;
	
	@Test
	public void draganddrop() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://leafground.com/drag.xhtml;jsessionid=node01jcc4l8kr0dxds51jve7g22455161988.node0");
		 
		 
		 WebElement From = driver.findElement(By.xpath("//*[normalize-space()=\"Drag to target\"][@id=\"form:drag\"]"));
		 
		 WebElement To = driver.findElement(By.xpath("//*[normalize-space()=\"Drop here\"][@class=\"ui-widget-header\"]"));
		 
		 Actions action = new Actions(driver);
		 action.dragAndDrop(From, To).build().perform();
		 
		 
		 

}
}