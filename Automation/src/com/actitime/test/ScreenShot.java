package com.actitime.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testScreenShot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//type cast the object to access the method
		TakesScreenshot t=(TakesScreenshot) driver;
		//take the screen shot in file format 
		File src = t.getScreenshotAs(OutputType.FILE);
		//open the empty file in current java project under screen shot folder
		File dest=new File("./ScreenShot/ss.png");
		//copy paste the screen shot to required location from ram
        FileUtils.copyFile(src, dest);
		driver.close();
	}
	
}
