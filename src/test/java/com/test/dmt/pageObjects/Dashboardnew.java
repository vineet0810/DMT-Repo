package com.test.dmt.pageObjects;

import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Dashboardnew
 {
	
    WebDriver logInDriver;
	
	// Constructor to initiate Dashboardnew 
	public Dashboardnew(WebDriver driver)
	{
	   this.logInDriver = driver;
	}
	
	// Web element variables ********************************************* 
	
	@FindBy(how = How.ID, using = "Img1")
	@CacheLookup
	private WebElement closePopUpImage;
	
	@FindBy(how = How.ID, using = "dmtsearchdiv")
	@CacheLookup
	private WebElement moneyTransfer;
	
	@FindBy(how = How.ID, using = "ui_control_dashboard_lbnjctmoney")
	@CacheLookup
	private WebElement JCT_Money;
	
	@FindBy(how = How.ID, using = "oneshowa") 
	@CacheLookup
	private WebElement Button_OneWay;
	
	@FindBy(how = How.ID, using = "roundshowa")
	@CacheLookup
	private WebElement Button_RoundTrip;
		
	@FindBy(how = How.ID, using = "fromsector")
	@CacheLookup
	private WebElement input_FlyingFrom;

	@FindBy(how = How.ID, using = "ToSector")
	@CacheLookup
	private WebElement input_FlyingTo;
	
	@FindBy(how = How.ID, using = "datepicker")
	@CacheLookup
	private WebElement input_DepartOn;
	
	@FindBy(how = How.ID, using = "outdatepicker1")
	@CacheLookup
	private WebElement input_ReturnOn;
	
	@FindBy(how = How.ID, using = "travelclass")
	@CacheLookup
	private WebElement input_TravelClass;
	
	@FindBy(how = How.ID, using = "Adult")
	@CacheLookup
	private WebElement input_NumberOfAdults;
	
	@FindBy(how = How.ID, using = "child")
	@CacheLookup
	private WebElement input_NumberOfChildren;
	
	@FindBy(how = How.ID, using = "infant")
	@CacheLookup
	private WebElement input_NumberOfInfant;
	
	@FindBy(how = How.ID, using = "pref")
	@CacheLookup
	public WebElement checkBox_PreferredAirline;

	@FindBy(how = How.ID, using = "Chkdirectflight")
	@CacheLookup
	public WebElement checkBox_Direct;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[11]/div[1]/div[1]/div[1]/div[2]/div[3]/div[6]/a")
	@CacheLookup
	private WebElement Button_SearchFlight;

	@FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[11]/div[2]/div[1]/div[1]/div[1]/a")
	@CacheLookup
	private WebElement text_Email_Booking_Ticket;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[11]/div[2]/div[1]/div[1]/div[2]/a")
	@CacheLookup
	private WebElement text_rail_PNR_Status;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[11]/div[2]/div[1]/div[1]/div[3]/a")
	@CacheLookup
	private WebElement text_Others;
	
	@FindBy(how = How.XPATH, using = "/html/body/form/div[4]/div[11]/div[2]/div[1]/div[1]/div[4]/a")
	@CacheLookup
	private WebElement text_Support;

     //



	
	// User functionality **************************************************************
	
	public void type_ReturnDate(String date)
	  {
		if(input_ReturnOn.isEnabled()) 
		 {
		   input_ReturnOn.sendKeys(date);
		 }
		else
		{
			System.out.println("Web element : input_ReturnOn not present");
		}
	  }
	
	public void type_FlyingTo(String flyingTo)
	  {
		if(input_FlyingTo.isEnabled()) 
		 {
			input_FlyingTo.sendKeys(flyingTo);
		 }
		else
		{
			System.out.println("Web element : input_FlyingTo not present");
		}
		
	  }
	
	public void type_DepartureDate(String date)
	  {
		input_DepartOn.sendKeys(date);
	  }
	
	public void type_TravelClass(String travelClass)
	  {
		input_TravelClass.sendKeys(travelClass);
	  }
	
	public void type_NumberOfChidren(String NumberOfChildren)
	  {
		input_NumberOfChildren.sendKeys(NumberOfChildren);
	  }
	
	public void type_NumberOfAdults(String NumberOfAdults)
	  {
		input_NumberOfAdults.sendKeys(NumberOfAdults);
	  }
	
	public void type_NumberOfInfant(String NumberOfInfant)
	  {
		input_NumberOfInfant.sendKeys(NumberOfInfant);
	  }
	
	public void type_FlyingFrom(String flyingfrom)
	  {
		input_FlyingFrom.sendKeys(flyingfrom);
	  }
	
	public void clickOn_RoundTrip()
	  {
		Button_RoundTrip.click();
	  }
	
	public void clickOn_OneWay()
	  {
		Button_OneWay.click();
	  }
	
	public void clickOn_Email_Booking_Ticket()
	  {
		text_Email_Booking_Ticket.click();
	  }
	
	public void clickOn_rail_PNR_Status()
	  {
		text_rail_PNR_Status.click();
	  }
	
	public void clickOn_Others()
	  {
		text_Others.click();
	  }
	
	public void clickOn_Support()
	  {
		text_Support.click();
	  }
	
	public void clickOn_SearchFlight()
	  {
		Button_SearchFlight.click();
	  }

    public void clickOn_closePopUpImage()
	  {
		String myWindowHandle = logInDriver.getWindowHandle();
		logInDriver.switchTo().window(myWindowHandle);
		closePopUpImage.click();
	  }
	 
	public void clickOn_MoneyTransfer()
	  {
		 moneyTransfer.click();
	  }
	
	public void clickOn_JCT_Money()
	  {
		 JCT_Money.click();
		 ArrayList<String> tabs = new ArrayList<String>(logInDriver.getWindowHandles());
		 logInDriver.switchTo().window(tabs.get(1));
	  }


 }
