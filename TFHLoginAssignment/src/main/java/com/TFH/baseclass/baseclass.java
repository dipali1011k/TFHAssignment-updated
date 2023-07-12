package com.TFH.baseclass;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.TFH.commons.commons;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class baseclass {
	
	@BeforeTest
	public static void setUp() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "30cc6c3b");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\hp\\Downloads\\TFH.apk");

           URL appiumServerURL;
        try {
            appiumServerURL = new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }       
        AndroidDriver driver = new AndroidDriver(appiumServerURL, desiredCapabilities);
System.out.println("app is installed successfully....");
  }
	@AfterTest
public static void tearDown()
{
	try {
		if (commons.driver != null) {
			commons.driver.close();
		}
	} catch (Exception e) {
		System.out.println(e.getCause());
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
	
}


