package org.techAltum.stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.techAltum.helper.BaseClass;
import org.techAltum.pageObject.OnetravelHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OneTravelHomeStepDefn {
	OnetravelHomePage otHome;
	//BaseClass baseClass;
	//WebDriver driver;
	BaseClass baseClass;
	//ServiceHooks
	public OneTravelHomeStepDefn(ServiceHooks serviceHooks) {
		//this.baseClass = baseClass;
		//baseClass = new BaseClass();
		//baseClass.initDriver();
		 //= baseClass.driver;
		System.out.println("In step defn =  Hi");
		otHome = new OnetravelHomePage(serviceHooks.baseClass.driver); 
	}
	
	  @Given("User is on onetravel home page") public void
	  user_is_on_onetravel_home_page() { 
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("A");
		  otHome.enterFromCity("LAS");
	  }
	 

	@Then("Verify that flight tab is selected")
	public void verify_that_flight_tab_is_selected() {
		System.out.println("B");
	}

	@Then("Veriy that round trip is selected")
	public void veriy_that_round_trip_is_selected() {
		System.out.println("C");
	}

	@Then("Enter source city")
	public void enter_source_city() {
		System.out.println("D");
	}

	@Then("Enter destination city")
	public void enter_destination_city() {
		System.out.println("E");
	}

	@Then("select depart date")
	public void select_depart_date() {
		System.out.println("F");
	}

	@Then("select return date")
	public void select_return_date() {
		System.out.println("G");
	}

	@Then("Click on search now")
	public void click_on_search_now() {
		System.out.println("H");
	}
	
	@Then("Veriy that oneway is  selected")
	public void veriy_that_oneway_is_selected() {
	    System.out.println("Hi");
	}
	
	@Then("Listing page should appear")
	public void listing_page_should_appear() {
		System.out.println("I");
	}

	@Then("Verify search details on Listing page")
	public void verify_search_details_on_Listing_page() {
		System.out.println("J");
	}


	@Then("Enter source city {string}")
	public void enter_source_city(String sourceCity) {
	    System.out.println("Source city is = " + sourceCity);
	}

	@Then("Enter destination city {string}")
	public void enter_destination_city(String destCity) {
	    System.out.println("Dest city = " + destCity);
	}

	@Then("select depart date {string}")
	public void select_depart_date(String departDate) {
	    System.out.println("Depart date = " + departDate);
	}
	
	@Then("Send tickets to passengers")
	public void send_tickets_to_passengers(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Hi");
		List<String> passengerName = dataTable.asList(String.class);
	}
	
	@Then("initiate search with {string}, {string}, {string}, {string}")
	public void initiate_search_with(String from, String to, String departDate, String returnDate) {
	   
	}
	
	@Then("Please do practice")
	public void please_do_practice() {
	    System.out.println("Pls do practice.");
	}

}
