package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;
	@Test
	public void AlertPOP_UP() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://leafground.com/alert.xhtml;jsessionid=node0nlb7u6xqn7ir1pn7ailr0o8i55218611.node0");
		
		 WebElement simpleAlert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[1]"));
		 simpleAlert.click();
		 
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
		 alert.dismiss();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
