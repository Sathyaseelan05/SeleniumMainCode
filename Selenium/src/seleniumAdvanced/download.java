package seleniumAdvanced;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement download = driver.findElement(By.xpath("//*[normalize-space()='Download']/child::span[2]"));
		download.click();		
		
		File file = new File("Downloads");
		File[] dfile = file.listFiles();
		
		for(File sfile :dfile) {
			
			if(sfile.getName().equals("Testleaf")) {
				
				System.out.println("download success");
			}
		}
		
		
			
		}
		
		
		
	}

