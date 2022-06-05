package com.saiteja.automation.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
public static void main(String[] args) {
	
	RegExUtilities.isValidphNum("9177791456");
	
	
	
	
	
	
	
	
	
	//validating phone number
	/*String phNUmber = "9177791456";
	Pattern pattern = Pattern.compile("(0|[+]91)?[6789][0-9]{9}");
	
	Matcher matcher = pattern.matcher(phNUmber);
	
	if (matcher.find()&&matcher.group().equalsIgnoreCase(phNUmber)) {
		System.out.println("It is a valid phone number");	
	}
	else {
		System.out.println("It is a NOt valid phone number");
	}
	*/
	
	
	
	
	
	
	//Finding total no of occurences of char or word
	/*Pattern pattern = Pattern.compile("[a-z]"); // pattern object
	Matcher matcher = pattern.matcher("javajava jobsalajava"); //in this pattern class we have a method called matcher for target
	//by above line u get the matcher object
	
	int acount = 0;
	
	while(matcher.find()) {
		acount++;
		String str = matcher.group();
		int startindex = matcher.start();
		int endindex = matcher.end();
		System.out.println(str+"  "+startindex+"  "+endindex);
	}
	
	
	System.out.println("NO of accureneces of a char a is: "+acount);
	*/
	
}
}
