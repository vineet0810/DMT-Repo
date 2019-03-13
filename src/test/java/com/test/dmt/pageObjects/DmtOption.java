package com.test.dmt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DmtOption
 {
	
     WebDriver PinValidateDriver;
	
	// Constructor to initiate DmtOption 
	public DmtOption(WebDriver driver)
	{
	   this.PinValidateDriver = driver;
	}
	
	
	// Web element variables 
	
	 @FindBy(how = How.ID, using = "dmtpintxt")
	 @CacheLookup
	 private WebElement pinNumber;
	 
	 @FindBy(how = How.ID, using = "PinValidate")
	 @CacheLookup
	 private WebElement PinValidateButton;
	 
	// User functionality
	 
	 public void type_PinNumber(String pin)
	  {
		 pinNumber.sendKeys(pin);
	  }

	 public void clickOn_PinValidateButton()
	   {
		  PinValidateButton.click();
	   }


 }
