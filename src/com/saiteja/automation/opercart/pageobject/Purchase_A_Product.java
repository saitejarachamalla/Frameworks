package com.saiteja.automation.opercart.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.saiteja.automation.frameworks.base.BaseTestDemo;

public class Purchase_A_Product extends BaseTestDemo {

	@FindBy(xpath="(//div[@class='product-thumb'])[1]")
	private static WebElement LaptopProductframe;
	
	@FindBy(xpath="(//div[@class='product-thumb'])[1]/div[2]/div[1]/h4/a")
	private static WebElement HpLaptop;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private static WebElement quantity;
	
	@FindBy(xpath="(//div[@class='input-group date'])[1]/input")
	private static WebElement deliverydate;
	
	/*@FindBy(xpath="//i[@class='fa fa-calendar']")
	private static WebElement calender;
	
	@FindBy(xpath="(//td[@class='day'])[25]")
	private static WebElement date;*/
	
	@FindBy(xpath="(//ul[@class='list-unstyled'])[9]/li/h2")
	private static WebElement price;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private static WebElement addToCart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private static WebElement sucessmsg;
	
	@FindBy(xpath="//div[@id='cart']")
	private static WebElement cartbutton;
	
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[3]")
	private static WebElement veiwcartbutton;
	
	@FindBy(xpath="//div[@class='buttons clearfix']/div[2]/a")
	private static WebElement checkoutbutton;
	
	@FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	private static WebElement radioframe;
	
	@FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]")
	private static WebElement Guestradio;
	
	@FindBy(xpath="//input[@id='button-account']")
	private static WebElement continuebutton;
	
	@FindBy(xpath="//fieldset[@id='account']")
	private static WebElement detailsblock;
	
	@FindBy(xpath="//div[@class='checkbox']/label/input")
	private static WebElement Checkbox;	
	
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	private static WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	private static WebElement lastname;
	
	
	@FindBy(xpath="//input[@id='input-payment-email']")
	private static WebElement email;
	
	@FindBy(xpath="//input[@id='input-payment-telephone']")
	private static WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	private static WebElement Address1;
	
	@FindBy(xpath="//input[@id='input-payment-city']")
	private static WebElement city;
	
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	private static WebElement pincode;
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	private static WebElement countrydd;
	
	@FindBy(xpath="//select[@id='input-payment-country']/option[107]")
	private static WebElement India;
	
	@FindBy(xpath="//select[@id='input-payment-zone']")
	private static WebElement zonedd;
	
	@FindBy(xpath="//select[@id='input-payment-zone']/option[3]")
	private static WebElement state;
	
	@FindBy(xpath="//div[@class='checkbox']/label/input")
	private static WebElement checkbx;
	
	@FindBy(xpath="//input[@id='button-guest']")
	private static WebElement guestcontinue;
	
	@FindBy(xpath="(//a[@class='accordion-toggle'])[1]")
	private static WebElement deliverydetails;
	
	@FindBy(xpath="//input[@id='button-guest-shipping']")
	private static WebElement deliverydetailscontinue;
	
	@FindBy(xpath="(//div[@class='radio'])[4]")
	private static WebElement flatrate;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private static WebElement deliverymethodcontinue;
	
	@FindBy(xpath="//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private static WebElement termscheckbox;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private static WebElement paymentcontinue;
	
	@FindBy(xpath="//input[@id='button-confirm']")
	private static WebElement confirmbutton;
	
	@FindBy(xpath="//div[@class='pull-right']/a")
	private static WebElement finalcontinue;
	
	public static void goToLAptopProduct() {
		try {
			Assert.assertTrue(LaptopProductframe.isDisplayed()&&LaptopProductframe.isEnabled());
			getExtentTest().log(LogStatus.PASS, "LaptopProduct  is displayed");
			Thread.sleep(1000);
			Actions actions = new Actions(getDriver());
			actions.moveToElement(HpLaptop).build().perform();
			getExtentTest().log(LogStatus.PASS, "Mouse hover done of hp laptop");
			Thread.sleep(1000);
			actions.click(HpLaptop).build().perform();
			getExtentTest().log(LogStatus.PASS, "clicked on hplaptop");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "LaptopProduct  is NOT displayed");
		}

	}
	
	public static void quantityA() {
		try {
			Assert.assertTrue(quantity.isDisplayed()&&quantity.isEnabled());
			getExtentTest().log(LogStatus.PASS, "quantity  is displayed");
			Thread.sleep(1000);
			
			String quanitityval = quantity.getAttribute("value");
			int qntyval = Integer.parseInt(quanitityval);
			if (qntyval==1) {
		
				getExtentTest().log(LogStatus.PASS, "quantity value = 1");
			}
			else {
				getExtentTest().log(LogStatus.FAIL, "Quantity value NOT = 1");
			}
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "quantity  is NOT displayed");
		}

	}
	
	public static void DeliveryDate() throws InterruptedException {
		try {
			Assert.assertTrue(deliverydate.isDisplayed()&&deliverydate.isEnabled());
			getExtentTest().log(LogStatus.PASS, "deliverydate  is displayed");
			Thread.sleep(1000);
			//Actions actions = new Actions(getDriver());
			deliverydate.clear();
			getExtentTest().log(LogStatus.PASS, "cleared deliversy date");
			deliverydate.sendKeys("2022-05-25");
			getExtentTest().log(LogStatus.PASS, "Data typing action done on delivey date");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "deliverydate  is NOT displayed");
		}
		
	}
	
	public static void priceAndAddTocart() {
		try {
			Assert.assertTrue(price.isDisplayed()&&price.isEnabled());
			getExtentTest().log(LogStatus.PASS, "price  is displayed");
			Thread.sleep(1000);
			Assert.assertTrue(addToCart.isDisplayed()&&addToCart.isEnabled());
			getExtentTest().log(LogStatus.PASS, "addToCart  is displayed");
			Thread.sleep(1000);
			addToCart.click();
			getExtentTest().log(LogStatus.PASS, "clicked on  addtocart");
			Assert.assertTrue(sucessmsg.isDisplayed()&&sucessmsg.isEnabled());
			getExtentTest().log(LogStatus.PASS, "sucessmsg  is displayed");
			Thread.sleep(1000);
			
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "price  is NOT displayed");
		}

	}
	
	public static void viewCart() {
		try {
			Assert.assertTrue(cartbutton.isDisplayed()&&cartbutton.isEnabled());
			getExtentTest().log(LogStatus.PASS, "cartbutton  is displayed");
			Thread.sleep(1000);
			cartbutton.click();
			getExtentTest().log(LogStatus.PASS, "cartbutton  is clicked");
			Thread.sleep(1000);
			veiwcartbutton.click();
			getExtentTest().log(LogStatus.PASS, "viewcart  is clicked");
			Thread.sleep(1000);
			checkoutbutton.click();
			getExtentTest().log(LogStatus.PASS, " clicked on checkout");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "cartbutton  is NOT displayed");
		}

	}
	
	public static void gotoradiobutton() {
		try {
			Assert.assertTrue(radioframe.isDisplayed()&&radioframe.isEnabled());
			getExtentTest().log(LogStatus.PASS, "radioframe  is displayed");
			Thread.sleep(1000);
			if (Guestradio!=null) {
				Guestradio.click();
				getExtentTest().log(LogStatus.PASS, "Guestradio button is clicked");
			}
			else {
				getExtentTest().log(LogStatus.PASS, "Guestradio button is NOT  clicked");
			}
			Thread.sleep(1000);
			continuebutton.click();
			getExtentTest().log(LogStatus.PASS, "continue button is clicked");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.PASS, "Guestradio  is NOT displayed");
		}

	}
	
	
	public static void details() {
		try {
			Assert.assertTrue(detailsblock.isDisplayed()&&detailsblock.isEnabled());
			getExtentTest().log(LogStatus.PASS, "detailsblock  is displayed");
			Thread.sleep(1000);
			//Actions actions = new Actions(getDriver());
			firstname.sendKeys("sai");
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+firstname);
			Thread.sleep(1000);
			lastname.sendKeys("teja");
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+lastname);
			Thread.sleep(1000);
			email.sendKeys("saitejarachamalla@gmail.com");
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+email);
			Thread.sleep(1000);
			telephone.sendKeys("9553211467");
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+telephone);
			Thread.sleep(1000);
			Address1.sendKeys("kalwakurthy");
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+Address1);
			Thread.sleep(1000);
			city.sendKeys("kalwakurthy");
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+city);
			Thread.sleep(1000);
			pincode.sendKeys("509324");
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+pincode);
			Thread.sleep(1000);
			countrydd.click();
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+countrydd);
			Thread.sleep(1000);
			India.click();
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+India);
			Thread.sleep(1000);
			zonedd.click();
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+zonedd);
			Thread.sleep(1000);
			state.click();
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on "+state);
			Thread.sleep(1000);
		
		
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "detailsblock  is NOT displayed");
		}

	}
	
	public static void chckbox() {
		try {
			Assert.assertTrue(checkbx.isDisplayed()&&checkbx.isEnabled());
			getExtentTest().log(LogStatus.PASS, "checkbx  is displayed");
			Thread.sleep(1000);
			if (checkbx!=null) {
				getExtentTest().log(LogStatus.PASS, "Check box is checked");
			}
			guestcontinue.click();
			getExtentTest().log(LogStatus.PASS, "clicked on guest continue");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "checkbx  is NOT displayed");
		}

	}
	
	public static void deliveryDetail() {
		try {
		Assert.assertTrue(deliverydetails.isDisplayed()&&deliverydetails.isEnabled());
		getExtentTest().log(LogStatus.PASS, "deliverydetails  is displayed");
		Thread.sleep(1000);
		deliverydetailscontinue.click();
		getExtentTest().log(LogStatus.PASS, "clicked on guest deliverydetailscontinue");
		Thread.sleep(1000);
		}
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "deliverydetails  is NOT displayed");
		}
	}
	
	public static void Deliverymethod() {
		try {
			Assert.assertTrue(flatrate.isDisplayed()&&flatrate.isEnabled());
			getExtentTest().log(LogStatus.PASS, "flatrate  is displayed");
			Thread.sleep(1000);
			deliverymethodcontinue.click();
			getExtentTest().log(LogStatus.PASS, "clicked on guest deliverymethodcontinue");
			Thread.sleep(1000);
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "flatrate  is NOT displayed");
		}

	}
	
	public static void termschck() {
		try {
			/*Assert.assertTrue(termscheckbox.isDisplayed()&&termscheckbox.isEnabled());
			getExtentTest().log(LogStatus.PASS, "termscheckbox  is displayed");
			Thread.sleep(1000);
			*///if (termscheckbox!=null) {
			Actions actions = new Actions(getDriver());
			actions.click(termscheckbox).build().perform();
			getExtentTest().log(LogStatus.PASS, "clicked on guest termscheckbox");
			//}
			paymentcontinue.click();
			getExtentTest().log(LogStatus.PASS, "clicked on guest payementcontinue");
			Thread.sleep(1000);
			confirmbutton.click();
			getExtentTest().log(LogStatus.PASS, "clicked on guest confirm button");
			Thread.sleep(1000);
			finalcontinue.click();
			getExtentTest().log(LogStatus.PASS, "clicked on guest final continue button");
			Thread.sleep(1000);
			
		} catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "termscheckbox  is NOT displayed");
		}

	}
	
	
	
	static {
		PageFactory.initElements(getDriver(), Purchase_A_Product.class);
	}
	
	
	
	
	
}
