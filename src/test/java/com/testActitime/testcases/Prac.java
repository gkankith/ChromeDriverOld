package com.testActitime.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testActitime.Generic_Utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac extends BaseClass {

	@Test
	public void test() throws Throwable {
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/

		FileInputStream fis=new FileInputStream("src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastrow=wb.getSheet("Sheet1").getLastRowNum();
		for(int i=1;i<=lastrow;i++) {
			int lastcell=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
			for(int j=0;j<lastcell;j++)
			{
				String data=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				
			}
		
		}
	}
}
