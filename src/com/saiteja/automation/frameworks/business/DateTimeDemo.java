package com.saiteja.automation.frameworks.business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
public static void main(String[] args) {
	
	//formatting date
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println("Before formatting: "+localDateTime);
	
	//to formatiing we have a predefined class class date tiem format.
	
	DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
	String formattedDateTime = localDateTime.format(dateTimeFormatter);
	System.out.println("After formatting "+formattedDateTime);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*//I want todays date
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate);
	*/
	
	
	/*//to get yesterdays date
	LocalDate yesterdayDate = localDate.minusDays(1);
	System.out.println(yesterdayDate);
	
	
	LocalDate dayb4yesterdayDate = localDate.minusDays(2);
	System.out.println(dayb4yesterdayDate);
	
	//to get tomorrow date
	LocalDate tomorrowDate = localDate.plusDays(1);
	System.out.println(tomorrowDate);
	
	LocalDate dayaftertom = localDate.plusDays(2);
	System.out.println(dayaftertom);
	*/
	
	
	
	// to get current date time
	/*LocalDate localDate = LocalDate.now();
	System.out.println(localDate);
	
	LocalTime localTime = LocalTime.now();
	System.out.println(localTime);
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println(localDateTime);
	
	*/
}
}
