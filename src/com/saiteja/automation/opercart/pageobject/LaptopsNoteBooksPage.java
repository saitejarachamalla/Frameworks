package com.saiteja.automation.opercart.pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class LaptopsNoteBooksPage extends BaseTestDemo{

	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private static WebElement laptopsNoteBooks;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private static WebElement showallLaptopsNoteBooks;
	
	@FindBy(xpath="//a[contains(text(),'Laptops & Notebooks (5)')]")
	private static WebElement actuallaptopsNoteBookssize;
	
	@FindBys(@FindBy(xpath="//div[@class='product-thumb']/div/a/img"))
	private static List<WebElement> expectedlaptopsNoteBookssize;
	
	@FindBy(xpath="//a[text()='Macs (0)']")
	private static WebElement mac;
	
	@FindBy(xpath="//a[text()='Windows (0)']")
	private static WebElement windows;
	
	
	public static void verifyLaptopsNotebooksValues() {
		try {
			Assert.assertTrue(showallLaptopsNoteBooks.isDisplayed()&&showallLaptopsNoteBooks.isEnabled());
			getExtentTest().log(LogStatus.PASS, "showallLaptopsNoteBooks element is dispalyed");
			Assert.assertTrue(mac.isDisplayed()&&mac.isEnabled());
			getExtentTest().log(LogStatus.PASS, "mac element is dispalyed");
			Assert.assertTrue(windows.isDisplayed()&&windows.isEnabled());
			getExtentTest().log(LogStatus.PASS, "windows element is dispalyed");
	
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "windows element is dispalyed");
			
		}

	}
	
	
	
	
	public static void mouseHoverOnLaptopsNoteBooks() {
		try {
			Assert.assertTrue(laptopsNoteBooks.isDisplayed()&&laptopsNoteBooks.isEnabled());
			getExtentTest().log(LogStatus.PASS, "LaptopsNOteBooks element is dispalyed");
			Actions actions =new Actions(getDriver());
			actions.moveToElement(laptopsNoteBooks).build().perform();
			getExtentTest().log(LogStatus.PASS, "mouse hover action is done on laptopsnotebooks element");
			Thread.sleep(2000);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "LaptopsNOteBooks element is not dispalyed");
			
		}

	}
	public static void clickonshowallLaptopsNoteBooks() {
		try {
			Assert.assertTrue(showallLaptopsNoteBooks.isDisplayed()&&showallLaptopsNoteBooks.isEnabled());
			getExtentTest().log(LogStatus.PASS, "showallLaptopsNoteBooks element is dispalyed");
			showallLaptopsNoteBooks.click();
			getExtentTest().log(LogStatus.PASS, " click action is done on showallLaptopsNoteBooks element");
			Thread.sleep(2000);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "showallLaptopsNoteBooks element is not dispalyed");
			
		}

	}
	
	
	public static int getactualLaptopsNoteBookssize() {
		int actualLaptopSize=0;
		try {
			Assert.assertTrue(actuallaptopsNoteBookssize.isDisplayed()&&actuallaptopsNoteBookssize.isEnabled());
			getExtentTest().log(LogStatus.PASS, "actualLaptopsNoteBookssize element is dispalyed");
			String txt = actuallaptopsNoteBookssize.getText();
			getExtentTest().log(LogStatus.PASS, "Actual text is :"+txt);//Laptops & Notebooks (5)
			String[] str = txt.split(" ");//[Laptops & Notebooks (5)]
			String txt1 = str[str.length-1];//(5)
			String[] txt2 = txt1.split(""); //( 5 )
			String actualsize = txt2[1];
			actualLaptopSize = Integer.parseInt(actualsize);
			Thread.sleep(2000);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "actualLaptopsNoteBookssize element is not dispalyed");
			
		}
		return actualLaptopSize;
	}
	
	public static int getexpectedlaptopsNoteBookssize() {
		int expectedLaptopSize=0;
		try {
			expectedLaptopSize = expectedlaptopsNoteBookssize.size();
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "expectedlaptopsNoteBookssize element is not dispalyed");
			
		}
		return expectedLaptopSize;
	}
	
	public static void verifyLaptopsAndNoteBooksSize() {
		try {
		int actualLapsNotesSize = getactualLaptopsNoteBookssize();
		int expectedLapsNotesSize = getexpectedlaptopsNoteBookssize();
		if (actualLapsNotesSize == expectedLapsNotesSize) {
			getExtentTest().log(LogStatus.PASS, "Laptops and Notebooks size is matched");
		}
		else {
			getExtentTest().log(LogStatus.FAIL, "Laptops and Notebooks size is NOT matched");
		}
		}
		catch (Exception exception) {
			
		}
		
	}
	
	
	
	static
	{
		PageFactory.initElements(getDriver(), LaptopsNoteBooksPage.class);
	}
	
}


