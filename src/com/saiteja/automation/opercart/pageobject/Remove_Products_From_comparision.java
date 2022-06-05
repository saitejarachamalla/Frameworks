package com.saiteja.automation.opercart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class Remove_Products_From_comparision extends BaseTestDemo {

	@FindBy(xpath="//div[@id='content']")
	private static WebElement camparisonFrame;
	
	@FindBy(xpath="(//a[@class='btn btn-danger btn-block'])[1]")
	private static WebElement RemoveFirstProduct;
	
	@FindBy(xpath="(//a[@class='btn btn-danger btn-block'])[2]")
	private static WebElement RemoveSeocndProduct;
	
	static
	{
		PageFactory.initElements(getDriver(), Remove_Products_From_comparision.class);
	}
	
	public static void removeProduct() {
		try {
			Assert.assertTrue(camparisonFrame.isDisplayed()&&camparisonFrame.isEnabled());
			getExtentTest().log(LogStatus.PASS, "camparisonFrame is displayed and enabled");
			Thread.sleep(2000);
			
			Actions actions = new Actions(getDriver());
			actions.moveToElement(RemoveFirstProduct).build().perform();
			getExtentTest().log(LogStatus.PASS, "MouseOverAction done on RemoveFirstProduct");
			Thread.sleep(2000);
			
			actions.click(RemoveFirstProduct).build().perform();
			getExtentTest().log(LogStatus.PASS, "clcked on RemoveFirstProduct");
			Thread.sleep(2000);
			
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "camparisonFrame is NOT displayed and enabled");
		}

	}
	
	
	public static void removeProduct2() {
		try {
			Assert.assertTrue(camparisonFrame.isDisplayed()&&camparisonFrame.isEnabled());
			getExtentTest().log(LogStatus.PASS, "camparisonFrame is displayed and enabled");
			Thread.sleep(2000);
			
			Actions actions = new Actions(getDriver());
			actions.moveToElement(RemoveSeocndProduct).build().perform();
			getExtentTest().log(LogStatus.PASS, "MouseOverAction done on RemoveSeocndProduct");
			Thread.sleep(2000);
			
			actions.click(RemoveSeocndProduct).build().perform();
			getExtentTest().log(LogStatus.PASS, "clcked on RemoveSeocndProduct");
			Thread.sleep(2000);
			
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "camparisonFrame is NOT displayed and enabled");
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
