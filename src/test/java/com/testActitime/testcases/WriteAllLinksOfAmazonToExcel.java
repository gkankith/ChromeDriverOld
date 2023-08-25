package com.testActitime.testcases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteAllLinksOfAmazonToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		for(int i=0;i<count;i++)
		{
			String url = allLinks.get(i).getAttribute("href");
			
			FileInputStream fis=new FileInputStream("src/test/resources/testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet("Sheet2").getRow(i).getCell(0).setCellValue(url);
			FileOutputStream fos=new FileOutputStream("src/test/resources/testdata.xlsx");
			wb.write(fos);
			wb.close();
			
		}
		driver.close();
		

	}

}
