package testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = ".\\CoforgeFeature\\Login2.feature",
		glue = "stepDef",
		
				monochrome=true,
				dryRun = false,
				tags= "@sanity",
				plugin= {"pretty",
							"html:target/coforge_CucumberReport.html" }
	
		
		
		)



public class TestRunner {

	
	
}
