package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxesInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://leafground.com/input.xhtml");	
	    
	    WebElement Name = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
	    Name.sendKeys("Sathya"+Keys.ENTER);
	    Thread.sleep(4000);
	    
	    
	    WebElement Append = driver.findElement(By.id("j_idt88:j_idt91"));
	    Append.sendKeys("India");
	    
	    Thread.sleep(4000);
	    
	    WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
	    boolean enabled = disabledbox.isEnabled();
	    System.out.println("enabled");
	    
	    WebElement ClearText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
	    ClearText.clear();
	    
	    
	    
	
	
	
	
	}

}
