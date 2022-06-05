package com.saiteja.automation.opercart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class ProductWishList extends BaseTestDemo{

	@FindBy(xpath="//div[@class='product-thumb transition']/div[2]//a[text()='MacBook']")
	private static WebElement macproduct;
	
	@FindBy(xpath="//a[text()='MacBook']")
	private static WebElement macbook;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	private static WebElement wishlistbutton;
	
	@FindBy(xpath="//a[contains(text(),'Your Store')]")
	private static WebElement returnHome;
	
	public static void getMacBookProduct() {
		try {
			Assert.assertTrue(macproduct.isDisplayed()&&macproduct.isEnabled());
			getExtentTest().log(LogStatus.PASS, "macbook product is Displayed");
			//Actions actions = new Actions(getDriver());
			getDriver().navigate().to("macproduct");
			getExtentTest().log(LogStatus.PASS, "Navigated to macbook");
			Thread.sleep(2000);
		}
		catch (Exception exception) {
			//getExtentTest().log(LogStatus.FAIL, "macbook product is NOT Displayed");
		}

	}
	
	public static void clickOnMacBook() {
		try {
			Assert.assertTrue(macbook.isDisplayed()&&macbook.isEnabled());
			getExtentTest().log(LogStatus.PASS, "macbook  is displayed");
			Actions actions = new Actions(getDriver());
			actions.click(macbook).build().perform();
			getExtentTest().log(LogStatus.PASS, "clicked on macbook");
			Thread.sleep(2000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "macbook  is not displayed");
		}

	}
	
	public static void addToWishList() {
		try {
			Assert.assertTrue(wishlistbutton.isDisplayed()&&wishlistbutton.isEnabled());
			getExtentTest().log(LogStatus.PASS, "wishlistbutton  is displayed");
			wishlistbutton.click();
			getExtentTest().log(LogStatus.PASS, "clicked on  wishlist button");
			Thread.sleep(2000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "wishlistbutton  is not displayed");
		}
	}
	
	
	public static void MovetoHome() {
		try {
			Assert.assertTrue(returnHome.isDisplayed()&&returnHome.isEnabled());
			getExtentTest().log(LogStatus.PASS, "returnHome  is displayed");
			returnHome.click();
			getExtentTest().log(LogStatus.PASS, "clicked on  returnHome button");
			Thread.sleep(2000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "returnHome  is not displayed");
		}
	}
	
	
	
	
	static
	{
		PageFactory.initElements(getDriver(), ProductWishList.class);
	}
	
	
	
	
}
