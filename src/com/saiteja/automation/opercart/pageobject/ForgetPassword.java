package com.saiteja.automation.opercart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.Actionsengine;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class ForgetPassword extends BaseTestDemo{

	
	@FindBy(xpath="//div[@class='form-group']/a")
	private static WebElement forgetPassword;
	
	@FindBy(xpath="//div[@class='form-group required']/div/input")
	private static WebElement EnterEmail;
	
	@FindBy(xpath="//div[@class='pull-right']/input")
	private static WebElement continueButton;
	
	
	public static  void GoToForgetPassword() {
		try {
			Assert.assertTrue(forgetPassword.isDisplayed()&&forgetPassword.isEnabled());
			getExtentTest().log(LogStatus.PASS, "ForgetPassword is Displayed");
			forgetPassword.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on ForgetPassword");
			Actionsengine.DTA(EnterEmail, "Email", "saitejarachamalla@gmail.com");
			continueButton.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on Continue");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.PASS, "ForgetPassword is not Displayed");
		}
	}
	
	static
	{
		PageFactory.initElements(getDriver(), ForgetPassword.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
