package pagObjects;

import globals.Globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageobjects extends Globals {
							
	public LoginPageobjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}					
	//Define the page Objects
	
	@FindBy(xpath="//*[@id='InputBoxpincode']")
	public WebElement pncode;
	
	@FindBy(xpath="//*[@id='content']/div[3]/div[2]/div[4]/div/div[2]/button")
	public WebElement checkbtn;
	
	@FindBy(xpath =".//span[@class='user-icon-inner']")
	public WebElement loginIcon; 

	@FindBy(xpath ="//*[@id='mini-cart-header']/span[1]")
	public WebElement loginButton;
	
	@FindBy(xpath ="//*[@id='loginInput']")
	public WebElement loginInputId;
	
	@FindBy(xpath ="//*[@id='signPassword']")
	public WebElement loginInputPassword;
	
	@FindBy(xpath ="//*[@id='stepOneSubmit']")
	public WebElement signInButton;
	
	@FindBy(xpath ="//li[@class='signout-afterlogin']//a[contains(@class,'sel-logout')][contains(text(),'Sign Out')]")
	public WebElement signOutButton;
	
	
	@FindBy(xpath ="//*[@id='form-account-create-t']/div/p")
	public WebElement errorMsg;
	
	@FindBy(xpath ="//button[@type='button'][contains(text(),'Sign in with Gplus')]")
	public WebElement signinGooglePlus;
	
	
	@FindBy(xpath ="//input[@id='identifierId']")
	public WebElement emailAndPhoneSignin;
	
	
	@FindBy(xpath ="//span[@class='RveJvd snByac'][contains(text(),'Next')]")
	public WebElement nextButtonSignin;
	
	@FindBy(xpath ="//div[@id='password']//div[@class='aCsJod oJeWuf']//div[@class='aXBtI Wic03c']//div[@class='Xb9hP']//input[@class='whsOnd zHQkBf']")
	public WebElement passwordSignin;
	
	@FindBy(xpath ="//span[contains(text(),'Next')]")
	public WebElement gmailSigninButton;
	

	@FindBy(xpath ="//button[@type='button'][contains(text(),'Sign in with Facebook')]")
	public WebElement signinFacebook;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
	public WebElement facebookEmailAndPhone;
	
	@FindBy(xpath ="//input[@id='pass']")
	public WebElement facebookPassword;
	
	@FindBy(xpath ="//button[@id='loginbutton']")
	public WebElement facebookLoginButton;
	
	@FindBy(xpath ="//*[@id=\"js_0\"]/div/div/div[2]/div/div/a")
	public WebElement facebookSignOutButton;
	
}