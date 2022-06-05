package com.saiteja.automation.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsDemo {
public static void main(String[] args) {
	//specifying location
	ExtentReports extentReports = new ExtentReports("H:\\javapractise\\frameworks\\Reports\\report.html");
	
	Map<String, String> map = new HashMap<String, String>();
	map.put("name", "Saiteja");
	map.put("user", "sai");
	map.put("target", "job");
	
	extentReports.addSystemInfo(map);
	//ExtentTest extentTest =  extentReports.startTest("gmail","demo");
	ExtentTest extentTest = extentReports.startTest("gmail");
	
	extentTest.log(LogStatus.PASS, "browser is openeed");
	extentTest.log(LogStatus.PASS, "Entered url as www.gmail.com");
	extentTest.log(LogStatus.PASS, "DTA is done ");
	extentTest.log(LogStatus.PASS, "browser is closed");
	
	extentReports.endTest(extentTest);
	extentReports.flush();
	extentReports.close();
}
}
