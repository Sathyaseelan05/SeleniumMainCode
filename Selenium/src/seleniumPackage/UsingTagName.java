package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingTagName {

    @Test(priority=1)
	public void findingSizeofRowsandColsUsingTagname() throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		List<WebElement> rowsize = driver.findElements(By.tagName("td"));
		int rowcount = rowsize.size();
		System.out.println("Rowscount is :"+ rowcount);
		Thread.sleep(2000);
		
		
		List<WebElement> colsize = driver.findElements(By.tagName("th"));
		int colcount = colsize.size();
		System.out.println("Rowscount is :"+ colcount);
		Thread.sleep(2000);
		
		
		
	}
    
    @Test(priority=2)
   	public void findingValuesofRowsandColsUsingTagname() throws InterruptedException {
       	
       	System.setProperty("webdriver.chrome.driver",
   				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		driver.get("https://www.w3schools.com/html/html_tables.asp");
   		driver.manage().window().maximize();
   		Thread.sleep(3000);
   		
   		
   		List<WebElement> rowvalue = driver.findElements(By.tagName("td"));
   		for (WebElement webElement : rowvalue) {
			String valueofrows = webElement.getText();
			System.out.println("Rowvalues is - " + valueofrows);
		}
   		
   		
   		
   		List<WebElement> col = driver.findElements(By.tagName("th"));
   		for (WebElement webElement : col) {
   			String colvalues =webElement.getText();
   			System.out.println("colvalues is -" +colvalues);
			
		}
   		
   		
   		
   	}

}
