package com.testActitime.testcases;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Wings of fire"+Keys.ENTER);
		driver.findElement(By.linkText("Wings Of Fire By Dr A P J Abdul Kalam")).click();
		Set<String> allwhs = driver.getWindowHandles();
		ArrayList<String> whs=new ArrayList<String>(allwhs);
		driver.switchTo().window(whs.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	}

}
