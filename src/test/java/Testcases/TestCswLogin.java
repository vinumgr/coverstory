package Testcases;

import globals.Constants;
import globals.Globals;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataUtilities.Excelutility;
import pagObjects.LoginPageobjects;

public class TestCswLogin extends Globals {

	// Launch the Browser
	@BeforeTest
	public void url_launch() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		browserNav(QA_CoverStoryURL);

	}

	// Test case for Login with Valid credentials

	@Test(priority = 0)
	public void coverStoryEmailLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Email :Login button clicked", true);
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		Reporter.log("Email :Email entered", true);
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Reporter.log("Email :Password entered", true);
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		Reporter.log("Email :SignIn using email number is successful", true);
		Thread.sleep(1000);
		//WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Email :Login Icon clicked", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 20, "Xpath", Constants.signOutButton);
		lgin.signOutButton.click();
		Reporter.log("Email :signout using Email number is successful", true);
		//assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		//Reporter.log("Search result for jeans success with login", true);
	// captureScreen();

	}

	// Test case for Login with Valid credentials
	@Test(priority = 1)
	public void coverStoryPhoneLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Phone : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Phone :Login button clicked", true);
		log(Excelutility.excelData(3, 0, 0));
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginInputId);
		lgin.loginInputId.sendKeys(Excelutility.excelData(3, 0, 0));
		Reporter.log("Phone Number Login: Phone number entered", true);
		Thread.sleep(1000);
		log(Excelutility.excelData(3, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(3, 1, 0));
		Reporter.log("Phone Number Login :Password entered", true);
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		Reporter.log("Phone :Login using phone number is successful", true);
		Thread.sleep(5000);
		//WebDriverExplicitWait(driver, 5, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Phone :Login Icon clicked", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
		lgin.signOutButton.click();
		Reporter.log("Phone :signout using phone number is successful", true);
		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();

	}

	// Test case for Login with Valid credentials for google+
	@Test(priority = 2)
	public void coverStorygoogleplusLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("GooglePlus : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("GooglePlus :Login button clicked", true);
		//Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signinGooglePlus);
		lgin.signinGooglePlus.click();
		Reporter.log("GooglePlus :signinGooglePlus button clicked", true);
		Thread.sleep(5000);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(4, 0, 0));
		lgin.emailAndPhoneSignin.sendKeys(Excelutility.excelData(4, 0, 0));
		Reporter.log("GooglePlus :emailAndPhoneSignin button clicked", true);
		lgin.nextButtonSignin.click();
		Reporter.log("GooglePlus :nextButtonSignin button clicked", true);
		Thread.sleep(3000);
		log(Excelutility.excelData(4, 1, 0));
		lgin.passwordSignin.sendKeys(Excelutility.excelData(4, 1, 0));
		//Thread.sleep(5000);
		lgin.gmailSigninButton.click();		
		Reporter.log("GooglePlus :gmailSigninButton button clicked", true);
		Thread.sleep(5000);
		switchToPreviousTabOrWindow();	
		//Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("GooglePlus :loginIcon button clicked", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
		lgin.signOutButton.click();
		Reporter.log("GooglePlus :signOutButton button clicked", true);
		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();
	}

	// Test case for Login with Valid credentials for google+
	@Test(priority = 3)
	public void coverStoryFacebookLogin() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Facebook : Login Icon clicked", true);
		lgin.loginButton.click();
		Reporter.log("Facebook : Login button clicked", true);
		//Thread.sleep(5000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signinFacebook);
		lgin.signinFacebook.click();
		Reporter.log("Facebook : signinFacebook button clicked", true);
		Thread.sleep(15000);
		//WebDriverExplicitWait(driver, 10, "Xpath", Constants.facebookEmailAndPhone);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(5, 0, 0));
		lgin.facebookEmailAndPhone.sendKeys(Excelutility.excelData(5, 0, 0));
		//Thread.sleep(5000);
		log(Excelutility.excelData(5, 1, 0));
		lgin.facebookPassword.sendKeys(Excelutility.excelData(5, 1, 0));
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.facebookLoginButton);
		lgin.facebookLoginButton.click();
		Reporter.log("Facebook : facebookLoginButton button clicked", true);
		/*//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("loginIcon button clicked", true);
		//Thread.sleep(2000);
		lgin.facebookSignOutButton.click();
		*/
       switchToPreviousTabOrWindow();
		//Thread.sleep(5000);
       WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		Reporter.log("Facebook :loginIcon button clicked", true);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
		lgin.signOutButton.click();
		Reporter.log("Facebook :signOutButton button clicked", true);

		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();

	}

	// Closing the Browser:
	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}	