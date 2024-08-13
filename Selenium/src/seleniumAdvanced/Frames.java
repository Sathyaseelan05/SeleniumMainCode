package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node04008hyknlunzjt0zayn6zfc04983364.node0");
		
		driver.switchTo().frame(0);
		WebElement click = driver.findElement(By.id("Click"));
		click.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement click1 = driver.findElement(By.xpath("//*[normalize-space()='Count Frames']//child::*"));
		click1.click();
		
		
		
		
		
		
		
	}

}
