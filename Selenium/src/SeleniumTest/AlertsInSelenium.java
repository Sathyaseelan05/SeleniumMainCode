package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Alert alert = driver.switchto().alert();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		WebElement Simpledialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		Simpledialog.click();
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		confirmbox.click();
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(4000);
		confirmalert.dismiss();
		
		
		
		

	}

}
