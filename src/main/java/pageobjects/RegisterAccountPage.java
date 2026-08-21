package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {
  WebDriver driver;
 public  RegisterAccountPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath = "//input[@id='input-firstname']")
 WebElement firstNameField;
 
 @FindBy(xpath = "//input[@name='lastname']")
 WebElement lastNameField;
 
 @FindBy(xpath = "//input[@name='email']")
 WebElement emailField;
 
 @FindBy(xpath = "//input[@name='telephone']")
 WebElement telephoneNoField;
 
 @FindBy(xpath="//input[@name='password']")
 WebElement passwordField;
 
 @FindBy(xpath="//input[@name='confirm']")
 WebElement confirmPasswordField;
 
 @FindBy(xpath="//input[@name='agree']")
 WebElement checkBox;
 
 @FindBy(xpath="//input[@class='btn btn-primary']")
 WebElement confirmButton;
 
 @FindBy(xpath="//a[text()='Success']")
 WebElement regSuccessfull;
 
 
 public WebElement FirstNameField() {
	 return firstNameField;
	 
 }
 
 public WebElement LastNameField() {
	 return lastNameField;
	 
 }
 
 public WebElement EmailField() {
	 return emailField;
	 
 }
 
 public WebElement TelephoneNoField() {
	 return telephoneNoField;
	 
 }
 
 public WebElement PasswordField() {
	 return passwordField;
	 
 }
 
 public WebElement ConfirmPasswordField() {
	 return confirmPasswordField;
	 
 }
 
 public WebElement CheckBOX() {
	 return checkBox;
	 
 }
 
 
 public WebElement ConfirmButton() {
	 return confirmButton;
	 
 }
 public WebElement RegSuccessFull() {
	 return regSuccessfull;
	 
 }
}
