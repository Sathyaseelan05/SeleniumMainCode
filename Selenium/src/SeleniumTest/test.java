package SeleniumTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		element.click();
		//*[@id="menuform:j_idt39"]/a - crct
		//*[@id="menuform:j_idt39"]/a/span
		//*[@id="menuform:j_idt39"]/a/span
		Thread.sleep(2000);
		
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a/span"));
		Button.click();
		Thread.sleep(2000);
		
		
		
		WebElement getposition = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point pose = getposition.getLocation();
		int act = pose.getX();
		System.out.println("position of element :"+ act);
		
		Thread.sleep(2000);
		
		WebElement elementdrop = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		elementdrop.click();
		
		WebElement Buttondrop = driver.findElement(By.xpath("//*[@id=\"menuform:m_dropdown\"]/a/span"));
		Buttondrop.click();
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		System.out.println("name of element :" + select);
		
		

	}

}
