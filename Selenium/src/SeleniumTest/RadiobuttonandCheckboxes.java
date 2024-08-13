package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonandCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml;jsessionid=node0pg884nq3ccuw12wnwv3xiifgb2722409.node0");
		
		WebElement browser = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
		browser.click();
		
		WebElement chrome = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]"));
		if(chrome.isSelected());
		chrome.click();
		
		WebElement firefox = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[2]/div/div[2]/span"));
		if(firefox.isSelected());
		firefox.click();
		
		WebElement safari = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[3]/div/div[2]/span"));
		if(safari.isSelected());
		safari.click();
		
		WebElement edge = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/div/div[2]"));
		if(edge.isSelected());
		edge.click();
		
		WebElement agegroup = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]/span"));
		boolean select = agegroup.isSelected();
		System.out.println(select);
		driver.quit();
		
		
		
		

	}

}
