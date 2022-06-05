package com.saiteja.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReader {

	private String filepath; //variable
	private FileInputStream fileinputstream;
	private Workbook workbook;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private String cellvalue;
	
	
	public ExcelReader(String filepath) throws EncryptedDocumentException, InvalidFormatException, IOException //initializing the filepath through constructor
	{
		this.filepath = filepath;
		fileinputstream = new FileInputStream(filepath);
		WorkbookFactory.create(fileinputstream);
	}
	
	public Sheet getsheetobj(String how,String howvalue) {
		if(workbook!=null) {
			if (how.equalsIgnoreCase("sheetname")) {
				sheet = workbook.getSheet(howvalue); 
			}
			else if (how.equalsIgnoreCase("index")) {    //this method is taking the parameter integer im passing the value in the form of string "0" to convert in to integert 0
				int index = Integer.parseInt(howvalue);  // to convert string to integer we are using wrapper class called Integer.
				sheet = workbook.getSheetAt(index);	
			}
			else {
				//throw exception
				System.out.println("Workbook is pointing to null");
			}
		}
		return sheet;
	}

	// I WANT TO GET THE DATA OR I WANT TOTAL NO.OF ROWS IN FROM THE SHEET
	public int getRowsCountFromSheet(String how,String howvalue) {
		sheet = getsheetobj(how, howvalue);
		int rowCount = 0;
		
		if (sheet!=null) {
			rowCount = sheet.getLastRowNum();
		}
		else {
			//throw exception
			System.out.println("SHEET IS POINTING TO NULL");
		}
		return rowCount;
	}
	
	//TO GET CELL COUNT
	
	public int getCellsCountFromSheet(String how,String howvalue,int rowNum) {
		sheet = getsheetobj(how, howvalue);
		int cellCount = 0;
		
		if (sheet!=null) {
			row = sheet.getRow(rowNum);
			cellCount = row.getLastCellNum();
		}
		else {
			//throw exception
			System.out.println("SHEET IS POINTING TO NULL");
		}
		return cellCount;
	}
	
	//GET CELL DATA
	
	public String getCellData(String how,String howvalue,int rowNum,int cellNum) {
		sheet = getsheetobj(how, howvalue);
		cell = sheet.getRow(rowNum).getCell(cellNum);
		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
			cellvalue = cell.getStringCellValue();	
		}
		else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			cellvalue = cell.getNumericCellValue()+"";	
		}
		else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			cellvalue = cell.getBooleanCellValue()+"";	
		}
		return cellvalue;
	}
	
	//TO GET A ROW DATA
	
	public List<String> getRowData(String how,String howvalue,int rowNum) {
		List<String> rowData =new ArrayList<>();
		sheet = getsheetobj(how, howvalue);
		row = sheet.getRow(rowNum);
		if (row!=null) {
			for (int i = 0; i < row.getLastCellNum(); i++) 
			{
				cell = row.getCell(i);
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					cellvalue = cell.getStringCellValue();
					rowData.add(cellvalue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					cellvalue = cell.getNumericCellValue()+"";
					rowData.add(cellvalue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
					cellvalue = cell.getBooleanCellValue()+"";
					rowData.add(cellvalue);
				}	
			}
		}
		else {
			//throw exception
			System.out.println("ROW IS POINTING TO NULL");
		}
		return rowData;
	}
	
	//to get total sheet data
	public List<String> getSheetData(String how, String howvalue) {
		List<String> sheetData = new ArrayList<>();
		sheet = getsheetobj(how, howvalue);
		for (int i = 0; i <=sheet.getLastRowNum(); i++) 
		{
			row =  sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) 
			{
				cell = row.getCell(j);
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					cellvalue = cell.getStringCellValue();
					sheetData.add(cellvalue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					cellvalue = cell.getNumericCellValue()+"";
					sheetData.add(cellvalue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
					cellvalue = cell.getBooleanCellValue()+"";
					sheetData.add(cellvalue);
				}	
			}
		}
		return sheetData;
	}
	
	//IF YOU WANT UNIQUE SHEET DATA WITHOUT DUPLICATES
	public Set<String> getUniqueSheetData(String how,String howvalue) {
		List<String> listSheetData = getSheetData(how, howvalue);
		Set<String> setSheetData = new HashSet<String>(listSheetData);
		return setSheetData;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		ExcelReader excelreader = new ExcelReader("H://testdata.xlsx");
		excelreader.getsheetobj("sheetname", "Gmail_data");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
