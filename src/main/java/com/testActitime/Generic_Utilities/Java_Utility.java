package com.testActitime.Generic_Utilities;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;

public class Java_Utility {
	
	public int random() {
		Random r=new Random();
		int ranNum = r.nextInt(1000);
		return ranNum;
	}

}
