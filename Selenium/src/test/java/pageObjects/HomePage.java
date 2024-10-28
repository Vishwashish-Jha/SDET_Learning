package pageObjects;

import static utility.CustomMethods.clickUsingJS;
import static utility.CustomMethods.initializeCusotmMethodsDriver;
import static utility.CustomMethods.sendKeysUsingJS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	JavascriptExecutor js;
	
	private By fName = By.id("firstName");
	private By lName = By.id("lastName");
	private By gender = By.xpath("//*[@id='gender-radio-1']");
	private By mobNumber = By.id("userNumber");
	private By submitBtn = By.id("submit");
	private By closeBtn = By.id("closeLargeModal");
	
	
	

	public HomePage(WebDriver driver) throws Exception {

		this.driver=driver;	
		initializeCusotmMethodsDriver(driver);
		System.out.println(driver + "In Home Page ********************************************");
		
	
	}
	
	
	 

	public void setUserfName(String FirstName) throws Exception {
		driver.findElement(fName).clear();
		Thread.sleep(2000);
		String name = FirstName;
		sendKeysUsingJS(driver.findElement(fName),name);
	}

	
	public void setUserlName(String LastName) throws Exception {
		driver.findElement(lName).clear();
		Thread.sleep(2000);
		sendKeysUsingJS(driver.findElement(lName),LastName);
	}
	
	public void setUsergender() throws Exception {
		
		clickUsingJS(driver.findElement(gender));
		Thread.sleep(2000);
		
	}
	
	public void setUserMobNumber(String mobile) throws Exception {
		
		driver.findElement(mobNumber).clear();
		Thread.sleep(2000);
		sendKeysUsingJS(driver.findElement(mobNumber),mobile);
		
	}
	
	public void submit() throws Exception {
		
		clickUsingJS(driver.findElement(submitBtn));

	}

	public void closePopup() throws Exception {
		
		clickUsingJS(driver.findElement(closeBtn));

	}

	
	
}
