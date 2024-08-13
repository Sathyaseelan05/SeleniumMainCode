package seleniumAdvanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node0ss8w6h8bge5w13hbgm1xehsiz4987132.node0");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));	
        upload.click();
        
        String file = "";
        
        StringSelection selection = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
       
        
	
	
	
	
	
	
	}
	
	
	

}
