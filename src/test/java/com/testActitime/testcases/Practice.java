package com.testActitime.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testActitime.Generic_Utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice extends BaseClass{
	
	@Test
	public void launch() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}

}
