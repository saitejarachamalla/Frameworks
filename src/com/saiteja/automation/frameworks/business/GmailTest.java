package com.saiteja.automation.frameworks.business;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.Utilities.PojoUtility;
import com.saiteja.automation.customisedexceptions.FramewroksException;
import com.saiteja.automation.frameworks.base.BaseTestDemo;
import com.saiteja.automation.rerun_testcases.Rerundemo;

public class GmailTest extends BaseTestDemo{
//	@Test(retryAnalyzer = Rerundemo.class)
	@Test
	public void gmailTest() throws IOException, EncryptedDocumentException, InvalidFormatException, FramewroksException {
		String unData = "";
		String url = PojoUtility.getprconfobj().getPropertyValue("qa_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
		
		//NEW APPROACH TO GET EXCEL DATA WITHOUT HARDCODING 
		unData = PojoUtility.getExcelobj().getCellData("sheetName", "Gmail_data", 0, 0);  //in ( ---) we need to specify the parameters which we want
		
		String un_id = PojoUtility.getprorobj().getPropertyValue("un_id");
		String nxt_id = PojoUtility.getprorobj().getPropertyValue("nxt_id");
		WebElement userName = getDriver().findElement(By.id(un_id));
		userName.clear();
		getExtentTest().log(LogStatus.PASS, "USername Element is cleared");
		
		userName.sendKeys(unData);
		getExtentTest().log(LogStatus.PASS, "Data typing action is done on username with test data");
		WebElement nxt = getDriver().findElement(By.id(nxt_id));
		nxt.click();
		getExtentTest().log(LogStatus.PASS, "clikced");
		
		
		//previous approach to get data from excel
		/*
		FileInputStream fip = new FileInputStream("H:\\javapractise\\frameworks\\src\\com\\saiteja\\automation\\testdata\\Test Data.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheet("Gmail_data");
		//sheet.getRow(0).getCell(0);  //one approach to get cell and row data
		Row row = sheet.getRow(0); //another approach to get row
		Cell cell = row.getCell(1); // another approach to get cell
		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
			undata = cell.getStringCellValue();	
		}
		else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			undata = cell.getNumericCellValue()+"";	
		}
		else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
			undata = cell.getBooleanCellValue()+"";	
		}
		*/
		
		
	/*	//its an approach to use pojo utility class
	String url = PojoUtility.getprconfobj().getPropertyValue("qa_url");	
	getDriver().get(url);	
		
	String un_id = PojoUtility.getprorobj().getPropertyValue("un_id");
	String nxt_id = PojoUtility.getprorobj().getPropertyValue("nxt_id");
	WebElement userName = getDriver().findElement(By.id(un_id));
	userName.clear();
	userName.sendKeys(undata);
	WebElement nxt = getDriver().findElement(By.id(nxt_id));
	nxt.click();
	*/
		
		
		//another APPROACH previous
	
	/*FileInputStream fipconf = new FileInputStream("H:\\javapractise\\frameworks\\config.properties");
	Properties prconf = new Properties();
	prconf.load(fipconf);
	String url = prconf.getProperty("qa_url");	
	getDriver().get(url);	
	
	
	FileInputStream fipOr = new FileInputStream("H:\\javapractise\\frameworks\\src\\com\\saiteja\\automation\\applnname\\objectrepository\\or.properties");
	Properties prOr = new Properties();
	prOr.load(fipOr);
	String un_id = prOr.getProperty("un_id");	
	WebElement userName = getDriver().findElement(By.id(un_id));
	userName.clear();
	userName.sendKeys("saitejarachamalla@gmail.com");
	
	String nxt_id = prOr.getProperty("nxt_id");
	WebElement nxt = getDriver().findElement(By.id(nxt_id));
	nxt.click();
	*/
}
}
