package com.test.dmt.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JctSearch
 {
	
     WebDriver mobileValidateDriver;
	
	// Constructor to initiate JctSearch 
	public JctSearch(WebDriver driver)
	{
	   this.mobileValidateDriver = driver;
	}
	
	// Web element variables  ***************************************************************************
	
     @FindBy(how = How.ID, using = "txtmob")
     @CacheLookup
	 private WebElement mobileNumber;
	 
	 @FindBy(how = How.ID, using = "ShowDetails")
	 @CacheLookup
	 private WebElement mobSubmit;
	 
	 @FindBy(how = How.ID, using = "sendmoney_0")
	 @CacheLookup
	 private WebElement agentProfile;
	 
	 @FindBy(how = How.ID, using = "txtamnt")
	 @CacheLookup
	 public WebElement amount;
	 
	 @FindBy(how = How.ID, using = "btnShowHide")
	 @CacheLookup
	 private WebElement amtSubmit;
	 
	 @FindBy(how = How.ID, using = "txtpin")
	 @CacheLookup
	 private WebElement pinNumber;
	 
	 @FindBy(how = How.ID, using = "Finalsm_3")
	 @CacheLookup
	 private WebElement send;
	 
	 @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div/div/div/div[11]/div/div[4]/div/div")
	 @CacheLookup
	 private WebElement repeatTransaction;
	 
	 @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div/div/div/div[11]/div/div[5]")
	 @CacheLookup
	 private WebElement back;
	 
	 @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div/div/div/div[11]/div/div[2]/div[1]/div")
	 @CacheLookup
	 private WebElement print;
	 
	 @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div/div/div/div[3]/div[2]/a/i")
	 @CacheLookup
	 private WebElement sender_EditButton;
	 
	 @FindBy(how = How.ID, using = "IMPS")
	 @CacheLookup
	 public WebElement IMPS_button;
	 
	 @FindBy(how = How.ID, using = "NEFT")
	 @CacheLookup
	 public WebElement NEFT_button;

	 @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div/div/div/div[8]/div[2]/div[6]/button/span")
	 @CacheLookup
	 private WebElement addBeneficiary;

     @FindBy(how = How.ID, using = "select2-bankbnd-container")
     @CacheLookup
     private WebElement bankDropDown;

     @FindBy(how = How.XPATH, using = "/html/body/span/span/span[1]/input")
     @CacheLookup
     private WebElement selectBankName;

     @FindBy(how = How.ID, using = "RecBno")
     @CacheLookup
     private WebElement bankAccountNumber;

     @FindBy(how = How.ID, using = "Recifc")
     @CacheLookup
     private WebElement ifscCode;

     @FindBy(how = How.ID, using = "Recname")
     @CacheLookup
     private WebElement accountHolderName;

     @FindBy(how = How.ID, using = "RecMno")
     @CacheLookup
     private WebElement accountHolderMobile;

     @FindBy(how = How.ID, using = "ValidateAcc")
     @CacheLookup
     private WebElement validateAccountNumber;

     @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div/div/div/div[9]/div[10]/div[2]/button/span")
     @CacheLookup
     private WebElement submitButton;

     @FindBy(how = How.XPATH, using = "/html/body/form/div[5]/div/div/div/div[8]/div[2]/div[5]/div[1]/table/tbody/tr[2]/td[1]/div/i")
     @CacheLookup
     private WebElement beneficiaryDetails;

     @FindBy(how = How.ID, using = "Dsendmoney_0")
     @CacheLookup
     private WebElement deleteBeneficiary;
	 //
	 
	// User functionality *****************************************************************************
	 
	 public void type_Amount(String amt)
	  {
		 if(amount.isEnabled())
		 {		 
		    amount.sendKeys(amt);
		 }
		 else
		 {
			 System.out.println("WebElement: amount not present  ");
		 }
	  }

	 
	 public void type_MobileNumber(String mobile)
	  {
		 mobileNumber.sendKeys(mobile);
	  }

     public void type_BankName(String bankName)
     {
         selectBankName.sendKeys(bankName);
     }

	 public void type_PinNumber(String pin)
	  {
		 pinNumber.sendKeys(pin);
	  }

     public void type_bankAccountNumber(String accountNumber)
     {
         bankAccountNumber.sendKeys(accountNumber);
     }

     public void type_bankIfscNumber(String ifsc)
     {
         ifscCode.sendKeys(ifsc);
     }

     public void type_AccountHolderName(String name)
     {
         accountHolderName.sendKeys(name);
     }

     public void type_AccountHolderMobile(String mob)
     {
         accountHolderMobile.sendKeys(mob);
     }

//
	 public void clickOn_MobSubmitButton()
	   {
		 mobSubmit.click();
	   }
     
	 
	 public void clickOn_AgentProfile()
	   {
		 agentProfile.click();
	   }
	 
	
	 public void clickOn_AmtSubmitButton()
	   {
		 amtSubmit.click();
	   }
	

	 public void clickOn_RepeatTransaction()
	   {
		 repeatTransaction.click();
	   }

	 public void clickOn_Back()
	   {
		 back.click();
	   }
	 
	 
	 public void clickOn_Print()
	   {
		 print.click();
	   }

	 public void clickOn_Send()
	 {
		 send.click();
	 }

     public void clickOn_Addbeneficiary()
     {
         addBeneficiary.click();
     }

     public void clickOn_BankDropDown()
     {
         bankDropDown.click();
     }

     public void clickOn_BankName()
     {
         selectBankName.sendKeys(Keys.ENTER);
     }

     public void clickOn_validateAccountNumber()
     {
         validateAccountNumber.click();
     }

     public boolean isDisplayed_validateAccountNumber()
     {
         return validateAccountNumber.isDisplayed();
     }

     public void clickOn_SubmitButton()
     {
         submitButton.click();
     }

     public void clickOn_BeneficiaryDetails()
     {
         beneficiaryDetails.click();
     }

     public boolean isDisplayed_BeneficiaryDetails()
     {
         return beneficiaryDetails.isDisplayed();
     }

     public boolean isDisplayed_Back()
     {
         return back.isDisplayed();
     }

     public boolean isDisplayed_DeleteBeneficiary()
     {
         return deleteBeneficiary.isDisplayed();
     }
//
 }
