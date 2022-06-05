package com.saiteja.automation.opercart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.Actionsengine;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class CompareThreeProducts extends BaseTestDemo {
	@FindBy(xpath=" //span[contains(text(),'My Account')]")
	private static WebElement myaccount;
	
	@FindBy(xpath=" //ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a")
	private static WebElement login;
	
	@FindBy(xpath="//div[@class='col-sm-6'][2]/div/form/div//input[@id='input-email']")
	private static WebElement inputEmail;
	
	@FindBy(xpath="//div[@class='col-sm-6'][2]/div/form/div//input[@id='input-password']")
	private static WebElement inputpassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private static WebElement loginbutton;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']/li[8]")
	private static WebElement mp3playerbutton;
	
	@FindBy(xpath="//a[contains(text(),'Show All MP3 Players')]")
	private static WebElement showAllMp3Players;
	
	@FindBy(xpath=" //body/div[@id='product-category']/div[1]/div[1]/div[4]")
	private static WebElement catalogue;
	
	@FindBy(xpath="(//div[@class='button-group']/button[3])[1]")
	private static WebElement product1;
	
	
	@FindBy(xpath="(//div[@class='button-group']/button[3])[2]")
	private static WebElement product2;
	
	@FindBy(xpath="(//div[@class='button-group']/button[3])[3]")
	private static WebElement product3;
	
	@FindBy(xpath="//a[@id='compare-total']")
	private static WebElement compareProducts;
	
	@FindBy(xpath="//div[@id='product-compare']")
	private static WebElement twoProductsComaparision;
	
	public static void GoToMyAccount() {
		try {
			Assert.assertTrue(myaccount.isDisplayed()&&myaccount.isEnabled());
			getExtentTest().log(LogStatus.PASS, "my account is displayed");
			Actions actions = new Actions(getDriver());
			actions.moveToElement(myaccount).build().perform();
			getExtentTest().log(LogStatus.PASS, "Mouse Hover Actions is done on my account");
			Thread.sleep(1000);
			actions.click(myaccount).build().perform();
			getExtentTest().log(LogStatus.PASS, "Clicked on my account");
			Thread.sleep(1000);
			actions.moveToElement(login).build().perform();
			getExtentTest().log(LogStatus.PASS, "Mouse Hover Actions is done on login");
			Thread.sleep(1000);
			login.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on login");
			Thread.sleep(1000);
			//getDriver().switchTo().frame(1);
			Actionsengine.DTA(inputEmail, "Input-Email", "saitejarachamalla@gmail.com");
			Thread.sleep(1000);
			Actionsengine.DTA(inputpassword, "Input-Password", "Demo@1234");
			Thread.sleep(1000);
			loginbutton.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on loginButton");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "my account is  NOT displayed");
		}

	}
	
	public static  void Mp3Player() {
		try {
			Assert.assertTrue(mp3playerbutton.isDisplayed()&&mp3playerbutton.isEnabled());
			getExtentTest().log(LogStatus.PASS, "mp3playerbutton is displayed");
			Actions actions = new Actions(getDriver());
			actions.moveToElement(mp3playerbutton).build().perform();
			getExtentTest().log(LogStatus.PASS, "Mouse Hover Actions is done on Mp3players button");
			Thread.sleep(1000);
			showAllMp3Players.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on show All MP3 Players");
			Thread.sleep(1000);
			
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "mp3playerbutton is NOT displayed");
		}

	}
	
	
	public static void CompareProducts() {
		try {
			Assert.assertTrue(catalogue.isDisplayed()&&catalogue.isEnabled());
			getExtentTest().log(LogStatus.PASS, "catalogue is displayed");
			product1.click();
			getExtentTest().log(LogStatus.PASS, "clicked on comapre product1");
			Thread.sleep(1000);
			
			/*Assert.assertTrue(catalogue.isDisplayed()&&catalogue.isEnabled());
			getExtentTest().log(LogStatus.PASS, "catalogue is displayed");
			*/Actions actions = new Actions(getDriver());
			actions.moveToElement(product2);
			getExtentTest().log(LogStatus.PASS, "MOuse Hover ACtion is done on Product2");
			product2.click();
			getExtentTest().log(LogStatus.PASS, "clicked on comapre product2");
			Thread.sleep(1000);
			
			Actions actions1 = new Actions(getDriver());
			actions1.moveToElement(product3).build().perform();
			getExtentTest().log(LogStatus.PASS, "MOuse Hover ACtion is done on Product3");
			Thread.sleep(1000);
			product3.click();
			getExtentTest().log(LogStatus.PASS, "clicked on comapre product3");
			Thread.sleep(1000);
			
			/*compareProducts.click();
			getExtentTest().log(LogStatus.PASS, "clicked on comapre products(2)");
		*/} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "catalogue is NOT displayed");
		}

	}
	
	public static void ClickOnCompareProducts() {
		try {
			Assert.assertTrue(compareProducts.isDisplayed()&&compareProducts.isEnabled());
			getExtentTest().log(LogStatus.PASS, "compareProducts is displayed");
			Thread.sleep(1000);
			Actions actions= new Actions(getDriver());
			actions.click(compareProducts).build().perform();
			getExtentTest().log(LogStatus.PASS, "compareProducts is displayed");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "compareProducts is displayed");
		}
	}
	
	public static void GoToThreeProductsComparision() {
		try {
			Assert.assertTrue(twoProductsComaparision.isDisplayed()&&twoProductsComaparision.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Three ProductsComaparision is displayed");
			Actions actions = new Actions(getDriver());
			actions.moveToElement(twoProductsComaparision).build().perform();
			getExtentTest().log(LogStatus.PASS, "MOuseHoverActionis done on Three Products Comparison");
			Thread.sleep(5000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Three ProductsComaparision is  not displayed");
		}

	}
	
	static
	{
		PageFactory.initElements(getDriver(), CompareThreeProducts.class);
	}
	
		
}

