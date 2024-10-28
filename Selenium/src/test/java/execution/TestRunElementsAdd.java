package execution;

import org.testng.annotations.Test;

import pageObjects.ElementsPage;
import utility.BaseClassParameters;
import utility.ReadConfig;

public class TestRunElementsAdd extends BaseClassParameters {
//public class TestRunElementsAdd extends BaseClass {
	
	
	
	ReadConfig rg = new ReadConfig();
	public TestRunElementsAdd() throws Exception {
		super();
		
	}
	
	
	
//	@Test(retryAnalyzer = listener.RetryTest.class)
	@Test(priority = 1)
	public void addElement() throws Exception {
		
		driver.get(rg.getappURL());
		
		ElementsPage ep = new ElementsPage(driver);
		
		ep.clickElementsTab();
		ep.clickwebTableTab();
		ep.clickaddNewRecordButton();
		ep.enterFirstName("Subhashish");
		ep.enterLastName("Jha");
		ep.enterAge("25");
		ep.enterSalary("50000");
		ep.enterUserEmail("SuhashishK4@gmail.com");
		ep.enterDepartment("Accounts");
		ep.clicksubmit();
		
	}
	
	@Test
	public void verifyRecord() {
		
		System.out.println("Write Code to validate the record added");
		
	}

}
