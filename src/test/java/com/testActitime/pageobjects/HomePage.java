package com.testActitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="container_tasks")
	private WebElement tasklink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getTasklink() {
		return tasklink;
	}
	
	public void clickOnTasklink()
	{
		tasklink.click();
	}

}
