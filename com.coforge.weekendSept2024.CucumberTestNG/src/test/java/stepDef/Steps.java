package stepDef;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Steps {
	
	WebDriver driver;
	LoginPage lp;
	
	
	@Before
	public void setup(Scenario sc) {
		
		System.out.println("==========================================:"+ sc.getName());
	}
	
	
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//PageObjectCreated
		lp = new LoginPage(driver);
		
		
	    
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String appURL) {
		
		driver.get(appURL);
	    
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_Username_as_and_Password_as(String uname, String pwd) {
	    
//		driver.findElement(By.name("username")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(pwd);
		
		lp.enterUserName(uname);
		lp.enterPassword(pwd);
		
	}

	@When("Click on Login")
	public void click_on_Login() {
		
		
//		driver.findElement(By.tagName("button")).click();
		lp.clickOnLogin();
	    
	}

	@Then("Page URL should contains be {string}")
	public void page_URL_should_contains_be(String expValue) throws Exception {
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getCurrentUrl().contains(expValue));
	    
	}

	@When("User click on user dropdown")
	public void user_click_on_user_dropdown() {
		
//		driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		lp.clickOnUserDropDown();
	    
	}

	@When("User click on Logout")
	public void user_click_on_Logout() {
		
//		driver.findElement(By.cssSelector("[href*='logout']")).click();
		lp.clickOnLogout();
	    
	}

	@Then("Close browser")
	public void close_browser() throws Exception {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	    
	}

	

}
