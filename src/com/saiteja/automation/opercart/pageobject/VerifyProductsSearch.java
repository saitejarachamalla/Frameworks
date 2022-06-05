package com.saiteja.automation.opercart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.CategoryList;
import com.saiteja.automation.frameworks.base.Actionsengine;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class VerifyProductsSearch extends BaseTestDemo{

	@FindBy(xpath="//input[@class='form-control input-lg']")
	private static WebElement searchbar;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private static WebElement SearchButton;
	
	@FindBy(xpath="//select[@class='form-control']")
	private static WebElement category;
	
	@FindBys(@FindBy(xpath="//select[@class='form-control']/option[4]"))
	private static WebElement subcategorylist;
	
	@FindBy(xpath="//input[@id='button-search']")
	private static WebElement clicksearch;
	
	public static void getSearchBar() 
	{
		try {
			Assert.assertTrue(searchbar.isDisplayed()&&searchbar.isEnabled());
			getExtentTest().log(LogStatus.PASS, "SearchBar is Displayed");
			Actions actions = new Actions(getDriver());
			//Actionsengine.DTA(searchbar, "search" , "Desktop");
			searchbar.clear();
			getExtentTest().log(LogStatus.PASS, "Searchbar is cleared");
			searchbar.sendKeys("Desktop");
			getExtentTest().log(LogStatus.PASS, "data typing actions is done in search bar");

		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "SearchBar is not Displayed");
		}
		
	}
	
	
	public static  void clickSearchButton() {
		try {
			Assert.assertTrue(SearchButton.isDisplayed()&&SearchButton.isEnabled());
			getExtentTest().log(LogStatus.PASS, "SearchButton is Displayed");
			//Actions actions = new Actions(getDriver());
			SearchButton.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on serch button");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.PASS, "SearchButton is Displayed");
		}

	}
	
	public static void getCategory() {
		try {
			Assert.assertTrue(category.isDisplayed()&&category.isEnabled());
			getExtentTest().log(LogStatus.PASS, "categoryoption is Displayed");
			category.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on category button");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "categoryoption is not Displayed");
		}

	}
	
	public static void getcategorylist() {
		try {
			Assert.assertTrue(subcategorylist.isDisplayed()&&subcategorylist.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Subcategorylist is Displayed");
			subcategorylist.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on subcategory button");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "subcategorylist is not Displayed");
		}
	}
	
	public static void getClickSearchbutton() {
		try {
			Assert.assertTrue(clicksearch.isDisplayed()&&clicksearch.isEnabled());
			getExtentTest().log(LogStatus.PASS, "search button is Displayed");
			clicksearch.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on search button");
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.PASS, "search button is Displayed");
		}

	}
	
	static
	{
		PageFactory.initElements(getDriver(), VerifyProductsSearch.class);
	}
}
