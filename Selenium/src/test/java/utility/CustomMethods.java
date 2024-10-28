package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomMethods{

	public static WebDriver driver;
	public static JavascriptExecutor js;
	
public static void initializeCusotmMethodsDriver(WebDriver rdriver) throws Exception {
	
	
	driver = rdriver;
	System.out.println(driver + "In CustomMethod Page ***************************************");
	Thread.sleep(2000);
	js=(JavascriptExecutor)driver;

}
	
public CustomMethods(WebDriver driver) throws Exception {
		super();
		
	}



public static void sendKeysUsingJS (WebElement element ,String text) throws Exception {
		
	
	Thread.sleep(2000);
	js.executeScript("arguments[0].value=arguments[1]", element,text);
		
	}

public static void clickUsingJS (WebElement element) throws Exception {
	
	Thread.sleep(2000);
	js.executeScript("arguments[0].click()", element);
	
}



}
