import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class error {

	private static WebDriver driver;
	
	
		@BeforeSuite
		public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "H:\\javapractise\\frameworks\\Drivers\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//RemoteWebDriver driver= new ChromeDriver();
		//SearchContext driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();		  
		
		}
		@Test
		public void gmailLogin() throws InterruptedException	{
			Thread.sleep(2000);
			driver.get("http://www.gmail.co.in");	
			Thread.sleep(2000);
		WebElement fed=driver.findElement(By.id("identifierId"));
		Thread.sleep(2000);
		fed.clear();	
		Thread.sleep(2000);
		fed.sendKeys("ramuinduri44@gmail.com");
		Thread.sleep(2000);
		}
		
		@AfterSuite
		public void closeBrowser(){
			
			driver.quit();
		}
		
}



