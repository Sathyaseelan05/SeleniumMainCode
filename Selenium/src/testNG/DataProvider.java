package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
String [][] data = {
	
	{"sathya","easy"},
	{"Admin","calm"},
	{"peace","admin123"},
	{"Admin","admin123"},	
	};
	
	@org.testng.annotations.DataProvider(name ="loginURL")
	public String[][] DP() {
		
		return data;
	}
	
	@Test(dataProvider = "loginURL" )
	public void LoginDataprovider(String uname, String pword) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pword);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		driver.quit();
	}

}
