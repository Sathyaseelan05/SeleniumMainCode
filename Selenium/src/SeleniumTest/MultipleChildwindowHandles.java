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



public class MultipleChildwindowHandles {
	
	 


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0zy6ehkzdlkrb52a826w2es2m5073347.node0");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String Parentwin = driver.getWindowHandle();
		System.out.println(Parentwin);
		
		WebElement button = driver.findElement(By.xpath("//*[contains(text(),'Open')]//following::button[@id=\"j_idt88:new\"]"));
		button.click();
		
		
		Set<String> allwindows =driver.getWindowHandles();
		
		List<String> childs = new ArrayList<String>(allwindows);
		System.out.println(childs);
		
		driver.switchTo().window(childs.get(1));
		WebElement textbox = driver.findElement(By.xpath("//*[@placeholder=\"E-mail Address\"]"));
		textbox.sendKeys("sathyavenkatesan05@gmail.com"+Keys.ENTER);
		
		
		driver.switchTo().window(childs.get(0));
		
		
	}

}
