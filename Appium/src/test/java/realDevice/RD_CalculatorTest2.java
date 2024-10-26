package realDevice;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class RD_CalculatorTest2 {
    
//  AppiumDriver driver;
    AppiumDriver<MobileElement> driver;
    
    @BeforeTest
    public void setup() throws Exception {
        
        System.out.println("connecting to devices");
        String AppiumServer = "http://localhost:4755/wd/hub";
        
        
        
        //DevicesDetails
        DesiredCapabilities caps = new DesiredCapabilities();
        //DevicesDetails
        caps.setCapability("udid", "emulator-5554");                             //adb devices
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "15.0");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
        
        
        
        //ApplicationDetails
        
        //app1 ------ APK info 
        

        
        //app2  ----- adb shell dumpsys window
//      adb shell dumpsys window | find "mCurrentFocus"
//        mCurrentFocus=Window{24a57d1 u0 com.google.android.calculator/com.android.calculator2.Calculator}
//      mCurrentFocus=Window{24a57d1 u0 com.google.android.calculator/com.android.calculator2.Calculator}
        
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        
            
        
        //driver = new ChromeDriver();
//      driver = new AppiumDriver(new URL(AppiumServer), caps);     //create a device session
        driver = new AppiumDriver<MobileElement>(new URL(AppiumServer), caps);     //create a device session
        
    }
    
        
    
    @AfterTest
    public void teardown() throws Exception {
        Thread.sleep(5000);
        driver.closeApp();
        System.out.println("dis-connecting to devices");
    }
    
    
    
    
    
    
    @Test
    public void verifyAddTest() {
        
        
        System.out.println("add test case");
//      com.google.android.calculator:id/digit_9
//      com.google.android.calculator:id/op_add
//      com.google.android.calculator:id/result_final
//      com.google.android.calculator:id/eq
 
        
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(By.id("digit_9")).click();
        driver.findElement(By.id("digit_9")).click();
        driver.findElement(By.id("digit_9")).click();
        
        
        //click on Plus
        driver.findElement(By.id("op_add")).click();
        
        
        driver.findElement(By.id("digit_9")).click();
        driver.findElement(By.id("digit_9")).click();
        driver.findElement(By.id("digit_9")).click();
        driver.findElement(By.id("digit_9")).click();
        
        //click on Plus
        driver.findElement(By.id("eq")).click();
        
        
        //get the Results
        String actualResult = driver.findElement(By.id("result_final")).getText();
        System.out.println("add test Result are: " + actualResult);
        Assert.assertEquals(actualResult, "19998");
        
        
        
    }
}
    
    
    

