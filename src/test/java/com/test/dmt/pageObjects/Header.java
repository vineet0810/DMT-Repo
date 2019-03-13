package com.test.dmt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header
 {
  
WebDriver headerDriver;
	
	public Header(WebDriver driver)
	{
	   this.headerDriver = driver;
	}
	
	// Web element variables 
	
	@FindBy(how = How.ID, using = "A2")
	@CacheLookup
	private WebElement railWay_FormData;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[2]/a/span[1]")
	@CacheLookup
	private WebElement tab_Admin;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[3]/a/span[1]")
	@CacheLookup
	private WebElement tab_MyBooking;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[4]/a/span[1]")
	@CacheLookup
	private WebElement tab_Account;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[5]/a/span[1]")
	@CacheLookup
	private WebElement tab_Report;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[6]/a/span[1]")
	@CacheLookup
	private WebElement tab_Misc;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[7]/a/span[1]") 
	@CacheLookup
	private WebElement tab_Flights;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[7]/a/span[1]")
	@CacheLookup
	private WebElement tab_Railway;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[7]/a/span[1]")
	@CacheLookup
	private WebElement tab_MoneyTransfer;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[7]/a/span[1]")
	@CacheLookup
	private WebElement tab_Recharge;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[7]/a/span[1]")
	@CacheLookup
	private WebElement tab_Hotel;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[7]/a/span[1]")
	@CacheLookup
	private WebElement tab_Bus;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[6]/div[3]/nav/div/ul/li[7]/a/span[1]")
	@CacheLookup
	private WebElement tab_Payment;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[5]/a/img")
	@CacheLookup
	private WebElement logOut;    
	
	
	
	
	
 }
