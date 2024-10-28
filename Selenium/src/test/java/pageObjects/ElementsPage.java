package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {
	
	
	WebDriver driver;
	
	public ElementsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
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
	
	public void clickElementsTab() {
		
		elementsTab.click();
	}

}
