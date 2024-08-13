package seleniumPackage;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	
	@Test
	public void screenshotbyrobot() throws IOException, AWTException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:www.google.com");
	
	
	Robot robot = new Robot();
	Dimension dimen  = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rect = new Rectangle(dimen);
    BufferedImage sourcefile =  robot.createScreenCapture(rect);
    File file = new File("C://sample.png");
    ImageIO.write(sourcefile, "png", file);

	
	
	
	
	
	
	
	
	
	}}
