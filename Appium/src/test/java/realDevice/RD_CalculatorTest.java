package realDevice;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RD_CalculatorTest {
	
//  AppiumDriver driver;
    AppiumDriver<MobileElement> driver;
    @BeforeTest
    public void setup() throws Exception {
        System.out.println("connecting to devices");
        String AppiumServer = "http://localhost:4755/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        //DevicesDetails
        caps.setCapability("udid", "emulator-5554");                             //adb devices
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "15.0");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");

        //ApplicationDetails
//      caps.setCapability("", "");
//      caps.setCapability("", "");

        //driver = new ChromeDriver();
//      driver = new AppiumDriver(new URL(AppiumServer), caps);     //create a device session
        driver = new AppiumDriver<MobileElement>(new URL(AppiumServer), caps);     //create a device session
    }





    @AfterTest
    public void teardown() {
        System.out.println("dis-connecting to devices");
    }



    @Test
    public void verifyAddTest() {

        System.out.println("add test case");
    }


 
}
 
	

