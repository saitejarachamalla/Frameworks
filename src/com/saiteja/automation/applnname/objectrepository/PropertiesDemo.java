package com.saiteja.automation.applnname.objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.testng.mustache.Value;

public class PropertiesDemo {
public static void main(String[] args) throws IOException {
	/*// 1st approach
	File file = new File("H:\\javapractise\\frameworks\\config.properties");
	FileInputStream fip = new FileInputStream(file);
	*/
	
	
	
	/*
	//2nd approach
	//specifying the location of the file
	FileInputStream fip = new FileInputStream("H:\\javapractise\\frameworks\\config.properties");
	//to load the file from this above location to my java program predefined class properties
	Properties properties = new Properties();
	properties.load(fip);  
	
	//to read the data
	String val1 = properties.getProperty("qa_url");
	System.out.println(val1);
	
	String val2 = properties.getProperty("qa_un");
	System.out.println(val2);
	
	String val3 = properties.getProperty("qa_reports");
	System.out.println(val3);
	
	
	//to get all keys
	Set setkeys =  properties.keySet();
	for(Object obj : setkeys)
	{
		String key = (String) obj;
		String value = properties.getProperty(key);
		System.out.println(key+"**************"+value);
	}
	*/
	
	
	// 3 To write the data to properties file
	FileInputStream fip = new FileInputStream("H:\\javapractise\\frameworks\\config.properties");
	//to load the file from this above location to my java program predefined class properties
	Properties properties = new Properties();
	properties.load(fip);
	
	//to write the data to properties file
	properties.setProperty("hello", "java");
	properties.put("java", "python");
	properties.setProperty("hardwork", "life");
	properties.put("job", "solution");
	
	//to save the file
	FileOutputStream fop = new FileOutputStream("H:\\javapractise\\frameworks\\config.properties");
	properties.store(fop, "File is saved succesfully");
	
}
}
