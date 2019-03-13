package com.test.dmt.testCases;

import java.util.concurrent.TimeUnit;

import com.test.dmt.pageObjects.Dashboardnew;
import com.test.dmt.pageObjects.DmtOption;
import com.test.dmt.pageObjects.JctSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.dmt.pageObjects.HomePage;
import com.test.dmt.utility.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;


public class LoginTestCases
 {


    @Test
	public void verifyValidLogin() throws InterruptedException
	{
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);
        dashboardnew.clickOn_closePopUpImage();
        Assert.assertEquals(driver.getTitle(),"Dashboard");
		driver.quit();
	}
	
	
	@Test
	public void verifyInValidLogin() throws InterruptedException
	{
		WebDriver driver = BaseFile.applicationBaseUrl();
	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(5000);
	    homePage.clickOn_LoginButton();
	    homePage.type_AgentEmail("prashant.sh@justclickkaro.com");
	    homePage.type_AgentPassword("Ferrari@123");
	    homePage.clickOn_AgentButton();

        Thread.sleep(3000);
        Assert.assertEquals(homePage.LogInErrorText.getText(), "User Name or Password Doesn't Matched");
        driver.quit();
	}
	

	@Test
	public void verify_BlankInput_Email() throws InterruptedException {
        WebDriver driver = BaseFile.applicationBaseUrl();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
         try {

               Thread.sleep(5000);
               homePage.clickOn_LoginButton();
               homePage.type_AgentEmail("");
               homePage.type_AgentPassword("Ferrari@123");
               homePage.clickOn_AgentButton();

               String loginPop = driver.getWindowHandle();
               driver.switchTo().window(loginPop);

               Thread.sleep(3000);

             } catch (Exception ee)
                 {
                   System.out.println(ee);
                 }
               finally
                 {
                     Assert.assertEquals(homePage.LogInErrorText.getText(), "User Name or Password Doesn't Matched");
                     driver.quit();
                 }
         }

	@Test
	public void verify_BlankInput_Password() throws InterruptedException
	{
		WebDriver driver = BaseFile.applicationBaseUrl();
	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(5000);
	    homePage.clickOn_LoginButton();
	    homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
	    homePage.type_AgentPassword("");
	    homePage.clickOn_AgentButton();

        String loginPop = driver.getWindowHandle();
        driver.switchTo().window(loginPop);

        Thread.sleep(3000);
        Assert.assertEquals(homePage.LogInErrorText.getText(), "User Name or Password Doesn't Matched");
        driver.quit();
	}
	

	@Test
	public void verify_BlankInput() throws InterruptedException
	{
		WebDriver driver = BaseFile.applicationBaseUrl();
	    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(5000);
	    homePage.clickOn_LoginButton();
	    homePage.type_AgentEmail("");
	    homePage.type_AgentPassword("");
	    homePage.clickOn_AgentButton();

        String loginPop = driver.getWindowHandle();
        driver.switchTo().window(loginPop);

        Thread.sleep(3000);
        Assert.assertEquals(homePage.LogInErrorText.getText(), "User Name or Password Doesn't Matched");
        driver.quit();
	}

 }
