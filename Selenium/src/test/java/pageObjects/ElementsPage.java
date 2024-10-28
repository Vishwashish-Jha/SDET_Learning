package pageObjects;

import static utility.CustomMethods.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
	
	
	WebDriver driver;
	
	public ElementsPage(WebDriver driver) throws Exception {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		initializeCusotmMethodsDriver(driver);
	}

	@FindBy(xpath="//div[text()='Elements']")
	WebElement elementsTab;
	
	@FindBy(xpath="//li[@id='item-3']")
	WebElement webTableTab;
	
	@FindBy(id="addNewRecordButton")
	WebElement addBtn;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="age")
	WebElement age;
	
	@FindBy(id="salary")
	WebElement salary;
	
	@FindBy(id="department")
	WebElement department;
	
	@FindBy(id="submit")
	WebElement submit;
	
	public void clickElementsTab() throws Exception {
		
		clickUsingJS(elementsTab);
	}
	
	public void clicksubmit() throws Exception {
		
		clickUsingJS(submit);
	}

	public void clickwebTableTab() throws Exception {
		
		clickUsingJS(webTableTab);
	}

	public void clickaddNewRecordButton() throws Exception {
		
		clickUsingJS(addBtn);
	}

	public void enterFirstName(String fName) throws Exception {
		
		sendKeysUsingJS(firstName,fName);
	}

	public void enterLastName(String lName) throws Exception {
		
		sendKeysUsingJS(lastName,lName);
	}

	public void enterAge(String ages) throws Exception {
		
		sendKeysUsingJS(age,ages);
	}

	public void enterSalary(String sal) throws Exception {
		
		sendKeysUsingJS(salary,sal);
	}

	public void enterDepartment(String dept) throws Exception {
		
		sendKeysUsingJS(department,dept);
	}

	public void enterUserEmail(String email) throws Exception {
		
		sendKeysUsingJS(userEmail,email);
		
	}
	


}
