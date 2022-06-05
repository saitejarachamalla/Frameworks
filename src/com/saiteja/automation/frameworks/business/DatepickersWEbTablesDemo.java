package com.saiteja.automation.frameworks.business;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.saiteja.automation.Utilities.DateTimeUtilities;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class DatepickersWEbTablesDemo extends BaseTestDemo {
	
	@Test
	public void webTablesDemo() {
		getDriver().get("https://jqueryui.com");
		getDriver().findElement(By.linkText("Datepicker")).click();
		
		getDriver().switchTo().frame(0);
		
		getDriver().findElement(By.id("datepicker")).click();
		
		List<WebElement> listDates = getDriver().findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		int todayDate = DateTimeUtilities.getTodayDate();
		
		for(WebElement element: listDates)
		{
			String txt =element.getText();
			int date = Integer.parseInt(txt);
			if (date == todayDate) {
				element.click();
				break;
			}
		}
		
		
	}
	
}
