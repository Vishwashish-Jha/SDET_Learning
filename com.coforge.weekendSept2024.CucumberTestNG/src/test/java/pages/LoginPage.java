package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	
	public LoginPage(WebDriver rdriver) {
		
		
//		this.driver = driver;
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	
	//Identification
	
//	By txtUserName = 	By.name("username");
//	By txtPassword = 	By.xpath("//input[@placeholder='Password']");
//	By btnLogin = 		By.tagName("button");
//	By listUserDropDown =By.cssSelector(".oxd-userdropdown-name");
//	By btnLogout = 		By.partialLinkText("Logo");
	
	@FindBy(name = "username")
	WebElement txtUserName;
	
	@FindBy(xpath  = "//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(tagName  = "button")
	WebElement btnLogin;
	
	@FindBy(css = ".oxd-userdropdown-name")
	WebElement listUserDropDown;
	
	@FindBy(partialLinkText  = "Logo")
	WebElement btnLogout;
	
	
	
	
	//Actions/methods
	
	
//	public void login(String user, String pass) {
//		
//		
//		enterUserName(user);
//		enterPassword(pass);
//		clickOnLogin();
//	}
	
	
	
	
	public void enterUserName(String uName) {
		
//		driver.findElement(txtUserName).sendKeys(uName);
		txtUserName.sendKeys(uName);
		
	}
	
	public void enterPassword(String pwd) {
		
		txtPassword.sendKeys(pwd);
		
	}
	
	
	public void clickOnLogin() {
		
		btnLogin.click();;
		
	}
	
	public void clickOnUserDropDown() {
		
		listUserDropDown.click();
		
	}
	
	
	public void clickOnLogout() {
		
		btnLogout.click();;
		
	}
	
	
	
	public void verifyApplicationTitle(String expValue) throws Exception {
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expValue);
		
	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public void enterUserName() {
//		
//		driver.findElement(txtUserName).sendKeys("DefaultAdminValue");
//		
//	}
//	
//	public void enterPassword() {
//		
//		driver.findElement(txtPassword).sendKeys("Admin");
//		
//	}
//	
//	
//	public boolean verifyUserNameDisplayed() {
//		
////		return driver.findElement(txtUserName).isDisplayed();
//		
//		return verifyElementDisplayed(txtUserName);
//	}
//	
//	
//	public boolean verifyElementDisplayed(By locator) {
//		
//		return driver.findElement(locator).isDisplayed();
//	}

}
