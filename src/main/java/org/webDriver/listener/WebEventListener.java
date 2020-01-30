package org.webDriver.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.techAltum.helper.BaseClass;
import org.testng.Reporter;

public class WebEventListener extends BaseClass implements WebDriverEventListener{

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		Reporter.log("Text on alert is = " + driver.switchTo().alert().getText());
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		Reporter.log("Accepting the alert.");
		driver.switchTo().alert().accept();
		Reporter.log("Alert accepted.");		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		Reporter.log("Alert is dismissed.");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		Reporter.log("Text before dismiss the alert is = " + driver.switchTo().alert().getText());
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		Reporter.log("Navigating to url = " + url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		Reporter.log("Navigation is complete on url = " + url);
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		Reporter.log("Navigating back");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		String text = driver.findElement(by).getText();
		Reporter.log("Text before find element is = " + text);
		
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {

		Reporter.log("This is before script.");
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println("This is after script.");
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
}
