package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import globals.Globals;
import pagObjects.SearchPage;

public class TestSearch extends Globals{
	
	public class TestAccount extends Globals {
		@BeforeTest
		public void launchUrl() throws Exception {
			System.setProperty("browser", "Chrome");
			setUp();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			browserNav(QA_CoverStoryURL);
		}
	
	//Search page
		@Test(priority = 0)

		public void MyAccountInfo() throws Exception {
			SearchPage search = new SearchPage(driver);
			//Login with email
					//CommonMethods.loginViaEmail();	
					Thread.sleep(1000);
					moveToElement(search.searchIcon);
					search.searchBox.click();
					search.searchBox.sendKeys("shorts");
					search.searchButton.click();
					String msg=search.searchResult.getText();
					System.out.println(msg);
					String msg2= "Search results 'shorts' ";
					System.out.println(msg2);
					//Assert.assertEquals(msg.compareToIgnoreCase(msg2));
					//Assert.assertEquals(msg.equalsIgnoreCase("SEARCH RESULTS 'SHORTS'") );
					//Assert.assertTrue(msg.equalsIgnoreCase(msg2));
				//Assert.assertEquals("SEARCH RESULTS 'SHORTS'", msg );
					//Assert.assertTrue(msg.equalsIgnoreCase(msg2));
					/*
					  if ( msg.equalsIgnoreCase(msg2) )
					   {
					          System.out.println("search Result pass");
					   } else {
						   System.out.println("search Result fail ");				
						   }	*/				
					
}
}}