package pagObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globals.Globals;

public class RegistrationPageObjects extends Globals {

	public RegistrationPageObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	//Define the page Objects
	@FindBy(xpath=".//*[@id='pincode_check']")
	public WebElement pncode;
	
	@FindBy(id="pincodeSubmit")
	public WebElement checkbtn;
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[5]/a/span")
	public WebElement loginIcon;
	
	@FindBy(xpath =".//*[@id='mini-cart-header']/a[4]/span")
	public WebElement signupbtn;
	
	@FindBy(id="RegistrationForm_email")
	public WebElement emailid;
	
	@FindBy(id="RegistrationForm_first_name")
	public WebElement firstName;
	
	@FindBy(id="RegistrationForm_last_name")
	public WebElement lastName;
	
	@FindBy(id="RegistrationForm_password")
	public WebElement passwrd;
	
	@FindBy(id="RegistrationForm_password2")
	public WebElement cfmpwd;
	
	@FindBy(id="contact_number")
	public WebElement cntnumbr;
	
	@FindBy(xpath =".//*[@id='subscription_label']/div/div")
	public WebElement checkboxbtn;
	
	@FindBy(id="otp_generation")
	public WebElement otpGeneration;
	
}