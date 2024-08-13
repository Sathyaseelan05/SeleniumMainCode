package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXL {
	
	String [][] data = null;
	
	
	@DataProvider(name="JXLexcel")
	public String[][] DP() throws BiffException, IOException{
		data = ReadExcel();
		return data;
		
		
	}
	
	
	public String[][] ReadExcel() throws BiffException, IOException {
		
		FileInputStream excel = new FileInputStream("C:\\Users\\sathya\\Downloads");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowscount=sheet.getRows();
		int columncount=sheet.getColumns();
		
		String Testdata[][] = new String[rowscount-1][columncount];
		
		for(int rows =1; rows<rowscount; rows++) {
			
			for(int col=0; col<columncount; col++) {
				
			 Testdata[rows-1][col] = sheet.getCell(col, rows).getContents();
			}
			
		}
		return Testdata;
		
		
		
		
		
	}
	
	@Test(dataProvider = "JXLexcel" )
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
	
	
