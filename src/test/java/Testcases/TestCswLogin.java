package Testcases;

import globals.Constants;
import globals.Globals;
import org.testng.ITestResult;
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
		Thread.sleep(10000);
		lgin.loginIcon.click();
		lgin.loginButton.click();
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Thread.sleep(1000);
		lgin.signInButton.click();
		Thread.sleep(1000);
		lgin.loginIcon.click();
		Thread.sleep(2000);
		lgin.signOutButton.click();
		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
	// captureScreen();

	}

	// Test case for Login with Valid credentials
	@Test(priority = 1)
	public void coverStoryPhoneLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		Thread.sleep(10000);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		lgin.loginButton.click();
		log(Excelutility.excelData(3, 0, 0));
		Thread.sleep(1000);
		lgin.loginInputId.sendKeys(Excelutility.excelData(3, 0, 0));
		Thread.sleep(1000);
		log(Excelutility.excelData(3, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(3, 1, 0));
		Thread.sleep(1000);
		lgin.signInButton.click();
		Thread.sleep(5000);
		lgin.loginIcon.click();
		Thread.sleep(2000);
		lgin.signOutButton.click();
		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();

	}

	// Test case for Login with Valid credentials for google+
	@Test(priority = 2)
	public void coverStorygoogleplusLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		Thread.sleep(10000);
		// moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();
		lgin.loginButton.click();
		Thread.sleep(5000);
		lgin.signinGooglePlus.click();
		Thread.sleep(5000);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(4, 0, 0));
		lgin.emailAndPhoneSignin.sendKeys(Excelutility.excelData(4, 0, 0));
		lgin.nextButtonSignin.click();
		Thread.sleep(3000);
		log(Excelutility.excelData(4, 1, 0));
		lgin.passwordSignin.sendKeys(Excelutility.excelData(4, 1, 0));
		Thread.sleep(5000);
		lgin.gmailSigninButton.click();		
		Thread.sleep(5000);
		switchToPreviousTabOrWindow();	
		Thread.sleep(5000);
		lgin.loginIcon.click();
		Thread.sleep(2000);
		lgin.signOutButton.click();
		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));
		// captureScreen();
	}

	// Test case for Login with Valid credentials for google+
	@Test(priority = 3)
	public void coverStoryFacebookLogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);

		Thread.sleep(10000);

		moveToElement(lgin.loginIcon);
		lgin.loginIcon.click();

		lgin.loginButton.click();
		Thread.sleep(5000);

		lgin.signinFacebook.click();
		Thread.sleep(15000);
		switchToLatestTabOrWindow();
		log(Excelutility.excelData(5, 0, 0));

		lgin.facebookEmailAndPhone.sendKeys(Excelutility.excelData(5, 0, 0));
		//Thread.sleep(5000);
		log(Excelutility.excelData(5, 1, 0));
		lgin.facebookPassword.sendKeys(Excelutility.excelData(5, 1, 0));

		//Thread.sleep(1000);

		lgin.facebookLoginButton.click();

		Thread.sleep(1000);

		//lgin.loginIcon.click();

		//Thread.sleep(2000);

		lgin.facebookSignOutButton.click();
		
       switchToPreviousTabOrWindow();
		
		Thread.sleep(5000);

		lgin.loginIcon.click();

		Thread.sleep(2000);

		lgin.signOutButton.click();

		// assertEquals(lgin.userName.getText(),Excelutility.excelData(2, 0, 0));

		// captureScreen();

	}

	// Closing the Browser
	@AfterTest
	public void testIT(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			captureScreen();
		}

		browserClose();
	}

}