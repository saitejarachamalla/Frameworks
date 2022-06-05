package com.saiteja.automation.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelDemo {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	//specify the location of data(excel file location)
	/*// one approach
	File file = new  File("H:\\javapractise\\frameworks\\src\\com\\saiteja\\automation\\testdata\\Test Data.xls");
	FileInputStream fip = new FileInputStream(file);
	*/
	
	//step1:other approach(specifying the location)
	FileInputStream fip = new FileInputStream("H:\\javapractise\\frameworks\\src\\com\\saiteja\\automation\\testdata\\Test_ExcelFile.xls");
	
	//Step2:for this file i want to create the workbook for that we have predefined class called Workbookfactory in that we have method called create.
	Workbook workbook = WorkbookFactory.create(fip);
	
	/* //workbook is a collection of sheets
	Sheet sheet =  workbook.getSheetAt(0);  //from this workbook we are getting  0 sheet.
	*/
	//2nd approach by giving sheet name
	Sheet sheet = workbook.getSheet("Gmail_data");
	
	int totalRows = sheet.getLastRowNum();
	System.out.println("Total rows: "+totalRows);
	
	Row row0 = sheet.getRow(0);  //Row is an interface spl desined to work with rows.
	
	int totalCellCount = row0.getLastCellNum();
	System.out.println("Total row cell count is: "+totalCellCount);
	
	Cell cell00 =  row0.getCell(0);  //cell is an interface spl designed to work with cells.
	
	String cell00Value =  cell00.getStringCellValue();
	System.out.println(cell00Value);
	
	Cell cell01 = row0.getCell(1);
	String cell01value = cell01.getStringCellValue();
	System.out.println(cell01value);
	
	Row row1 = sheet.getRow(1);
	Cell cell10 = row1.getCell(0);
	String cell10value = cell10.getStringCellValue();
	System.out.println(cell10value);
	
	Cell cell11 = row1.getCell(1);
	String cell11value = cell11.getStringCellValue();
	System.out.println(cell11value);
	
	/*//second row
	Row row2 = sheet.getRow(2);
	Cell cell20 = row2.getCell(0);
	String cell20value = cell20.getStringCellValue();
	System.out.println(cell20value);
	*/
	/*
	//for numeric cell values
	Row row2 = sheet.getRow(2);
	Cell cell20 = row2.getCell(0);
	String cell20value = cell20.getNumericCellValue()+"";
	System.out.println(cell20value);
	*/
	
	//we should do validation before getting the data from each cell
	Row row2 = sheet.getRow(2);
	Cell cell20 = row2.getCell(0);
	//String cell20value = cell20.getStringCellValue();
	if (cell20.getCellType() == Cell.CELL_TYPE_STRING) {
		String cell20value = cell20.getStringCellValue();
		System.out.println(cell20value);
	}
	else if (cell20.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
		boolean cell20value = cell20.getBooleanCellValue();
		System.out.println(cell20value);
	}
	else if (cell20.getCellType() == Cell.CELL_TYPE_NUMERIC) {
		double cell20value = cell20.getNumericCellValue();
		System.out.println(cell20value);
	}	
	
}
}
