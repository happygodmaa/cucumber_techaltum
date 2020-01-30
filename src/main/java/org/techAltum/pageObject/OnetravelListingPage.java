package org.techAltum.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OnetravelListingPage {

	private WebDriver driver;
	
	public OnetravelListingPage(WebDriver driver) {
		this.setDriver(driver);
		PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, OnetravelHomePage.class);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "abc")
	public WebElement selectButton;
	public OnetravelListingPage verifyContract(String contractType) {
		if(contractType.equalsIgnoreCase("Basic Economy")) {
			selectButton.click();
		}
		return this;
	}

}
