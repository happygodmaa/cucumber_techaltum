package org.techAltum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.webDriver.listener.WebEventListener;

public class OnetravelHomePage {

	WebDriver driver;
	public OnetravelHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "input[class='pqr']")
	public WebElement fromCityTextBox;
	public void enterFromCity(String cityCode) {
		fromCityTextBox.sendKeys(cityCode);
	}
	
	
	@FindBy(how = How.ID, using = "abc")
	WebElement textBox;
	public void doSomething() {
		textBox.click();
	}
	
	public OnetravelHomePage selectDate() {
		
	
		return this;
		//return new OnetravelHomePage(driver);
	}
	
	
	@FindBy(how = How.ID, using = "pqr")
	WebElement searchButton;
	public OnetravelListingPage clickOnSearchButton() {
		searchButton.click();
		
		return new OnetravelListingPage(driver);
	}
}
