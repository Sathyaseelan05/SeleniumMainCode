package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01twj4zlj6fniq1qe3hxjl39wb42319824.node0");
		
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.id("j_idt87:country_label"));
		dropdown2.sendKeys("Brazil"+Keys.ENTER);
		
		WebElement dropdown3 = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/ul"));
		Select select3 = new Select(dropdown3);
		select3.selectByIndex(3);
		
		
		
		
		
		
		
		WebElement samplecheck = driver.findElement(By.xpath("//*[@id=\"j_idt87:lang_label\"]"));
		Select select4 = new Select(samplecheck);
		select4.selectByIndex(4);
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		//get the number of dropdown options
		
		//List<WebElement> list = select.getOptions();
		//int size = list.size();
		//System.out.println(size);
		
		//dropdown - Select select = new select();
		//selectByIndex or selectByValue or selectByvisible
		
		
		
		
		

	}

}
