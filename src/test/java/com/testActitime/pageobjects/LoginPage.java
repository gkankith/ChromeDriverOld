package com.testActitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement untxtbx;
	
	@FindBy(name="pwd")
	private WebElement passtxtbx;
	
	@FindBy(id="loginButton")
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUntxtbx() {
		return untxtbx;
	}

	public WebElement getPasstxtbx() {
		return passtxtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	//logic
	 public void login(String uname, String pass) {
		 untxtbx.sendKeys(uname);
		 passtxtbx.sendKeys(pass);
		 
	 }
	public void clickOnLogin() {
		lgbtn.click();
	}
}
