package utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
	
	ReadConfig rg = new ReadConfig();
	public WebDriver driver;
	
	public BaseClass() throws Exception {
		
		Logger.getLogger("Assessment Log");
		PropertyConfigurator.configure("./config.properties");
		
	}
	
	@BeforeTest
	
	public void launchBrowser() {
		
		
		if(rg.getBrowser().equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		
		else if(rg.getBrowser().equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		
		else if(rg.getBrowser().equalsIgnoreCase("FireFox"))
			driver = new FirefoxDriver();
		
		else if(rg.getBrowser().equalsIgnoreCase("Safari"))
			driver = new SafariDriver();
		
		else 
		{
			System.out.println("Launching in Default browser i.e chrome");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		
		
	}
	 
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
	
	
}
