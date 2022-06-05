package com.saiteja.automation.customisedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {
public static void main(String[] args) throws FileNotFoundException {
	
	System.out.println("1");
	System.out.println("2");
	
	try {
		FileInputStream fip = new FileInputStream("H:\\javapractise\\frameworks\\config.properties");
		System.out.println("Outer try block");
			try {
				System.out.println("inner try block");
			} catch (Exception exception) {
				System.out.println("inner catch block");
			}
		}
	catch(FileNotFoundException exception)
	{
		System.out.println("FINFE: catch block");
		try {
			System.out.println("inner try block");
		} catch (Exception exception2) {
			System.out.println("inner catch block");
		}
	}
	catch(Exception exception) {
		System.out.println("Exception: catch block");
	}
	finally
	{
		System.out.println("finally block");
	}
	System.out.println("3");
	System.out.println("4");

}
}
