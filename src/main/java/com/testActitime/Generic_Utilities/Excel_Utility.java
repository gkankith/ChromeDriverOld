package com.testActitime.Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String getExcelData(String sheet,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
