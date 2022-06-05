package com.saiteja.automation.listeners;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.saiteja.automation.Utilities.ScreenshotUtility;

public class Testcaseadapter extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Testcase is failed: "+arg0.getName());
		try {
			ScreenshotUtility.takescreenshot(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Testcase is skipped: "+arg0.getName());
		try {
			ScreenshotUtility.takescreenshot(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Testcase is started: "+arg0.getName());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Testcase is success: "+arg0.getName());
	}

}
