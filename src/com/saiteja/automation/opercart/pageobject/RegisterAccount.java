package com.saiteja.automation.opercart.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class RegisterAccount extends BaseTestDemo {

	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private static WebElement myaccounttoggle;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private static WebElement Register;
	
	@FindBy(xpath="//div[@id='content']")
	private static WebElement enterDeatils;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private static WebElement FirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private static WebElement LastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	private static WebElement mail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private static WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='input-password']")
	private static WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private static WebElement Confirmpassword;
	
	@FindBy(xpath="//div[@class='col-sm-10']/label")
	private static WebElement radiobuttons;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private static WebElement continuebutton;
	
	@FindBy(xpath="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private static WebElement checkbox;
	
	public static void getMyaccount() {
		try {
			Assert.assertTrue(myaccounttoggle.isDisplayed()&&myaccounttoggle.isEnabled());
			getExtentTest().log(LogStatus.PASS, "myaccounttoggle is Displayed");
			//getDriver().navigate().to("myaccounttoggle");
			Actions actions = new Actions(getDriver());
			actions.moveToElement(myaccounttoggle);
			getExtentTest().log(LogStatus.PASS, "Navigated to myaccounttoggle ");
			//Actions actions = new Actions(getDriver());
			actions.click(myaccounttoggle).build().perform();
			Thread.sleep(1000);
			getExtentTest().log(LogStatus.PASS, "Clicked on  myaccounttoggle ");
			Register.click();
			Thread.sleep(1000);
			getExtentTest().log(LogStatus.PASS, "Clicked on  Register");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "myaccounttoggle is NOt Displayed");
		}

	}
	/*
	public static void getRegister() {
		try {
			Assert.assertTrue(Register.isDisplayed()&&Register.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Register is Displayed");
			Register.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on  Register option ");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.PASS, "Register is NOT Displayed");
		}
	}*/
	
	public static void ToenterDeatils() {
		try {
			Assert.assertTrue(enterDeatils.isDisplayed()&&enterDeatils.isEnabled());
			getExtentTest().log(LogStatus.PASS, "enterDeatils is Displayed");
			Thread.sleep(1000);
			FirstName.sendKeys("Sai");
			getExtentTest().log(LogStatus.PASS, "data typing  is done in First Name");
			Thread.sleep(1000);
			LastName.sendKeys("Teja");
			getExtentTest().log(LogStatus.PASS, "data typing  is done in Last Name");
			Thread.sleep(1000);
			mail.sendKeys("saitejarachamalla@gmail.com");
			getExtentTest().log(LogStatus.PASS, "data typing  is done in gmail");
			Thread.sleep(1000);
			phonenumber.sendKeys("9553211467");
			getExtentTest().log(LogStatus.PASS, "data typing  is done in Phone number");
			Thread.sleep(1000);
			password.sendKeys("Demo@1234");
			getExtentTest().log(LogStatus.PASS, "data typing  is done in password");
			Thread.sleep(1000);
			Confirmpassword.sendKeys("Demo@1234");
			getExtentTest().log(LogStatus.PASS, "data typing  is done in Confirmpassword");
			Thread.sleep(1000);
			
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "FirstName is Displayed");
		}
	}
	
	public static void clickOnRadioButton() {
		try {
			if (radiobuttons != null) {
				radiobuttons.click();
				getExtentTest().log(LogStatus.PASS, "RadioButton is  clicked");
			}
			else {
				getExtentTest().log(LogStatus.FAIL, "RadioButton is not clicked");
			}
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "RadioButton is not clicked");
		}

	}
	
	public static void clickOnContinueButton() {
		try {
			Assert.assertTrue(continuebutton.isDisplayed()&&continuebutton.isEnabled());
			getExtentTest().log(LogStatus.PASS, "continuebutton is Displayed");
			Thread.sleep(1000);
			continuebutton.click();
			getExtentTest().log(LogStatus.PASS, "continuebutton is clicked");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "continuebutton is NOT Displayed");
		}

	}
	
	public static void clickOnCheckBox() {
		try {
			Assert.assertTrue(checkbox.isDisplayed()&&checkbox.isEnabled());
			getExtentTest().log(LogStatus.PASS, "checkbox is Displayed");
			Thread.sleep(1000);
			checkbox.click();
			getExtentTest().log(LogStatus.PASS, "checkbox is clicked");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "checkbox is NOT Displayed");
		}

	}
	
	
	
	
	static
	{
		PageFactory.initElements(getDriver(), RegisterAccount.class);
	}
	
	
	
	
	
	
	
	
	
	
	
}
