package com.saiteja.automation.frameworks.business;

import org.testng.annotations.Test;

import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class fp extends BaseTestDemo {
	@Test
	public void fptest() {
	  getDriver().get("https://www.flipkart.com");

	}
}
