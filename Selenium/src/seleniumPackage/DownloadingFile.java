package seleniumPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadingFile {
	
	WebDriver driver;
	
	@Test
	public void download() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://leafground.com/file.xhtml");
		 
		 
		 WebElement BasicDownload = driver.findElement(By.xpath("//*[normalize-space()='Download']"));
		 BasicDownload.click();
		 
		 File file = new File("C:\\Users\\sathya\\Downloads");
		 if(file.exists()) {
			 
			 System.out.println("Success");
			 
		 }
		 else {
			 System.out.println("failure");
		 }
		 
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
