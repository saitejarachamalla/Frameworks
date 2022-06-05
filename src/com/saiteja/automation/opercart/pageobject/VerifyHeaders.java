package com.saiteja.automation.opercart.pageobject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.Utilities.PojoUtility;
import com.saiteja.automation.customisedexceptions.FramewroksException;
import com.saiteja.automation.frameworks.base.BaseTestDemo;


public class VerifyHeaders extends BaseTestDemo {
	
	@FindBys(@FindBy(xpath="//ul[@class='nav navbar-nav']/li/a"))
	private static List<WebElement> headers;
	
public static List<String> getheaders()
	{
	List<String> listheaderslist = new ArrayList<String>();
	for(WebElement element:headers)
	{
		String headertxt = element.getText();
		listheaderslist.add(headertxt);
	}
	return listheaderslist;	
}
	public static void verifyHeaders() throws EncryptedDocumentException, InvalidFormatException, FramewroksException, IOException {
		String data = PojoUtility.getExcelobj().getCellData("Sheetname", "Gmail_data", 0, 2);
		String[] str = data.split(",");
		List<String> listHeaderData = new ArrayList<String>();
		for(String str1:str)
		{
			listHeaderData.add(str1);
		}
		List<String> actualData =getheaders();
		Collections.sort(actualData);
		Collections.sort(listHeaderData);
		if (actualData == listHeaderData) {
			getExtentTest().log(LogStatus.PASS, "Headers are matching: "+actualData+ " = "+listHeaderData);
		}
		else {
			getExtentTest().log(LogStatus.FAIL, "Headers are not matching: "+actualData+ " = "+listHeaderData);
			
		}

	}
	
	
	static
	{
		PageFactory.initElements(getDriver(), VerifyHeaders.class);
	}
	
	
	
	
}
