package com.saiteja.automation.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.saiteja.automation.frameworks.base.BaseTestDemo;

public interface ScreenshotUtility {

	public static String takescreenshot() throws IOException
	{
		TakesScreenshot takesscreenshot = (TakesScreenshot) BaseTestDemo.getDriver();
		File file = takesscreenshot.getScreenshotAs(OutputType.FILE);
		String imagepath = System.getProperty("user.dir")+"\\screenshots\\"+BaseTestDemo.getTcName()+".jpeg";
		FileUtils.copyFile(file, new File(imagepath));
		return imagepath;
	}
	
	public static String takescreenshot(String tcName) throws IOException
	{
		TakesScreenshot takesscreenshot = (TakesScreenshot) BaseTestDemo.getDriver();
		File file = takesscreenshot.getScreenshotAs(OutputType.FILE);
		String imagepath = System.getProperty("user.dir")+"\\screenshots\\"+tcName+".jpeg";
		FileUtils.copyFile(file, new File(imagepath));
		return imagepath;
	}
}
