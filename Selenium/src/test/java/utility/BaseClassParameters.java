package utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassParameters {
	
	
	public Logger log;
	ReadConfig rg = new ReadConfig();
	public WebDriver driver;
	
	public BaseClassParameters() throws Exception {
		
		Logger.getLogger("Assessment Log");
		PropertyConfigurator.configure("./config.properties");
		
	}
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		String testBrowser = browser;
		
		if(testBrowser.equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		
		else if(testBrowser.equalsIgnoreCase("Edge"))
			driver = new EdgeDriver();
		
		else if(testBrowser.equalsIgnoreCase("FireFox"))
			driver = new FirefoxDriver();
		
		else if(testBrowser.equalsIgnoreCase("Safari"))
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
