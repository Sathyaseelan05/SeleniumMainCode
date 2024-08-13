package seleniumPackage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoCompletion {

	@Test
	public void GoogleAutoCompletion() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");		
	    WebDriver driver = new ChromeDriver();
	    driver.get("https:www.google.com");
	    Thread.sleep(2000);
	    
	    WebElement textbox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
	    textbox.sendKeys("Selenium");
	    Thread.sleep(2000);
	    ////*[@id="APjFqb"]
	     List <WebElement> textboxvalues = driver.findElements(By.xpath("//*[@id=\"APjFqb\"]//following::div"));
	     Thread.sleep(2000);
	    for (WebElement value : textboxvalues) {
	    	if(value.getText().equalsIgnoreCase("Selenium Interview Questions")) {
	    		
	    		value.click();
	    		Thread.sleep(2000);
	    		
	    		System.out.println("print the value-" + value);
	    	}
			
		}
	    
	    
	    
	    
	    
	    
	}}