package com.saiteja.automation.testdata;

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

public class ExcelLoopsDemo {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	//step1:other approach(specifying the location)
		FileInputStream fip = new FileInputStream("H:\\javapractise\\frameworks\\src\\com\\saiteja\\automation\\testdata\\Test_ExcelFile.xls");
		
		//Step2:for this file i want to create the workbook for that we have predefined class called Workbookfactory in that we have method called create.
		Workbook workbook = WorkbookFactory.create(fip);
		//2nd approach by giving sheet name
		Sheet sheet = workbook.getSheet("Gmail_data");
		
		for (int i = 0; i <=sheet.getLastRowNum(); i++)
		{
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getLastCellNum(); j++) 
			{
				Cell cell = row.getCell(j);
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					String cellvalue = cell.getStringCellValue();
					System.out.println(cellvalue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
					String cellvalue = cell.getBooleanCellValue()+"";
					System.out.println(cellvalue);
				}
				else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					String cellvalue = cell.getNumericCellValue()+"";
					System.out.println(cellvalue);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
