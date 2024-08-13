package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> values = driver.findElements(By.tagName("td"));
		
		for (WebElement webElement : values) {
			
			String val = webElement.getText();
			System.out.println("Text values of the rows -" + val);
		}
		
	}}
		
		//----------------
		/*
		List<WebElement> rows = driver.findElements(By.tagName("tr")); 
		for (WebElement webElement : rows) {
			String rowsvalues = webElement.getText();
			System.out.println("rowsvalues:"+ rowsvalues);
			System.out.println("-------------------------------");
			
		}
		
		//----------
		
		List<WebElement> cols =driver.findElements(By.tagName("th"));
		for (WebElement webElement : cols) {
			
			String val =webElement.getText();
			
			System.out.println( "colvalues:"+
					val);
			
			
		}*/
				 
		

		/*
		 * }
		 * 
		 * }
		 */











/*
 * List<WebElement> columns = driver.findElements(By.tagName("th")); Boolean
 * value = columns.contains("Company"); System.out.println(value);
 * 
 * 
 * 
 * int colsize =columns.size(); System.out.println(colsize);
 * System.out.println(columns.get(1));
 * 
 * 
 * List<WebElement> rows = driver.findElements(By.tagName("tr")); int rowsize =
 * rows.size(); System.out.println(rowsize); System.out.println(rows.get(1));
 */