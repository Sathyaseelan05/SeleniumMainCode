package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node01n0sjc2j4oj7c1hefj6528d6wt4988737.node0");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement  Exwait = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
		WebElement Drag = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));
		WebElement Drop = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(Drag, Drop).build().perform();
		

	}

}
