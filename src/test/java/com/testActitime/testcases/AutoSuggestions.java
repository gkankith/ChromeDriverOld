package com.testActitime.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://google.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("java");
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		for(int i=0;i<allSugg.size();i++)
		{
			String sugg=allSugg.get(i).getText();
			System.out.println(sugg);
		}
		
		allSugg.get(0).click();

	}

}
