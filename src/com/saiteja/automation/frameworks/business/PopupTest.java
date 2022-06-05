package com.saiteja.automation.frameworks.business;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class PopupTest extends BaseTestDemo{
	
	@Test
	public void popupTest() throws InterruptedException {
		getDriver().get("file:///c:/Users/RAMESHSOFT/Desktop/alerts4/prompt.html");
		getDriver().findElement(By.xpath("//button[@onclick='propmtFunction()']")).click();
		Thread.sleep(2000);
		
		//now i want to switch to alert
		Alert alert = getDriver().switchTo().alert();
		alert.sendKeys("javaselenium"); // I want to send some keys
		String alertText = alert.getText(); //i want ot get the text in the form string
		System.out.println(alertText);
		
		alert.accept(); // to click on alert we use accept() method
		//Alert is an interface which contains N no of methods.
		
	     Thread.sleep(5000);
		
		
		
		
		
		
	}
	
	
	
	
}
