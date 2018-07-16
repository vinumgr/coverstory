package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import org.apache.maven.plugin.logging.Log;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globals.CommonMethods;
import globals.Globals;
import pagObjects.SearchPage;

public class TestSearch extends Globals{
	
	public class TestAccount extends Globals {
		@BeforeTest
		public void launchUrl() throws Exception {
			System.setProperty("browser", "Chrome");
			setUp();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			browserNav(QA_CoverStoryURL);
		}
	
	//Search page
		@Test(priority = 0)

		public void searchWithLogin() throws Exception {
			SearchPage search = new SearchPage(driver);
			//Login with email
					CommonMethods.loginViaEmail();	
					Thread.sleep(1000);
					moveToElement(search.searchIcon);
					search.searchBox.click();
					search.searchBox.sendKeys("shorts");
					search.searchButton.click();
					assertTrue("Search results 'shorts' ".trim().equalsIgnoreCase(search.searchResult.getText()));
					Reporter.log("Search result for shorts success with login", true);
					moveToElement(search.searchIcon);
					search.searchBox.clear();
					search.searchBox.sendKeys("jeans");
					search.searchButton.click();
					assertTrue("Search results 'jeans' ".trim().equalsIgnoreCase(search.searchResultTwo.getText()));
					Reporter.log("Search result for jeans success with login", true);
}
		//Search page
				@Test(priority = 1)

				public void searchWithoutLogin() throws Exception {
					SearchPage search = new SearchPage(driver);
						
							Thread.sleep(1000);
							moveToElement(search.searchIcon);
							search.searchBox.click();
							search.searchBox.sendKeys("shorts");
							search.searchButton.click();
							assertTrue("Search results 'shorts' ".trim().equalsIgnoreCase(search.searchResult.getText()),"Text doesnt match");
							Reporter.log("Search result for shorts success witout login", true);
						
							moveToElement(search.searchIcon);
							search.searchBox.clear();
							search.searchBox.sendKeys("jeans");
							search.searchButton.click();
							assertTrue("Search results 'jeans' ".trim().equalsIgnoreCase(search.searchResultTwo.getText()),"Text doesnt match");
							Reporter.log("Search result for jeans success without login", true);
							
		}
				
				@AfterTest
				public void closeBrowser() {
					browserClose();
				}

}}