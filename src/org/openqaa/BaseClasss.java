package org.openqaa;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClasss {
	static WebDriver driver;
	public static void launchBrowser (String Url)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91729\\eclipse-workspace\\SeleniumProjectChrome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
	}
	public static void type(WebElement loc,String in) {
		loc.sendKeys(in);
		
	}
	public static void click(WebElement loc) {
		loc.click();
		}
	public static void closeBrowser() {
	driver.quit();	
	}
	public static void ScreenShot(String path) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dec = new File(path);
		FileUtils.copyFile(src, dec);
	}
		
		
	}
		
		
	



