package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globals.CommonMethods;
import globals.Globals;
import pagObjects.AccountPage;
import pagObjects.LoginPageobjects;
import pagObjects.SearchPage;

public class TestBannerClick extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
	}
	
	
	//Banner click in home page
		@Test(priority = 0)

		public void Banner() throws Exception {
			LoginPageobjects lgin = new LoginPageobjects(driver);
			AccountPage account = new AccountPage(driver);
			SearchPage search = new SearchPage(driver);
			//Login with email
					//CommonMethods.loginViaEmail();	
					//Thread.sleep(10000);
					search.bannerSlider.click();
					search.bannerOne.click();
		}
}