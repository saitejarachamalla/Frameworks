package com.saiteja.automation.frameworks.business;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
public static void main(String[] args) {
	
	int num1 = 25, num2 =65;
	
	//hard assertions
	
	System.out.println("1");
	System.out.println("2");
	Assert.assertEquals(num1, num2);
	System.out.println("3");
	System.out.println("4");
	
	
	
	/*
	//soft assertions
	SoftAssert softAssert = new SoftAssert();
	System.out.println("1");
	System.out.println("2");
	softAssert.assertEquals(num1, num2);
	System.out.println("3");
	System.out.println("4");
*/
	
	
	
	
	//verify statements
	/*if (num1 == num2) {
		System.out.println("if");
	}
	else {
		System.out.println("else");
	}
	System.out.println("ns");
	*/
	
}
}
