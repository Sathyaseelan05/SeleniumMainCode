package SeleniumTest;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathya\\eclipse-workspace\\Selenium\\GeckoDriver\\FirefoxDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Agni"+Keys.ENTER);
		
		
		
		
		//driver.quit();

	}

}
