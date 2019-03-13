package com.test.dmt.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.dmt.utility.Constants;

public class BaseFile
 {
	public static WebDriver applicationBaseUrl () throws InterruptedException
	 {
		System.setProperty(Constants.Gecko_Driver, Constants.Gecko_Driver_Path);
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get(Constants.URL);
	    return driver;
	    
	 }

	
 }
