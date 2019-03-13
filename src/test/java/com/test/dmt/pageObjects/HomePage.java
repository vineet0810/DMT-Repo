package com.test.dmt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// B2B Uat Home Page  
public class HomePage
  {
	// WebDriver Object
	WebDriver homePageDriver;
	
	// Constructor to initiate HomePage 
	public HomePage(WebDriver driver)
	{
	   this.homePageDriver=driver;
	}
	
	// Web element variables 
	
	@FindBy(how = How.ID, using = "backtop")
	@CacheLookup
	private WebElement logIn;
	 
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/form/div[3]/div[1]/nav/div/div[2]/ul/li[2]/a")
	@CacheLookup
	private WebElement signUp;
	
	@FindBy(how = How.ID, using = "agntemail")
	@CacheLookup
	private WebElement agent_Email;
	
	@FindBy(how = How.ID, using = "agentpwd")
	@CacheLookup
	private WebElement agent_Password;
	
	@FindBy(how = How.ID, using = "agentbtn")
	@CacheLookup
	private WebElement agent_Button; 
	
	@FindBy(how = How.CLASS_NAME, using = "regi modal-trigger")
	@CacheLookup
	private WebElement forgotPassword;
	
	@FindBy(how = How.CLASS_NAME, using = "popup-close")
	@CacheLookup
	private WebElement popClose;

	@FindBy(how = How.ID, using = "loginerror")
    @CacheLookup
    public WebElement LogInErrorText;
	 // User functionality  

	public void type_AgentEmail(String email)
	  {
	     agent_Email.sendKeys(email);
	  }
	 
	 public void type_AgentPassword(String password)
	  {
		 agent_Password.sendKeys(password);
	  }
	
	public void clickOn_LoginButton()
	  {
		logIn.click();
	  }
	 
	 public void clickOn_SignUpButton()
	  {
		 signUp.click();
	  }
	 
	 public void clickOn_AgentButton()
	  {
		 agent_Button.click();
	  }
	 
	 public void clickOn_Forgot()
	  {
		 forgotPassword.click();
	  }
	 
	 public void clickOn_PopClose()
	  {
		 popClose.click();
	  }
	 
	 
  }
