package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Generic class for all webdriver related Elements
 * @author Sandeep
 *
 */
public class WebDriverCommonLib {
	/**
	 * implicit wait
	 * @param driver
	 */
public void waitForPageToLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
/**
 * Explicit wait for visibility of the element
 * @param driver
 * @param element
 */
public void waitForElement(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(element));
}
/**
 * CustomWiatForElementIsEnabled
 * @param element
 */
public void customWaitForElementIsEnabled(WebElement element) {
	int i=0;
	while(i<100) {
		try {
			element.isEnabled();
			break;
		}
		catch(Exception e) {
			i++;
		}
	}
}
/**
 * select by using index
 * @param element
 * @param index
 */
	public void select(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * select by using visible text
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
}
