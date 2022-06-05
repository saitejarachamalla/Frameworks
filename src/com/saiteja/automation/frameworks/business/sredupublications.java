package com.saiteja.automation.frameworks.business;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class sredupublications extends BaseTestDemo {
	@Test
	public void srtest()  {
		getDriver().get("https://www.sredupublications.com");
		getExtentTest().log(LogStatus.PASS, "opened website");
	}
}
