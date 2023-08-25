package com.testActitime.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		try {
			driver.get("https://www.facebook.com/");
			System.out.println("it is loaded within 10 seconds");
		}
		catch(Exception ob)
		{
			System.out.println("it is not loaded wihtin specified time");
		}
		
		
	//	String colour = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
	//	System.out.println(colour);
				
	}

}
