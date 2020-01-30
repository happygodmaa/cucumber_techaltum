package org.webDriver.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyITestListener implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println(arg0.getName());		
	}
	
	@Override
	public void onStart(ITestContext arg0) {
		System.out.println(arg0.getName());	
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println(arg0.getName());
		System.out.println(arg0.getInstanceName());
		System.out.println(arg0.getTestName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
