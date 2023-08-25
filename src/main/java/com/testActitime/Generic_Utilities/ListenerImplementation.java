package com.testActitime.Generic_Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"Test Execution Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"Test Execution Success");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"Test Execution Failure");
		Webdriver_Utility wlib=new Webdriver_Utility();
        wlib.takeScreenshot(BaseClass.sdriver, methodName);
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"Test Execution skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Execution Started");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Execution completed");
		
	}
	
	

}
