package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import DataUtilities.Excelutility;
import globals.CommonMethods;
import globals.Constants;
import globals.Globals;
import pagObjects.AddToCartObjects;
import pagObjects.AddToWishlist_PO;
import pagObjects.LoginPageobjects;
import pagObjects.QuickViewObjects;

public class TestAddWishlist extends Globals{
	@BeforeTest
	public void launchURL() throws Exception{
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
		//browserNav(QA_FutureGroup_UserName);
		//browserNav(QA_FutureGroup_Password);
	
	}
	//Add to wishlist from PLP
@Test(priority = 0)
	
	public void AddToWishlistQuickview() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AddToCartObjects addcart = new AddToCartObjects(driver);
		AddToWishlist_PO addwishlist = new AddToWishlist_PO(driver);
		QuickViewObjects quickview = new QuickViewObjects(driver);
		moveToElement(addcart.clothing);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
		addcart.dressAndJumpsuits.click();	
		addcart.maxi.click();		
		moveToElement(quickview.quickviewPLP);
		quickview.quickviewIcon.click();		
		quickview.quickAddToWishlist.click();
		Reporter.log("Item added to wishlist from quickview",true);
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		Reporter.log("Login successful",true);
		Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.quickviewclose);
		quickview.quickviewclose.click();
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
		lgin.loginIcon.click();
		//Thread.sleep(10000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.wishlistInAccount);
		addwishlist.wishlistInAccount.click();
		Reporter.log("Wishlist section viewed successful",true);
		//Login with email
		/*CommonMethods.loginViaEmail();		
		moveToElement(addcart.clothing);
		Thread.sleep(2000);
		addcart.dressAndJumpsuits.click();	
		addcart.maxi.click();		
		moveToElement(quickview.quickviewPLP);
		quickview.quickviewIcon.click();		
		quickview.quickAddToWishlist.click();
		quickview.quickviewclose.click();
		Thread.sleep(10000);
		lgin.loginIcon.click();
		Thread.sleep(10000);
		addwishlist.wishlistInAccount.click();
		Thread.sleep(10000);
		lgin.loginIcon.click();
		Thread.sleep(6000);
		lgin.signOutButton.click();*/
}

@Test(priority = 1)

public void AddToWishlistQuickviewLogin() throws Exception {
	LoginPageobjects lgin = new LoginPageobjects(driver);
	AddToCartObjects addcart = new AddToCartObjects(driver);
	AddToWishlist_PO addwishlist = new AddToWishlist_PO(driver);
	QuickViewObjects quickview = new QuickViewObjects(driver);
	//Login with email
			//CommonMethods.loginViaEmail();
			//Reporter.log("Login successful",true);
			Thread.sleep(3000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.clothing);
			moveToElement(addcart.clothing);
			Thread.sleep(5000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
			addcart.dressAndJumpsuits.click();	
			addcart.maxi.click();		
			moveToElement(quickview.quickviewPLP);
			Reporter.log("Quickview window opened successful",true);
			quickview.quickviewIcon.click();		
			quickview.quickAddToWishlist.click();
			Reporter.log("Item added to cart successful",true);
			quickview.quickviewclose.click();
			Thread.sleep(10000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
			lgin.loginIcon.click();
			Thread.sleep(10000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.wishlistInAccount);
			addwishlist.wishlistInAccount.click();
			Reporter.log("Wishlist section opened successful",true);
			Thread.sleep(10000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
			lgin.loginIcon.click();
			Thread.sleep(5000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
			lgin.signOutButton.click();
			Reporter.log("Signout successful",true);

}

@Test(priority = 2)

public void AddToWishlistPLP() throws Exception {
	LoginPageobjects lgin = new LoginPageobjects(driver);
	AddToCartObjects addcart = new AddToCartObjects(driver);
	AddToWishlist_PO addwishlist = new AddToWishlist_PO(driver);
	QuickViewObjects quickview = new QuickViewObjects(driver);
	CommonMethods.loginViaEmail();	
	Reporter.log("Login successful",true);
	moveToElement(addcart.clothing);;
	//Thread.sleep(3000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.clothing);
	moveToElement(addcart.clothing);
	//Thread.sleep(5000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
	addcart.dressAndJumpsuits.click();
	moveToElement(quickview.quickviewPLP);
	addwishlist.wishlistIconPLP.click();
	Thread.sleep(1000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
	lgin.loginIcon.click();
	Thread.sleep(10000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.wishlistInAccount);
	addwishlist.wishlistInAccount.click();
	Thread.sleep(10000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
	lgin.loginIcon.click();
	Thread.sleep(2000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
	lgin.signOutButton.click();
}


//PDP 
@Test(priority = 3)

public void AddToWishlistPDP() throws Exception {
	LoginPageobjects lgin = new LoginPageobjects(driver);
	AddToCartObjects addcart = new AddToCartObjects(driver);
	AddToWishlist_PO addwishlist = new AddToWishlist_PO(driver);
	CommonMethods.loginViaEmail();	
	Thread.sleep(2000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.clothing);
	moveToElement(addcart.clothing);
	Thread.sleep(2000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
	addcart.dressAndJumpsuits.click();
	//moveToElement(quickview.quickviewPLP);
	addcart.maxi.click();
	Thread.sleep(6000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.PLP);
	addcart.PLP.click();
	addwishlist.wishlistIconSignInPDP.click();
	//Thread.sleep(1000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
	lgin.loginIcon.click();
	Thread.sleep(10000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.wishlistInAccount);
	addwishlist.wishlistInAccount.click();
	Thread.sleep(10000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
	lgin.loginIcon.click();
	Thread.sleep(2000);
	WebDriverExplicitWait(driver, 10, "Xpath", Constants.signOutButton);
	lgin.signOutButton.click();
}	

/*@AfterTest
public void closeBrowser() {

	browserClose();
}*/
}
	