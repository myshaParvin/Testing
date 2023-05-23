package com.appium.addToCart;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class ToguMogu {

	static AppiumDriver driver;
	
public static void main(String[] args) {
		
		try {
			setUp();
		}catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	public static void setUp() throws Exception {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName","sdk_gphone64_x86_64");
		
		dc.setCapability("udid","emulator-5554");
		
		dc.setCapability("platformName","Android");
		
		dc.setCapability("platformVersion","12");
		dc.setCapability("appPackage","com.togumogu");
		dc.setCapability("appActivity","com.togumogu.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, dc);
		
		System.out.println("ToguMogu App is Starting....");
		
		
	}
	
	
	public void test() {
	    
	    driver.findElement(By.xpath("//*[@id='mobileTextField']")).sendKeys("01684223960");
	    driver.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("1234");
	    driver.findElement(By.xpath("//*[@id='loginButton']")).click();
	   
	}
}
