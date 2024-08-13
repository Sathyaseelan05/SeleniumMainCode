package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumBasicFeatures {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	
		
	}
		
		

	@Test
	public void basicElements() throws InterruptedException {
		
		
		driver.navigate().to("https://leafground.com/");
		
	    WebElement Element =	driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		Element.click();
		
		WebElement dropdown =	driver.findElement(By.xpath("//*[normalize-space()='Dropdown']"));
		dropdown.click();
		
		WebElement dropdownvalues =	driver.findElement(By.xpath("//*[@class=\"ui-selectonemenu\"]"));

		Select select = new Select(dropdownvalues);
		select.selectByIndex(3);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		 WebElement Element1 =	driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		Element1.click();
		
		WebElement TextBox =	driver.findElement(By.xpath("//*[normalize-space()='Text Box']"));
		TextBox.click();
		
		WebElement TextBoxfield= driver.findElement(By.id("j_idt88:name"));
		TextBoxfield.sendKeys("sathyaseelan"+Keys.ENTER);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		WebElement Element2 =	driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		Element2.click();
		
		WebElement Button =	driver.findElement(By.xpath("//*[normalize-space()='Button']"));
		Button.click();
		
		WebElement heightandwid = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		int height = heightandwid.getSize().getHeight();
		int width = heightandwid.getSize().getWidth();
		System.out.println("print-"+height+width);
		
		driver.navigate().back();
		
		WebElement Element3 =	driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		Element3.click();
		
		WebElement CheckBox =	driver.findElement(By.xpath("//*[normalize-space()='Check Box']"));
		CheckBox.click();
		
		WebElement CheckBoxvalues =	driver.findElement(By.xpath("//span[normalize-space()='Basic']"));
		CheckBoxvalues.click();
		
	 driver.navigate().back();
		
		WebElement Element4 =	driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		Element4.click();
		
		WebElement RadioButton =	driver.findElement(By.xpath("//*[normalize-space()='Radio Button']"));
		RadioButton.click();
		
		WebElement RadioButtonvalues =	driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
		RadioButtonvalues.click();
		
       driver.navigate().back();
		
		WebElement Element5 =	driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		Element5.click();
		
		WebElement HyperLink =	driver.findElement(By.xpath("//*[normalize-space()='Hyper Link']"));
		HyperLink.click();
		
		WebElement HyperLinkValues =  driver.findElement(By.partialLinkText("Dashboard"));
		HyperLinkValues.click();
		
		
		
		
		
		
	
		
	}
	
	
	
	
	
	
	
}
