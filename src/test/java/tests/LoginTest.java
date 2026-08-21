package tests;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;

import resources.Base;



public class LoginTest extends Base {
	
	Logger log;
	
	public WebDriver driver;
	
	@Test(dataProvider = "getLoginData")
public void login(String email, String password, String expectedResult) throws IOException, InterruptedException {
	
	
	  
	 
	 
	 LandingPage landingpage = new LandingPage(driver);
	 landingpage.myAccountDropdown().click();
	 log.debug("clicked on my account dropdown");
	 
	 landingpage.loginOption().click();
	 log.debug("clicked on login option");
	 Thread.sleep(5000);
	 
	 LoginPage loginpage = new LoginPage(driver);
	 
	 loginpage.emailAddressField().sendKeys(email);
	 log.debug("email address got entered");
	 // - hardcoding
	 //loginpage.emailAddressField().sendKeys(prop.getProperty("email"));
	 
	 loginpage.passwordField().sendKeys(password);
	 log.debug("password got entered");
	 // - hardcoding
	// loginpage.passwordField().sendKeys(prop.getProperty("password"));
	 
	 loginpage.loginButton().click();
	 log.debug("clicked on login button");
	 
	 AccountPage accountpage = new AccountPage(driver);
	 
	 String actualResult = null;
	 
	 
	 try{
		 if(accountpage.editAccountInformationOption().isDisplayed()) {
			 actualResult = "Successfull";
			 log.info("edit acc option displayed successfully");
		
		 }
	 }catch(Exception e ) {
		
		 actualResult = "Failure";
		 log.error("link not displayed");
	 
	 }
	 
	 AssertJUnit.assertEquals(actualResult, expectedResult);
	 
	 log.info("login test passed");

}
	
	
	@BeforeMethod
	public void openApplication() throws IOException {
		 log = LogManager.getLogger(LoginTest.class.getName());
		driver = initializeDriver();
		log.debug("Browser Launched");
		 driver.get(prop.getProperty("url"));	
		 log.debug("navigated to application url");
	}
	@AfterMethod
	
	public void closure() {
		driver.close();
		log.debug("browser closed");
	}
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data = {{"garimabihariya@gmail.com","Garima@0786", "Successfull"}};
		
		//,{"dummy@gmail.com","gargee@0786","Failure"}};
		return data;
		
	}
	
}
