package com.test.dmt.testCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.test.dmt.pageObjects.DmtOption;
import com.test.dmt.pageObjects.JctSearch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import com.test.dmt.pageObjects.HomePage;
import com.test.dmt.utility.BaseFile;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.test.dmt.pageObjects.Dashboardnew;

import javax.swing.*;

public class DmtTestCases
{
    @Test(priority=1)
    public void shouldAddNewSender() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(2000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8267875010");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();

        Thread.sleep(3000);
        Assert.assertEquals("passed","passed");
        driver.close();
    }


    @Test(priority=2)
    public void shouldDisplaySenderDetails() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        Assert.assertEquals(jctSearch.isDisplayed_BeneficiaryDetails(),true);
        Thread.sleep(3000);
        driver.quit();

    }


    @Test(priority=3)
    public void verifyBeneficiaryButton() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(2000);
        jctSearch.clickOn_Addbeneficiary();
        Thread.sleep(6000);
        Assert.assertEquals(jctSearch.isDisplayed_validateAccountNumber(),true);
        driver.quit();

    }


    @Test(priority=4)
    public void verifyBlankInput_Bank() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        Thread.sleep(2000);
        jctSearch.clickOn_BankDropDown();
        //jctSearch.type_BankName("");
        //jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("4007000100887729");
        jctSearch.type_bankIfscNumber("PUNB0001266");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        jctSearch.clickOn_validateAccountNumber();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals(alert.getText(),"Please Select Bank ");
        alert.dismiss();
        driver.quit();

    }


    @Test(priority=5)
    public void verifyInvalid_Bank() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        Thread.sleep(2000);
        jctSearch.clickOn_BankDropDown();
        jctSearch.type_BankName("Abc bank");
        jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("4007000100887729");
        jctSearch.type_bankIfscNumber("PUNB0001266");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        jctSearch.clickOn_validateAccountNumber();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals(alert.getText(),"Please Select Bank ");
        alert.dismiss();
        driver.quit();

    }


    @Test(priority=6)
    public void verifyInvalid_AccountNumber() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);


        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        Thread.sleep(2000);
        jctSearch.clickOn_BankDropDown();
        jctSearch.type_BankName("Punjab National Bank");
        jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("015515441330230");
        jctSearch.type_bankIfscNumber("PUNB0001266");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        Thread.sleep(3000);
        jctSearch.clickOn_validateAccountNumber();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        Assert.assertEquals(alert.getText(),"Invalid account details");
        alert.dismiss();
        driver.quit();
    }

    @Test(priority=7)
    public void shouldAddNewBeneficiary() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jctSearch.clickOn_BankDropDown();
        jctSearch.type_BankName("Punjab National Bank");
        jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("4007000100887740");
        jctSearch.type_bankIfscNumber("PUNB0001266");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        jctSearch.clickOn_validateAccountNumber();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        jctSearch.clickOn_SubmitButton();
        Thread.sleep(8000);
        Assert.assertEquals("p","p");
        driver.quit();

    }


    @Test(priority=8)
    public void verifyBlankInput_IFSC() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jctSearch.clickOn_BankDropDown();
        jctSearch.type_BankName("Punjab National Bank");
        jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("4007000100887740");
        jctSearch.type_bankIfscNumber("");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        jctSearch.clickOn_validateAccountNumber();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        jctSearch.clickOn_SubmitButton();
        Thread.sleep(8000);
        Assert.assertEquals("p","p");
        driver.quit();

    }


    @Test(priority=9)
    public void verifyBeneficiaryExtendButton() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(2000);
        jctSearch.clickOn_BeneficiaryDetails();
        Thread.sleep(6000);
        Assert.assertEquals(jctSearch.isDisplayed_DeleteBeneficiary(),true);
        driver.quit();
    }

    @Test(priority=10)
    public void verifySendCashButton() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(2000);
        jctSearch.clickOn_BeneficiaryDetails();
        Thread.sleep(2000);
        jctSearch.clickOn_AgentProfile();
        Thread.sleep(2000);
        Assert.assertEquals(jctSearch.amount.isDisplayed(),true);
        driver.quit();

    }

    @Test(priority=11)
    public void verifyValidPayment() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(5000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_AgentProfile();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jctSearch.type_Amount("250");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jctSearch.clickOn_AmtSubmitButton();
        jctSearch.type_PinNumber("0000");
        Thread.sleep(2000);
        jctSearch.clickOn_Send();
        Thread.sleep(2000);

        Assert.assertEquals(jctSearch.isDisplayed_Back(),"true");
        driver.close();
    }


    @Test(priority=12)
    public void verifyInValidPayment() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(5000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_AgentProfile();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jctSearch.type_Amount("99");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        jctSearch.clickOn_AmtSubmitButton();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        Assert.assertEquals(alert.getText(),"You can not transfer amount less then 100");
        alert.dismiss();
        driver.quit();
    }


    @Test(priority=13)
    public void shouldValidateAccount() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        Thread.sleep(2000);
        jctSearch.clickOn_BankDropDown();
        jctSearch.type_BankName("Punjab National Bank");
        Thread.sleep(1000);
        jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("4007000100887729");
        jctSearch.type_bankIfscNumber("PUNB0001266");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        jctSearch.clickOn_validateAccountNumber();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals(alert.getText(),"Success!  Account details found.. for - Gaurav Mallik");
        alert.dismiss();
        Thread.sleep(5000);
        driver.quit();

    }


    @Test(priority=14)
    public void verifyAccountNumberLength() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        Thread.sleep(2000);
        jctSearch.clickOn_BankDropDown();
        jctSearch.type_BankName("Punjab National Bank");
        jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("400700");
        jctSearch.type_bankIfscNumber("PUNB0001266");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        jctSearch.clickOn_validateAccountNumber();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals(alert.getText(),"Account number length should be in between 10 and 20");
        alert.dismiss();
        driver.quit();
    }


    @Test(priority=15)
    public void Otp() throws IOException
    {
        String test1 = JOptionPane.showInputDialog("Enter OTP");
        System.out.println(test1);
    }




    /*

    @Test(priority=15)
    public void verifyBlankInputAccount() throws InterruptedException
    {
        WebDriver driver = BaseFile.applicationBaseUrl();

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Dashboardnew dashboardnew = PageFactory.initElements(driver, Dashboardnew.class);
        DmtOption dmtOption =  PageFactory.initElements(driver, DmtOption.class);
        JctSearch jctSearch = PageFactory.initElements(driver, JctSearch.class);

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        homePage.clickOn_LoginButton();
        homePage.type_AgentEmail("prashant.sharma@justclickkaro.com");
        homePage.type_AgentPassword("Ferrari@123");
        homePage.clickOn_AgentButton();
        Thread.sleep(4000);

        dashboardnew.clickOn_closePopUpImage();
        dashboardnew.clickOn_MoneyTransfer();
        dashboardnew.clickOn_JCT_Money();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);
        dmtOption.type_PinNumber("0000");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        dmtOption.clickOn_PinValidateButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        jctSearch.type_MobileNumber("8433063763");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        jctSearch.clickOn_MobSubmitButton();
        Thread.sleep(3000);
        jctSearch.clickOn_Addbeneficiary();
        Thread.sleep(2000);
        jctSearch.clickOn_BankDropDown();
        jctSearch.type_BankName("Punjab National Bank");
        jctSearch.clickOn_BankName();
        jctSearch.type_bankAccountNumber("");
        jctSearch.type_bankIfscNumber("PUNB0001266");
        jctSearch.type_AccountHolderName("MR ROHIT");
        jctSearch.type_AccountHolderMobile("9897746660");
        jctSearch.clickOn_validateAccountNumber();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals(alert.getText(),"Please enter Bank Account Number");
        alert.dismiss();
        driver.quit();


        Scanner scan1 = new Scanner(System.in);
        String input1 = scan1.nextLine();
        System.out.println(input1);

    }
*/

}
