package com.saiteja.automation.frameworks.business;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.Utilities.PojoUtility;
import com.saiteja.automation.customisedexceptions.FramewroksException;
import com.saiteja.automation.frameworks.base.BaseTestDemo;
import com.saiteja.automation.opercart.pageobject.Add_Product_To_cart;
import com.saiteja.automation.opercart.pageobject.CompareThreeProducts;
import com.saiteja.automation.opercart.pageobject.CompareTwoProducts;
import com.saiteja.automation.opercart.pageobject.ForgetPassword;
import com.saiteja.automation.opercart.pageobject.LaptopsNoteBooksPage;
import com.saiteja.automation.opercart.pageobject.LogInAccount;
import com.saiteja.automation.opercart.pageobject.LogOut;
import com.saiteja.automation.opercart.pageobject.ProductWishList;
import com.saiteja.automation.opercart.pageobject.Purchase_A_Product;
import com.saiteja.automation.opercart.pageobject.RegisterAccount;
import com.saiteja.automation.opercart.pageobject.Remove_Products_From_comparision;
import com.saiteja.automation.opercart.pageobject.VerifyHeaders;
import com.saiteja.automation.opercart.pageobject.VerifyProductsSearch;
import com.saiteja.automation.opercart.pageobject.saudiwebsitedatepicker;

public class OpenCartTest extends BaseTestDemo {

	//@Test
	public void verifyLaptopsNoteBooksSize() throws IOException, EncryptedDocumentException, InvalidFormatException, FramewroksException {
		String unData = "";
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
		
		//NEW APPROACH TO GET EXCEL DATA WITHOUT HARDCODING 
		unData = PojoUtility.getExcelobj().getCellData("sheetName", "Gmail_data", 0, 0);  //in ( ---) we need to specify the parameters which we want
				
		
		LaptopsNoteBooksPage.mouseHoverOnLaptopsNoteBooks();
		LaptopsNoteBooksPage.clickonshowallLaptopsNoteBooks();
		LaptopsNoteBooksPage.verifyLaptopsAndNoteBooksSize();

	}
	
	//@Test
	public void verifyHeader() throws IOException, EncryptedDocumentException, InvalidFormatException, FramewroksException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		VerifyHeaders.verifyHeaders();
	}
	
	//@Test
	public void verifyShowALlLaptopsNotebooks() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		LaptopsNoteBooksPage.mouseHoverOnLaptopsNoteBooks();
		LaptopsNoteBooksPage.verifyLaptopsNotebooksValues();

	}
	//@Test
	public void verifyproducts() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		VerifyProductsSearch.getSearchBar();
		VerifyProductsSearch.clickSearchButton();
		VerifyProductsSearch.getCategory();
		VerifyProductsSearch.getcategorylist();
		VerifyProductsSearch.getClickSearchbutton();
	}
	
	
	//@Test
	public void addtoWishList() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		ProductWishList.getMacBookProduct();
		ProductWishList.clickOnMacBook();
		ProductWishList.addToWishList();

	}
	
	//@Test
	public void ToRegisteracc() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		RegisterAccount.getMyaccount();
		//RegisterAccount.getRegister();
		RegisterAccount.ToenterDeatils();
		RegisterAccount.clickOnRadioButton();
		RegisterAccount.clickOnCheckBox();
		RegisterAccount.clickOnContinueButton();
		

	}
	/*@Test
	public void getLoginPage() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		LogInAccount.getMyaccount();
		LogInAccount.gotoReturningCustomer();
	}*/
	
	//@Test
	public void getClickLogOut() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		LogInAccount.getMyaccount();
		LogInAccount.gotoReturningCustomer();
		LogOut.goToMyAccount();
		
	}
	
	//@Test
	public void GotoFogetPassword() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		LogInAccount.getMyaccount();
		ForgetPassword.GoToForgetPassword();

	}
	
	//@Test
	public void addProductThroughLogIn()  throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		LogInAccount.getMyaccount();
		LogInAccount.gotoReturningCustomer();
		ProductWishList.MovetoHome();
		ProductWishList.getMacBookProduct();
		ProductWishList.clickOnMacBook();
		ProductWishList.addToWishList();


	}
	//@Test
	public void toCompareTwoProducts() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		CompareTwoProducts.GoToMyAccount();
		CompareTwoProducts.Mp3Player();
		CompareTwoProducts.CompareProducts();
		CompareTwoProducts.ClickOnCompareProducts();
		CompareTwoProducts.GoToTwoProductsComparision();
		CompareTwoProducts.GotoAddCart();
		CompareTwoProducts.ToRemoveItem();
		CompareTwoProducts.ToAddCart();

	}
	
	//@Test
	public void ToCompareThreeProducts() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		CompareThreeProducts.GoToMyAccount();
		CompareThreeProducts.Mp3Player();
		CompareThreeProducts.CompareProducts();
		CompareThreeProducts.ClickOnCompareProducts();
		CompareThreeProducts.GoToThreeProductsComparision();

	}
	
	//@Test
	public void TORemoveProductsFromComparision() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		CompareThreeProducts.GoToMyAccount();
		CompareThreeProducts.Mp3Player();
		CompareThreeProducts.CompareProducts();
		CompareThreeProducts.ClickOnCompareProducts();
		CompareThreeProducts.GoToThreeProductsComparision();
		Remove_Products_From_comparision.removeProduct();
		Remove_Products_From_comparision.removeProduct2();
		

	}
	
	//@Test
	public void ToPurchaseproduct() throws IOException, InterruptedException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		LaptopsNoteBooksPage.mouseHoverOnLaptopsNoteBooks();
		LaptopsNoteBooksPage.clickonshowallLaptopsNoteBooks();
		LaptopsNoteBooksPage.verifyLaptopsAndNoteBooksSize();
		Purchase_A_Product.goToLAptopProduct();
		Purchase_A_Product.quantityA();
		Purchase_A_Product.DeliveryDate();
		Purchase_A_Product.priceAndAddTocart();
		Purchase_A_Product.viewCart();
		Purchase_A_Product.gotoradiobutton();
		Purchase_A_Product.details();
		Purchase_A_Product.chckbox();
		Purchase_A_Product.deliveryDetail();
		Purchase_A_Product.Deliverymethod();
		Purchase_A_Product.termschck();

	}
	
	//@Test
	public void ToAddProductFromComparison() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("pr_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		Add_Product_To_cart.ToMyAccount();
		Add_Product_To_cart.Mp3Player();
		Add_Product_To_cart.CompareProducts();
		Add_Product_To_cart.ClickOnCompareProducts();
		Add_Product_To_cart.GoToTwoProductsComparision();
		Add_Product_To_cart.GotoAddCart();
		
		Add_Product_To_cart.ToAddCart();
	}
	
	@Test
	public void airlinesDatePicker() throws IOException {
		String url = PojoUtility.getprconfobj().getPropertyValue("air_url");	
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "Url is entered as:"+url);
	
		saudiwebsitedatepicker.goToDatePicker();
		//saudiwebsitedatepicker.goToTripDate();
		saudiwebsitedatepicker.goToCalender();
		saudiwebsitedatepicker.gotocalenderframe();
		

		
	}
	
	
	
	
	
}
