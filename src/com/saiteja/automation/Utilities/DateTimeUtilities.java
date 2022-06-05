package com.saiteja.automation.Utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface DateTimeUtilities {

	public static LocalDate getLocalDate()
	{
		LocalDate localDate = LocalDate.now();
		return localDate;
	}
	
	public static LocalDateTime getLocalDateTime()
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime;
	}
	
	public static LocalTime getLocalTime()
	{
		LocalTime localTime = LocalTime.now();
		return localTime;
	}
	
	public static int getTodayDate()
	{
		LocalDate localDate =  getLocalDate();
		String localDateSting = localDate.toString(); //"2022-05-05"
		String[] str = localDateSting.split("-"); //[2022-05-05]
		String currentDate = str[2]; //"5"
		int date = Integer.parseInt(currentDate);
		return date;
	}
	
	public static int getPastDate(int daysToSubtract)
	{
		LocalDate localDate =  getLocalDate();
		localDate.minusDays(daysToSubtract);
		String localDateSting = localDate.toString(); //"2022-05-05"
		String[] str = localDateSting.split("-"); //[2022-05-05]
		String currentDate = str[2]; //"5"
		int date = Integer.parseInt(currentDate);
		return date;
	}
	
	public static int getFutureDate(int daysToAdd)
	{
		LocalDate localDate =  getLocalDate();
		localDate.plusDays(daysToAdd);
		String localDateSting = localDate.toString(); //"2022-05-05"
		String[] str = localDateSting.split("-"); //[2022-05-05]
		String currentDate = str[2]; //"5"
		int date = Integer.parseInt(currentDate);
		return date;
	}
	
	public static int getCurrentMonth()
	{
		LocalDate localDate =  getLocalDate();
		String localDateSting = localDate.toString(); //"2022-05-05"
		String[] str = localDateSting.split("-"); //[2022-05-05]
		String currentMonth = str[1]; //"5"
		int month = Integer.parseInt(currentMonth);
		return month;
	}
	
	public static int getCurrentYear()
	{
		LocalDate localDate =  getLocalDate();
		String localDateSting = localDate.toString(); //"2022-05-05"
		String[] str = localDateSting.split("-"); //[2022-05-05]
		String currentYear = str[0]; //"5"
		int year = Integer.parseInt(currentYear);
		return year;
	}
}
