package com.saiteja.automation.opercart.pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.Actionsengine;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class LogInAccount extends BaseTestDemo{

	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private static WebElement myaccounttoggle;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private static WebElement login;
	
	@FindBy(xpath="//div[@class='col-sm-6'][2]")
	private static WebElement ReturningCustomer;
	
	@FindBy(xpath="//input[@id='input-email']")
	private static WebElement inputemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	private static WebElement inputpassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private static WebElement loginButton;
	
	
	
	
	public static void getMyaccount() {
		try {
			Assert.assertTrue(myaccounttoggle.isDisplayed()&&myaccounttoggle.isEnabled());
			getExtentTest().log(LogStatus.PASS, "myaccounttoggle is Displayed");
			Actions actions = new Actions(getDriver());
			actions.moveToElement(myaccounttoggle);
			getExtentTest().log(LogStatus.PASS, "Navigated to myaccounttoggle ");
			actions.click(myaccounttoggle).build().perform();
			getExtentTest().log(LogStatus.PASS, "Clicked on  myaccounttoggle ");
			Thread.sleep(1000);
			login.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on  login ");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "myaccounttoggle is NOt Displayed");
		}

	}
	
	
	public static void gotoReturningCustomer() {
		try {
			/*Assert.assertTrue(ReturningCustomer.isDisplayed()&&ReturningCustomer.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Returning customer is Displayed");
			getDriver().switchTo().frame(1);
			//getDriver().navigate().to("ReturningCustomer");
			getExtentTest().log(LogStatus.PASS, "Navigated to Returning customer ");
			//Actions actions =new Actions(getDriver());
			inputemail.clear();
			getExtentTest().log(LogStatus.PASS, " inputmail field is cleared ");
			inputemail.sendKeys("saitejarachamalla@gmail.com");
			getExtentTest().log(LogStatus.PASS, " enetered email ");
			*/
			Actionsengine.DTA(inputemail,"inputmail", "saitejarachamalla@gmail.com");
			Actionsengine.DTA(inputpassword, "password", "Demo@1234");
			loginButton.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on login");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Returning customer is NOT Displayed");
		}
	}
	
	
	
	
	
	
	
	
	static
	{
		PageFactory.initElements(getDriver(), LogInAccount.class);
	}
	
	
	
	//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]
	
	
	
	
	
}
