package testRun;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		
		features = ".\\CoforgeFeature\\Login.feature",
		glue = "stepDef",
		
				monochrome=true,
				dryRun = false,
				tags= "@sanity",
				plugin= {"pretty",
							"html:target/coforge_CucumberReport.html" }
	
		
		
		)



public class TestRunner extends AbstractTestNGCucumberTests{

	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		
		return super.scenarios();
	}
	
}
