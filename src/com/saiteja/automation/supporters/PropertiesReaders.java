package com.saiteja.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;


//These are the reusable functions custom function to work with the properties reader.

public class PropertiesReaders {

	private String filePath;
	private FileInputStream fileInputStream;
	private Properties properties;
	private String value;
	private Object key;
	
	// I want to perform initialization of this variable through this  parametrized constructor.
	public PropertiesReaders(String filePath) throws IOException
	{
		this.filePath = filePath;
		fileInputStream = new FileInputStream(filePath);
		properties = new Properties();
		properties.load(fileInputStream);
	}
	
	//Now i want to get the data from properties file
	public String getPropertyValue(String key) {
		if(properties!=null) {
		 value = properties.getProperty(key);
		}
		else {
			//throw the exception
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
		}
		return value;
	}
	
	//ANOTHER APPROACH using default values
	public String getPropertyValue(String key,String defaultvalue) {
		if(properties!=null) {
		 value = properties.getProperty(key);
		 if(value == null) {
			 value = defaultvalue;
		 }
		}
		else {
			//throw the exception
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
		}
		return value;
	}
	
	//ANOTHER APPROACH
	
	public String getPropertyValue(Object key) {
		if(properties!=null) {
		 value = (String) properties.get(key); //get method is coming from map string cannot hold object so ttype casting.
		}
		else {
			//throw the exception
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
		}
		return value;
	}
	
	//Another approach
	
	public String getPropertyValue(Object key,Object defaultvalue) {
		if(properties!=null) {
		 value = (String) properties.getOrDefault(key, defaultvalue);
		 if(value == null) {
			 value = (String) defaultvalue;
		 }
		}
		else {
			//throw the exception
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
		}
		return value;
	}
	
	//To get all keys 
	public Set getAllKeys() {
		Set setKeys = null;
		if(properties != null) {
			setKeys = properties.keySet();
		}
		else {
			//throw exception
			System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");
		}
		return setKeys;
	}
	
	//To get all values
	public List AllValue() {
		Set keys = getAllKeys();
		List listkeys = new ArrayList<>();
		for(Object objkey:keys)
		{
			Object value = properties.get(objkey);
			listkeys.add(value);
		}
		return listkeys;
	}
	
	//to get all keys value
	public java.util.Map<String, String> getAllKeysValue() {
		java.util.Map<String, String> mapkeyvalue = new LinkedHashMap<String, String>();
		Set setKeys = getAllKeys();
		for(Object obj: setKeys)
		{
			String Key = (String) obj;
			value = properties.getProperty(Key);
			mapkeyvalue.put(Key, value);
		}
		return mapkeyvalue;
	}
	
	// in the whole class we are implementing the overloading concept same method name with different parameters
	
	//To remove the data
	
	public void removeKeyValue(String key, String value) throws IOException {
		if(properties!=null) {
			 properties.remove(key,value);
			 //if we do any modification we need to save the file
			 FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			 properties.store(fileOutputStream, "File is saved succefully");
			 
			}
			else {
				//throw the exception
				System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
			}
	}
	
	       //To write the data
	
	public void writeKeyValue(String key, String value) throws IOException {
		if(properties!=null) {
			 properties.setProperty(key, value);
			 //if we do any modification we need to save the file
			 FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			 properties.store(fileOutputStream, "File is saved succefully");
			 
			}
			else {
				//throw the exception
				System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
			}
		
	}
	
	
	//ANOTHER APPROACH TO WRITE THE DATA  USING OBJECT
	public void writeKeyValue(Object key, Object value) throws IOException {
		if(properties!=null) {
			 properties.put(key, value);
			 //if we do any modification we need to save the file
			 FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			 properties.store(fileOutputStream, "File is saved succefully");
			 
			}
			else {
				//throw the exception
				System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
			}
		
	}
	
	//TO REMOVE VALUE
	
	public void removeValue() throws IOException {
		if(properties!=null) {
			 properties.remove(key);
			 //if we do any modification we need to save the file
			 FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			 properties.store(fileOutputStream, "File is saved succefully");
			 
			}
			else {
				//throw the exception
				System.out.println("PROPERTIES OBJECT IS POINTING TO NULL");	
			}
	}
	
}
