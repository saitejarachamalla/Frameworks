package com.saiteja.automation.opercart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;


public class saudiwebsitedatepicker extends BaseTestDemo {

	@FindBy(xpath="(//div[@class='date-fields d-flex align-items-center'])[1]")
	private static WebElement datepickerbox;
	
	@FindBy(xpath="//input[@id='tripDate']")
	private static WebElement tripdate;
	
	@FindBy(xpath="(//i[@class='fa fa-calendar'])[1]")
	private static WebElement calender;
	
	@FindBy(xpath="(//div[@class='caleran-input'])[3]")
	private static WebElement calenderframe;
	
	@FindBy(xpath="(//div[@class='caleran-calendar start'])[3]/div/b")
	private static WebElement selectmonth;
	
	@FindBy(xpath="(//div[@class='caleran-ms-month'])[5]")
	private static WebElement selectJune;
	
	@FindBy(xpath= "((//div[@class='caleran-calendar start'])[3]//span['2022'])[1]")
	private static WebElement Selectyear;
	
	@FindBy(xpath="//div[@class='caleran-ys-year current']")
	private static WebElement year;
	
	@FindBy(xpath="//div[@class='caleran-day caleran-start caleran-selected']/span['20'][1]")
	private static WebElement starttripDate;
	
	@FindBy(xpath="(//button[@class='caleran-apply'])[3]")
	private static WebElement applybutton;
	
	public static void goToDatePicker() {
		try {
			Assert.assertTrue(datepickerbox.isDisplayed()&&datepickerbox.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Date picker box is Displayed and Enabled");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Date picker box is NOT Displayed and Enabled");
		}

	}
	
	/*public static void goToTripDate() {
		try {
			Assert.assertTrue(tripdate.isDisplayed()&&tripdate.isEnabled());
			getExtentTest().log(LogStatus.PASS, "tripdate is Displayed and Enabled");
			Thread.sleep(1000);
			Actions actions = new Actions(getDriver());
			actions.click(tripdate).build().perform();
			getExtentTest().log(LogStatus.PASS, "tripdate is clicked");
			Thread.sleep(1000);
					
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "tripdate is NOT Displayed and Enabled");
		}
	}*/
	
	public static void goToCalender() {
		try {
			Assert.assertTrue(calender.isDisplayed()&&calender.isEnabled());
			getExtentTest().log(LogStatus.PASS, "calender is Displayed and Enabled");
			Thread.sleep(1000);
			Actions actions = new Actions(getDriver());
			actions.click(calender);
			getExtentTest().log(LogStatus.PASS, "clicked on caledner");
			actions.click(calenderframe);
			getExtentTest().log(LogStatus.PASS, "clicked on calednerframe");
			
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "calender is NOT Displayed and Enabled");
		}
			
	}
	
	public static void gotocalenderframe() {
		try {
			/*Assert.assertTrue(calenderframe.isDisplayed()&&calenderframe.isEnabled());
			getExtentTest().log(LogStatus.PASS, "calenderframe is Displayed and Enabled");
			*/Thread.sleep(1000);
			Actions actions = new Actions(getDriver());
			actions.click(selectmonth);
			getExtentTest().log(LogStatus.PASS, "clicked on select month");
			Thread.sleep(1000);
			actions.moveToElement(selectJune);
			getExtentTest().log(LogStatus.PASS, "Mouse hover done on june month");
			Thread.sleep(1000);
			actions.click(selectJune);
			getExtentTest().log(LogStatus.PASS, "clicked on selectJUne");
			Thread.sleep(1000);
			
			actions.click(Selectyear);
			getExtentTest().log(LogStatus.PASS, "clicked on select year");
			Thread.sleep(1000);
			actions.moveToElement(year);
			getExtentTest().log(LogStatus.PASS, "Mouse hover done on year");
			Thread.sleep(1000);
			actions.click(year);
			getExtentTest().log(LogStatus.PASS, "clicked on select year2022");
			Thread.sleep(1000);
				
			actions.moveToElement(starttripDate);
			getExtentTest().log(LogStatus.PASS, "Mouse hover done on Date");
			Thread.sleep(1000);
			actions.click(starttripDate);
			getExtentTest().log(LogStatus.PASS, "clicked on select date");
			Thread.sleep(1000);
			
			actions.click(applybutton);
			getExtentTest().log(LogStatus.PASS, "clicked on apply");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "calenderFrame is NOT Displayed and Enabled");
		}

	}
	
	
	
	static {
		PageFactory.initElements(getDriver(), saudiwebsitedatepicker.class);
	}
	
	
	
	
	
	
	
}
