package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import DataUtilities.Excelutility;
import globals.CommonMethods;
import globals.Globals;
import pagObjects.AccountPage;
import pagObjects.LoginPageobjects;


public class TestAccount extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
	}
	
	//Account Info updating : First Name And Last Name
	@Test(priority = 0)

	public void MyAccountInfo() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);
		//Login with email
				CommonMethods.loginViaEmail();	
				Thread.sleep(10000);
				lgin.loginIcon.click();
				Thread.sleep(2000);
				account.MyAccount.click();
				Thread.sleep(3000);
				account.editProfileButton.click();
				//account.firstNameBox.sendKeys(Excelutility.excelData(6, 0, 0));
				//account.lastNameBox.sendKeys(Excelutility.excelData(6, 1, 0));
				account.saveProfileButton.click();
	}
//Account Info updating :Changing password
	@Test(priority = 1)

	public void MyAccountChangePassword() throws Exception {
		AccountPage account = new AccountPage(driver);
			account.changeAccountPasswordButton.click();
			account.newPasswordBox.sendKeys(Excelutility.excelData(2, 1, 0));
			account.confirmPasswordBox.sendKeys(Excelutility.excelData(2, 1, 0));
			account.savePasswordButton.click();
				
	}
	//Account Info updating :My order page
		@Test(priority = 2)

		public void MyAccountOrderPage() throws Exception {
			AccountPage account = new AccountPage(driver);
				account.myOrder.click();						
		}
		//Account Info updating :Save Address Page
				@Test(priority = 3)

				public void MyAccountSaveAddressPage() throws Exception {
					AccountPage account = new AccountPage(driver);
					
						account.mySavedAddress.click();
						account.openAddNewAddress.click();
						account.firstNameAddNewAddress.sendKeys(Excelutility.excelData(7, 0, 0));
						account.LastNameAddNewAddress.sendKeys(Excelutility.excelData(7, 1, 0));
						account.pincodeAddNewAddress.sendKeys(Excelutility.excelData(2, 2, 0));
						account.address1AddNewAddress.sendKeys(Excelutility.excelData(7, 1, 0));
						account.phoneAddNewAddress.sendKeys(Excelutility.excelData(3, 0, 0));
						account.saveAddressInAddNewAddress.click();
						Thread.sleep(5000);
						account.deleteAddress.click();
						account.deleteAddressconfirm.click();
				}
				//Account Info updating :SignOut Page
				@Test(priority = 4)

				public void MyAccountSignOutPage() throws Exception {
					AccountPage account = new AccountPage(driver);
					Thread.sleep(5000);
						account.signOut.click();
						Thread.sleep(5000);
						account.keepMeSignedIn.click();
						Thread.sleep(5000);
						account.signOut.click();
						Thread.sleep(5000);
						account.keepMeSignedOut.click();
				}
				
				// Closing the Browser
				@AfterTest
				public void closeBrowser() {
					browserClose();
				}

	}	