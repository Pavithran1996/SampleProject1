package org.openqaa;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Launch extends BaseClasss {
	public static void main(String[]args) throws IOException
	{
		launchBrowser("https://www.facebook.com/");
		ScreenShot("C:\\Image\\S.png");
		WebElement e = driver.findElement(By.id("email"));
		type(e,"pavi");
		WebElement p = driver.findElement(By.id("pass"));
		type(p,"pranav");
		ScreenShot("C:\\Image\\S1.png");
		WebElement btn = driver.findElement(By.id("loginbutton"));
		btn.click();
		ScreenShot("C:\\Image\\S3.jpeg");
		closeBrowser();
		
	}

}
