package com.testActitime.testcases;

import static org.testng.Assert.fail;

import java.awt.Window;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.testActitime.Generic_Utilities.BaseClass;
import com.testActitime.Generic_Utilities.Excel_Utility;
import com.testActitime.Generic_Utilities.File_Utility;
import com.testActitime.Generic_Utilities.Java_Utility;
import com.testActitime.Generic_Utilities.Webdriver_Utility;
import com.testActitime.pageobjects.HomePage;
import com.testActitime.pageobjects.LoginPage;
import com.testActitime.pageobjects.TaskPage;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.testActitime.Generic_Utilities.ListenerImplementation.class)
public class TC_Login_001Test extends BaseClass {
	
	@Test
	public void tc_Login_001Test() throws Throwable {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File_Utility f=new File_Utility();
		String baseurl=f.getPropertyData("url");
		driver.get(baseurl);
		String uname=f.getPropertyData("username");
		String pass=f.getPropertyData("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(uname, pass);
		lp.clickOnLogin();
		
		HomePage hp=new HomePage(driver);
		hp.clickOnTasklink();
		Assert.fail();
		
		TaskPage tp=new TaskPage(driver);
		tp.clickOnAddNewBtn();
		tp.clickOnNewCust();
		driver.manage().window().maximize();
		Excel_Utility ex=new Excel_Utility();
		String name=ex.getExcelData("Sheet1", 1, 2);
		String desc=ex.getExcelData("Sheet1", 2, 2);
		Java_Utility j=new Java_Utility();
		int rNum = j.random();
		tp.enterCustName(name+rNum);
		tp.enterCustDesc(desc+rNum);
		tp.clickOnSelCustDD();
		Thread.sleep(1000);
		tp.selbbComp();
		tp.createCustomer();
		Thread.sleep(2000);
		tp.logout();
		
		
	}

}
