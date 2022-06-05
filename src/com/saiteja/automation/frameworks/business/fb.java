package com.saiteja.automation.frameworks.business;

import org.testng.annotations.Test;

import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class fb extends BaseTestDemo {
	@Test
	public void fbtest() {
		getDriver().get("https://www.facebook.com");
	}
}
