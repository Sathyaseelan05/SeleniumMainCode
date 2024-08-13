package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		
		
		//2. Confirm if the button is disabled
		
		WebElement disabled = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[2]"));
		Boolean Enabled = disabled.isEnabled();
		System.out.println("enabled is :" + Enabled);
		
		
		//3.find the position of the submit button
		WebElement GetPosition = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point submitposition = GetPosition.getLocation();
		int submit = submitposition.getX();
		System.out.println("submit position is :"+ submit);
		
		
		//4.find save button colour
		
		WebElement colour = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
		String colourbutton = colour.getCssValue("color");
		System.out.println("Button colour is:" + colourbutton);
		
	
		//5. find the size of the button
				
				WebElement size = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
				int height = size.getSize().getHeight();
				int width = size.getSize().getWidth();
				System.out.println("height is :" + height + "width is :" + width);
				
				//1 . click and confirm title
				
				WebElement click = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]"));
				click.click();
				
		
		
		
		
		

	}

}
