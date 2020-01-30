package org.Retry.Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{
	int count=0;
	int maxRetryCount=2;
	@Override
	public boolean retry(ITestResult result) {
		if (count<maxRetryCount) {
			count++;
			return true;	
		}
		return false;
	}
}
