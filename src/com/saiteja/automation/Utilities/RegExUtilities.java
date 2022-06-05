package com.saiteja.automation.Utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegExUtilities {

	public static boolean isValidphNum(String phNumber)
	{
		boolean valid =true;
		Pattern pattern = Pattern.compile("(0|[+]91)?[6789][0-9]{9}");
		
		Matcher matcher = pattern.matcher(phNumber);
		
		if (matcher.find()&&matcher.group().equalsIgnoreCase(phNumber)) {
			System.out.println("It is a valid phone number");	
		}
		else {
			System.out.println("It is a NOt valid phone number");
			valid = false;
		}
		return valid;
	}
}
