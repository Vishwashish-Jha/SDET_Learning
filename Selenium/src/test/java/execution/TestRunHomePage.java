package execution;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import utility.BaseClassParameters;
import utility.ReadConfig;

public class TestRunHomePage extends BaseClassParameters {
//public class TestRunHomePage extends BaseClass {
	
	
	
	ReadConfig rg = new ReadConfig();
	public TestRunHomePage() throws Exception {
		super();
		
	}
	
	
	
//	@Test(retryAnalyzer = listener.RetryTest.class)
	@Test(priority = -1)
	public void login() throws Exception {
		
		
		driver.get(rg.getappURL());
		
		
		HomePage hp = new HomePage(driver);
		hp.setUserfName("Vishwashish");
		hp.setUserlName("Jha");
		hp.setUsergender();
		hp.setUserMobNumber("9560112258");
		hp.submit();
		
		String ActText = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']")).getText();
		String ExpText = "Thanks for submitting the form";
		
		System.out.println("Text Received :"+ ActText);
		Assert.assertTrue(ActText.contains(ExpText));
		
		hp.closePopup();
		Thread.sleep(2000);
		
		
		
	}
	
	
}