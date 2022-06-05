package com.saiteja.automation.Utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.saiteja.automation.supporters.ExcelAnna;
import com.saiteja.automation.supporters.ExcelReader;
import com.saiteja.automation.supporters.PropertiesReaders;
import com.saiteja.automation.supporters.TextReader;

public class PojoUtility {

	public static PropertiesReaders getprconfobj() throws IOException
	{
		PropertiesReaders prconf = new PropertiesReaders(filepaths.confpath);
		return prconf;
		
	}
	
	public static PropertiesReaders getprorobj() throws IOException {
		PropertiesReaders prOr = new PropertiesReaders(filepaths.orpath);
		return prOr;	
	}
	
	public static ExcelAnna getExcelobj() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		ExcelAnna excelReader = new ExcelAnna(filepaths.excelpath);
		return excelReader;
	}
	
	public static TextReader geTextobj() throws IOException
	{
		TextReader textReader = new TextReader(filepaths.txtpath);
		return textReader;
	}
}

