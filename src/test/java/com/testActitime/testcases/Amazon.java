package com.testActitime.testcases;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("7995820199");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Bangaru@123");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ganesha idol"+Keys.ENTER);
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//span[text()='TIED RIBBONS Ganesh Idol Statue for Decoration Gift Home Décor Living Room Festival Office (16 cm X 12.9 cm)(Resin, MULTICOLUR)']")).click();

		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> whs = new ArrayList<String>(allwh);		
		driver.switchTo().window(whs.get(1));



		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='shipToThisAddressButton-announce']")).click();


		Thread.sleep(2000);


		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-small']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")).click();

		driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")).click();
		driver.switchTo().window(whs.get(2));
		driver.findElement(By.id("pp-7E3JpA-15")).sendKeys("4017097652109129");
		driver.findElement(By.id("pp-WsnRGI-17")).sendKeys("BESTA DEEPIKA");
		WebElement date = driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[1]"));
		Select sc=new Select(date);
		sc.selectByValue("12");
		WebElement year = driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[2]"));
		Select s=new Select(year);
		s.selectByValue("2024");
		driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent")).click();




	}


}

