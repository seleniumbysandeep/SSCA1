package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(id="username")
private WebElement untbx;  

@FindBy(name="pwd")
private WebElement pwtbx;

@FindBy(xpath="//div[.='Login ']")
private WebElement lgbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);        //initialisation 
}
public void setUser(String un){
	untbx.sendKeys(un);             //utilization
}
public void setPassword(String pw) {
	pwtbx.sendKeys(pw);
}
public void clickLogin() {
	lgbtn.click();
}
public void setLogin(String un,String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
}
}
