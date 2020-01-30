package org.techAltum.runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		
		features = "src/test/resources/features/",     //Address of Features
		glue = {"org.techAltum.stepDefinition"},       //Address of stepDefinition
		//format =   is depreacted now
		plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestRpoert.json"},       //Format of report, Address of report, Type of report
		dryRun = false,                               //To check that mapping is proper b/w feature file and step defn
		tags = {"@Smoke"},                            // Tags to run scenario
		monochrome = true,                            //Display the console output in in proper readable format
		strict = true                                 //To check if any step is not define in step defn file
		)

public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "cucumber", description = "Cucumber Project", dataProvider = "features")
	public void feature(PickleEventWrapper eventWrapper, CucumberFeatureWrapper cucumberFeatureWrapper) throws Exception{
		try {
			testNGCucumberRunner.runScenario(eventWrapper.getPickleEvent());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideScenarios();
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		testNGCucumberRunner.finish();
	}

}


