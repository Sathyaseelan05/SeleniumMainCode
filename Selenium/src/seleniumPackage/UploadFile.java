package seleniumPackage;

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
import org.testng.annotations.Test;



//C:\Users\sathya\Downloads\Photograph.jpg
public class UploadFile {
	
	WebDriver driver;
	
	@Test
    public void UploadaFile() throws AWTException, InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node0ss8w6h8bge5w13hbgm1xehsiz4987132.node0");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
     WebElement upload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));	
     upload.click();
     
     String file = "C:\\Users\\sathya\\Downloads\\Photograph.jpg";
     
     
     
     StringSelection selection = new StringSelection(file);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
     
     Robot robot = new Robot();
     robot.keyPress(KeyEvent.VK_CONTROL);
     Thread.sleep(2000);
     robot.keyPress(KeyEvent.VK_V);
     Thread.sleep(2000);
     
     robot.keyRelease(KeyEvent.VK_CONTROL);
     
     robot.keyRelease(KeyEvent.VK_V);
     
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	
    }
    
}
