package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataUtilities.Excelutility;
import globals.CommonMethods;
import globals.Globals;
import pagObjects.AddToCartObjects;
import pagObjects.LoginPageobjects;
import pagObjects.OrderObjects;

public class TestPlaceOrder extends Globals{
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
	}	
	
@Test(priority = 0)
	
	public void OrderPlace() throws Exception {
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AddToCartObjects addcart = new AddToCartObjects(driver);
		TestAddCart cart = new TestAddCart();
		OrderObjects order = new OrderObjects(driver);
		CommonMethods.loginViaEmail();	
		addcart.cartIcon_PDP.click();
		Thread.sleep(3000);		
		addcart.removeFromMiniCartSymbol.click();
		addcart.removeFromMiniCartButton.click();	
		cart.AddToCart();		
		lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));	
		Thread.sleep(2000);
		lgin.checkbtn.click();
		Thread.sleep(2000);
		order.proceedToCheckout.click();
		Thread.sleep(2000);
		order.proceedToReviewOrder.click();
		Thread.sleep(2000);
		order.proceedToPaymentOrder.click();
		Thread.sleep(2000);
		order.netBanking.click();
		Thread.sleep(3000);
		order.iciciBank.click();
		Thread.sleep(3000);
		order.completePayment.click();
		
		/*// Store all the elements of the same category in the list of WebLements.
				List<WebElement> list = driver.findElements(By.xpath("//*[@id='payment-form']/div[1]/div/div[1]/div[4]/div/div[1]/div/ul/li[1]/div"));

				// Create a boolean variable to store true/false.
				Boolean is_selected = list.get(0).isSelected();

				// If 'is_selected' is true that means the first radio button is
				// selected.
				if (is_selected == true) {

					// If the first radio button is selected by default then,
					// select the second radio button.
					list.get(1).click();

				} else {

					// If the first radio button is not selected then, click the first
					// radio button.
					list.get(0).click();
				}*/
			}	

//Checkout LogIn
@Test(priority = 1)

public void OrderPlaceCheckout() throws Exception {
	LoginPageobjects lgin = new LoginPageobjects(driver);
	AddToCartObjects addcart = new AddToCartObjects(driver);
	TestAddCart cart = new TestAddCart();
	OrderObjects order = new OrderObjects(driver);
	/*CommonMethods.loginViaEmail();	
	addcart.cartIcon_PDP.click();
	Thread.sleep(3000);		
	addcart.removeFromMiniCartSymbol.click();
	addcart.removeFromMiniCartButton.click();	*/
	cart.AddToCart();		
	lgin.pncode.sendKeys(Excelutility.excelData(2, 2, 0));	
	Thread.sleep(2000);
	lgin.checkbtn.click();
	Thread.sleep(2000);
	order.proceedToCheckout.click();
	Thread.sleep(2000);
	log(Excelutility.excelData(2, 0, 0));
	lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
	log(Excelutility.excelData(2, 1, 0));
	lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
	Thread.sleep(1000);
	lgin.signInButton.click();
	Thread.sleep(1000);
	order.proceedToReviewOrder.click();
	Thread.sleep(2000);
	order.proceedToPaymentOrder.click();
	Thread.sleep(2000);
	order.netBanking.click();
	Thread.sleep(5000);
	order.iciciBank.click();
	Thread.sleep(3000);
	order.completePayment.click();
	
	/*// Store all the elements of the same category in the list of WebLements.
			List<WebElement> list = driver.findElements(By.xpath("//*[@id='payment-form']/div[1]/div/div[1]/div[4]/div/div[1]/div/ul/li[1]/div"));

			// Create a boolean variable to store true/false.
			Boolean is_selected = list.get(0).isSelected();

			// If 'is_selected' is true that means the first radio button is
			// selected.
			if (is_selected == true) {

				// If the first radio button is selected by default then,
				// select the second radio button.
				list.get(1).click();

			} else {

				// If the first radio button is not selected then, click the first
				// radio button.
				list.get(0).click();
			}*/
		}

}
