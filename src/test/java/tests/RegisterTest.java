package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.RegisterAccountPage;
import pageobjects.RegisterPage;
import resources.Base;

public class RegisterTest extends Base {
	public WebDriver driver;
	
@Test
	
	public void RegisterUser() throws  IOException, InterruptedException  {
		 RegisterPage registerpage = new RegisterPage(driver);
		 
		 registerpage.myAccountDropdown().click();
		 registerpage.RegisterLink().click();
		 Thread.sleep(5000);
		 
		 RegisterAccountPage registerAccountPage = new RegisterAccountPage(driver);

		 registerAccountPage.FirstNameField().sendKeys("Garima");
		 registerAccountPage.LastNameField().sendKeys("Bihariya");
		 registerAccountPage.EmailField().sendKeys("garimabihariya123@gmail.com");
		 registerAccountPage.TelephoneNoField().sendKeys("7987909158");
		 registerAccountPage.PasswordField().sendKeys("Garima@0786");
		 registerAccountPage.ConfirmPasswordField().sendKeys("Garima@0786");
		 registerAccountPage.CheckBOX().click();
		 registerAccountPage.ConfirmButton().click();
		 Thread.sleep(5000);
		 
		 
	
}
	
	@BeforeMethod
	public void openApplication() throws IOException {
		driver = initializeDriver();
		 driver.get(prop.getProperty("url"));	
	}
	@AfterMethod
	
	public void closure() {
		driver.close();
	}
}
