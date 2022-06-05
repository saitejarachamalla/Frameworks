package com.saiteja.automation.opercart.pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class LogOut extends BaseTestDemo{

	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private static WebElement myaccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li[5]")
	private static WebElement logout;
	
	
	
	public static void goToMyAccount() {
	try {
		Assert.assertTrue(myaccount.isDisplayed()&&myaccount.isEnabled());
		getExtentTest().log(LogStatus.PASS, "My Account is Displayed");
		Thread.sleep(1000);
		myaccount.click();
		getExtentTest().log(LogStatus.PASS, "My Account is clicked");
		Actions actions =new Actions(getDriver());
		actions.moveToElement(logout).build().perform();
		Thread.sleep(1000);
		logout.click();
		getExtentTest().log(LogStatus.PASS, "My Account is clicked");
		Thread.sleep(1000);
	} catch (Exception exception) {
		getExtentTest().log(LogStatus.FAIL, "My Account is NOT Displayed");
	}

	}
	
	
	
	static
	{
		PageFactory.initElements(getDriver(), LogOut.class);
	}
	
}
