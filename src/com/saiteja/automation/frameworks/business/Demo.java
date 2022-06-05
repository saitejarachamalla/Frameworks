package com.saiteja.automation.frameworks.business;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
public static void main(String[] args) {
	
	System.setProperty("", "");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.get("https://www.gmail.com");
	
	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	
	WebElement un = driver.findElement(By.id("identifierId"));
	//general datatyping approach
	//un.clear();
	//un.sendKeys("saitejrachamalla@gmail.com");
	
	//using java script executor
	javascriptExecutor.executeScript("arguments[0].value='saitejrachamalla@gmail.com'", un);
	
	WebElement nxt = driver.findElement(By.id("identifierNext"));
	//nxt.click;
	javascriptExecutor.executeScript("arguments[0].click();", nxt);
	
	javascriptExecutor.executeScript("document.getElementById('identifierNext').clcik();");
	
	javascriptExecutor.executeScript("location.relaod();");
	
	
	String domainName = javascriptExecutor.executeScript("return document.domain").toString();
	String url = javascriptExecutor.executeScript("return document.URL").toString();
	String title = javascriptExecutor.executeScript("return document.title").toString();
	
	
	javascriptExecutor.executeScript("window.location='https://www.gmail.com'");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
