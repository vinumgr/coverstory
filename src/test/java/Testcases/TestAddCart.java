package Testcases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import globals.CommonMethods;
import globals.Globals;
import pagObjects.AddToCartObjects;
import pagObjects.QuickViewObjects;

public class TestAddCart extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
	}	
	//Add to cart and remove from minicart
	@Test(priority = 0)
	
	public void RemoveFromMinicart() throws Exception {
		AddToCartObjects addcart = new AddToCartObjects(driver);
		CommonMethods.loginViaEmail();	
		moveToElement(addcart.clothing);
		Thread.sleep(2000);
		addcart.dressAndJumpsuits.click();
		addcart.jumpsuits.click();
		scrollBottom();
		Thread.sleep(3000);
		addcart.PLPTwo.click();
		
		if (addcart.selectSizeXS.isEnabled()) {
			addcart.selectSizeXS.click();
		    System.out.println("Extra Small size is selected");
		    
		} else if (addcart.selectSizeS.isEnabled()) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");
			
		} else if (addcart.selectSizeM.isEnabled()) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");
			
		} else if (addcart.selectSizeL.isEnabled()) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");
			
		} else {
			System.out.println("Product is Out of stock");
			
		}	
		Thread.sleep(3000);
		addcart.addTocartButton.click();
		Thread.sleep(3000);
		addcart.cartIcon_PDP.click();
		Thread.sleep(3000);		
		addcart.removeFromMiniCartSymbol.click();
		addcart.removeFromMiniCartButton.click();	
	}
	
	//Add to cart and Remove from main cart
	@Test(priority = 1)

		public void RemoveFromCart() throws Exception {
			AddToCartObjects addcart = new AddToCartObjects(driver);
			moveToElement(addcart.clothing);
			Thread.sleep(2000);
			addcart.dressAndJumpsuits.click();
			addcart.jumpsuits.click();
			scrollBottom();
			Thread.sleep(6000);
			addcart.PLPTwo.click();	
		if (addcart.selectSizeXS.isEnabled()) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		} else if (addcart.selectSizeS.isEnabled()) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");
			
		} else if (addcart.selectSizeM.isEnabled()) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");
			
		} else if (addcart.selectSizeL.isEnabled()) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");
			
		} else {
			System.out.println("Product is Out of stock");
			
		}
		Thread.sleep(3000);
		addcart.addTocartButton.click();
		Thread.sleep(3000);
		addcart.cartIcon_PDP.click();
		Thread.sleep(3000);		
		addcart.viewCartButton_PDP.click();
		addcart.removeFromCartSymbol.click();
		addcart.removeFromCartButton.click();
	}
	//Add to cart
	@Test(priority = 2)

	public void AddToCart() throws Exception {
		AddToCartObjects addcart = new AddToCartObjects(driver);
		Thread.sleep(3000);
		moveToElement(addcart.clothing);
		Thread.sleep(2000);
		addcart.dressAndJumpsuits.click();
		addcart.jumpsuits.click();
		scrollBottom();
		Thread.sleep(6000);
		addcart.PLPTwo.click();
		Thread.sleep(6000);
	
	if (addcart.selectSizeXS.isEnabled()) {
		addcart.selectSizeXS.click();
		System.out.println("Extra Small size is selected");

	} else if (addcart.selectSizeS.isEnabled()) {
		addcart.selectSizeS.click();
		System.out.println("Small size is selected");
		
	} else if (addcart.selectSizeM.isEnabled()) {
		addcart.selectSizeM.click();
		System.out.println("Medium size is selected");
		
	} else if (addcart.selectSizeL.isEnabled()) {
		addcart.selectSizeL.click();
		System.out.println("Large size is selected");
		
	} else {
		System.out.println("Product is Out of stock");
		
	}
	Thread.sleep(3000);
	addcart.addTocartButton.click();
	Thread.sleep(6000);
	addcart.cartIcon_PDP.click();
	Thread.sleep(3000);	
	addcart.viewCartButton_PDP.click();
	//captureScreen();	
	}
	// Quick view Add to cart
	@Test(priority = 3)

	public void AddToCartQuickview() throws Exception {
		AddToCartObjects addcart = new AddToCartObjects(driver);
		QuickViewObjects quickview = new QuickViewObjects(driver);
		moveToElement(addcart.clothing);
		Thread.sleep(2000);
		addcart.topsAnTees.click();
		Thread.sleep(1000);
		moveToElement(quickview.quickviewPLP);
		Thread.sleep(3000);
		quickview.quickviewIcon.click();	
		Thread.sleep(5000);
		if (addcart.selectSizeXS.isEnabled()) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		} else if (addcart.selectSizeS.isEnabled()) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");
			
		} else if (addcart.selectSizeM.isEnabled()) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");
			
		} else if (addcart.selectSizeL.isEnabled()) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");
			
		} else {
			System.out.println("Product is Out of stock");
			
		}
		Thread.sleep(3000);
		quickview.quickviewAddToCart.click();
		//quickview.quickviewclose.click();		
		//View Cart
	/*	addcart.cartIcon_PDP.click();
		Thread.sleep(3000);		
		addcart.viewCartButton_PDP.click();
		//captureScreen();
*/			
		
}
	 @AfterTest
	  public void closeBrowser() {	  
	  	browserClose();
	}
	
}