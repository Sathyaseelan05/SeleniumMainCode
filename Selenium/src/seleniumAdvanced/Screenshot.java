package seleniumAdvanced;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Response.OutputType;

public class Screenshot {
	
	public static void main(String[] args) throws AWTException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		
		
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourcefile = screenshot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File file1 = new File("C:\\sample.png");
		org.openqa.selenium.io.FileHandler.copy(sourcefile, file1);
		
		
		
		 Robot robot = new Robot();
		 Dimension dimension =
		  Toolkit.getDefaultToolkit().getScreenSize(); 
		 Rectangle rectangle = new Rectangle(dimension);
		  BufferedImage sfile= robot.createScreenCapture(rectangle); 
		 File dfile = new File("C://sample.png");
		 ImageIO.write(sfile, "png", dfile);
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Robot robot = new Robot(); Dimension size =
		 * Toolkit.getDefaultToolkit().getScreenSize(); Rectangle rectangle = new
		 * Rectangle(size); BufferedImage image= robot.createScreenCapture(rectangle);
		 * File file = new File("C://robotsnap.png"); ImageIO.write(image, "png", file);
		 */
		
		
		
		
		
		
	}

}
