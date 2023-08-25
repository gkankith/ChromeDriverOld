package com.testActitime.Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("database connection",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("parallel execution",true);
	}
	
	@BeforeClass
	public void beforeClass() throws Throwable {
		Reporter.log("launching browser",true);
		driver=sdriver;
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("closing browser",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("parallel execution done",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("closed database connection",true);
	}
}

