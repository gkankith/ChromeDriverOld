package com.testActitime.Generic_Utilities;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility {
	
	public void selectByVisibleText(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public String takeScreenshot(WebDriver driver, String screenshotname) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Screenshots"+screenshotname+".png");
		return dest.getAbsolutePath();
		
		
	}

}
