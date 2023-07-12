package com.TFH.test;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.TFH.commons.commons;
import io.appium.java_client.android.AndroidDriver;

public class login1 {
	@Test
public static void loginTest() throws MalformedURLException
{
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability("deviceName", "30cc6c3b");
dc.setCapability("platformName", "Android");
dc.setCapability("appPackage", "com.avegen.together3.16");
dc.setCapability("appActivity", "com.avegen.together.MainActivity");

URL remoteUrl = new URL("http://localhost:4723/wd/hub");
commons.driver = new AndroidDriver(remoteUrl, dc);
commons.driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

WebElement allow=commons.driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']"));
allow.click();
WebElement eng=commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Eng']"));
eng.click();
WebElement next1 = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
next1.click();
WebElement name = commons.driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']"));
name.sendKeys("Dipali");
System.out.println("first name you have entered is:"+name);
WebElement next2 = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
next2.click();
WebElement month = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='6']"));
month.click();
WebElement next3 = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
next3.click();
WebElement signIn=
commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Sign in with Google']"));
signIn.click();
WebElement addAct=commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Add another account']"));
addAct.click();
WebElement createAct=commons.driver.findElement(By.xpath("//android.widget.Button[@text='Create account']"));
createAct.click();
commons.driver.findElement(By.xpath("//android.view.MenuItem[@text='For myself']")).click();
WebElement fName=commons.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='firstName']"));
fName.sendKeys("TFH");
WebElement lName=commons.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='lastName']"));
lName.sendKeys("Application");
WebElement next4=commons.driver.findElement(By.xpath("//android.widget.Button[@text='Next']"));
next4.click();
WebElement month1=commons.driver.findElement(By.xpath("//android.view.View[@resource-id='month-label']"));
month1.click();
commons.driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='January']")).click();
WebElement day1=commons.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='day']"));
day1.sendKeys("11");
WebElement year=commons.driver.findElement(By.xpath("//android.widget.TextView[@index='2']"));
year.sendKeys("1990");
WebElement gender=commons.driver.findElement(By.xpath("//android.widget.TextView[@index='3']"));
gender.click();
WebElement genSel=commons.driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Female']"));
genSel.click();
next4.click();
WebElement rBtn=commons.driver.findElement(By.xpath("//android.widget.RadioButton[@xtext='tfhapplication@gmail.com']"));
rBtn.click();
next4.click();
WebElement pWord=commons.driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
pWord.sendKeys("654321tfh");
next4.click();
WebElement phoneNo=commons.driver.findElement(By.xpath("//android.widget.EditText[@resource-id='phoneNumberId']"));
phoneNo.sendKeys("8855851285");
next4.click();
commons.driver.findElement(By.xpath("//android.widget.Button[@text='Yes, I’m in']")).click();
next4.click();
commons.driver.findElement(By.xpath("//android.widget.Button[@text='I agree']")).click();
WebElement home = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Your Current Week']"));
assertTrue(home.isDisplayed());
}
}
