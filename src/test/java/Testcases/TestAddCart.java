package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import globals.CommonMethods;
import globals.Constants;
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

	
	//Remove from minicart
	
	@Test(priority = 0)

	public void RemoveFromMinicart() throws Exception {
		boolean outOfStock = false;
		AddToCartObjects addcart = new AddToCartObjects(driver);
		moveToElement(addcart.clothing);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
		addcart.dressAndJumpsuits.click();
		addcart.jumpsuits.click();
		//scrollBottom();
		//Thread.sleep(6000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.PLPTwo);
		addcart.PLPTwo.click();
		if (!elementHasClass(addcart.selectSizeXS, "disabled")) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		}else if (!elementHasClass(addcart.selectSizeS, "disabled")) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");

		} else if (!elementHasClass(addcart.selectSizeM, "disabled")) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");

		} else if (!elementHasClass(addcart.selectSizeL, "disabled")) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");

		} else {
			System.out.println("Product is Out of stock");
			outOfStock = true;
		}
		if (!outOfStock) {
			//Thread.sleep(3000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.addTocartButton);
			addcart.addTocartButton.click();
			Reporter.log("Item added from mini cart successfully",true);
			Thread.sleep(3000);
			//WebDriverExplicitWait(driver, 10, "Xpath", Constants.cartIcon_PDP);
			addcart.cartIcon_PDP.click();
			Thread.sleep(3000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.removeFromMiniCartSymbol);
			addcart.removeFromMiniCartSymbol.click();
			addcart.removeFromMiniCartButton.click();
			Reporter.log("Item removed from mini cart successfully",true);
		}
		
	}
	
	// Add to cart and Remove from main cart
	@Test(priority = 1)

	public void RemoveFromCart() throws Exception {
		AddToCartObjects addcart = new AddToCartObjects(driver);
		boolean outOfStock = false;
		moveToElement(addcart.clothing);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
		addcart.dressAndJumpsuits.click();
		addcart.jumpsuits.click();
		//scrollBottom();
		//Thread.sleep(6000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.PLPTwo);
		addcart.PLPTwo.click();
		if (!elementHasClass(addcart.selectSizeXS, "disabled")) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		}else if (!elementHasClass(addcart.selectSizeS, "disabled")) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");

		} else if (!elementHasClass(addcart.selectSizeM, "disabled")) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");

		} else if (!elementHasClass(addcart.selectSizeL, "disabled")) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");

		} else {
			System.out.println("Product is Out of stock");
			outOfStock = true;
		}
		if (!outOfStock) {
			//Thread.sleep(7000);
			//WebDriverExplicitWait(driver, 10, "Xpath", Constants.addTocartButton);
			addcart.addTocartButton.click();
			Reporter.log("Item added from main cart successfully",true);
			Thread.sleep(7000);
			//WebDriverExplicitWait(driver, 10, "Xpath", Constants.cartIcon_PDP);
			addcart.cartIcon_PDP.click();
			//Thread.sleep(7000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.viewCartButton_PDP);
			addcart.viewCartButton_PDP.click();
			//Thread.sleep(7000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.removeFromCartSymbol);
			addcart.removeFromCartSymbol.click();
			//Thread.sleep(7000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.removeFromCartButton);
			addcart.removeFromCartButton.click();
			Reporter.log("Item removed from main cart successfully",true);

		}
	}
	

	// Add to cart
	@Test(priority = 2)

	public void AddToCart() throws Exception {
		AddToCartObjects addcart = new AddToCartObjects(driver);
		boolean outOfStock = false;
		//Thread.sleep(3000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.clothing);
		moveToElement(addcart.clothing);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
		addcart.dressAndJumpsuits.click();
		addcart.jumpsuits.click();
		//scrollBottom();
		//Thread.sleep(6000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.PLPTwo);
		addcart.PLPTwo.click();
		//Thread.sleep(6000);

		if (!elementHasClass(addcart.selectSizeXS, "disabled")) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		}else if (!elementHasClass(addcart.selectSizeS, "disabled")) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");

		} else if (!elementHasClass(addcart.selectSizeM, "disabled")) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");

		} else if (!elementHasClass(addcart.selectSizeL, "disabled")) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");

		} else {
			System.out.println("Product is Out of stock");
			outOfStock = true;
		}
		if (!outOfStock) {
		//Thread.sleep(3000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.addTocartButton);
		addcart.addTocartButton.click();
		//Thread.sleep(7000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.cartIcon_PDP);
		addcart.cartIcon_PDP.click();		
		//Thread.sleep(3000);
		//WebDriverExplicitWait(driver, 10, "Xpath", Constants.viewCartButton_PDP);
		addcart.viewCartButton_PDP.click();
		// captureScreen();
	}
}
	// Quick view Add to cart
	@Test(priority = 3)

	public void AddToCartQuickview() throws Exception {
		boolean outOfStock = false;
		AddToCartObjects addcart = new AddToCartObjects(driver);
		QuickViewObjects quickview = new QuickViewObjects(driver);
		moveToElement(addcart.clothing);
		//Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.topsAnTees);
		addcart.topsAnTees.click();
		//Thread.sleep(1000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.quickviewPLP);
		moveToElement(quickview.quickviewPLP);
		//Thread.sleep(3000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.quickviewIcon);
		quickview.quickviewIcon.click();
		//Thread.sleep(5000);
		
		if (!elementHasClass(addcart.selectSizeXS, "disabled")) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		}else if (!elementHasClass(addcart.selectSizeS, "disabled")) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");

		} else if (!elementHasClass(addcart.selectSizeM, "disabled")) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");

		} else if (!elementHasClass(addcart.selectSizeL, "disabled")) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");

		} else {
			System.out.println("Product is Out of stock");
			outOfStock = true;
		}
		if (!outOfStock) {
		//Thread.sleep(3000);
			
		quickview.quickviewAddToCart.click();
		Reporter.log("Item added to cart",true);
	    quickview.quickviewclose.click();
	    Reporter.log("quick view window closed",true);
		// View Cart
	     // Thread.sleep(3000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.cartIcon_PDP);
		  addcart.cartIcon_PDP.click();
		    Reporter.log("Cart icon clicked",true);
		 // Thread.sleep(5000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.viewCartButton_PDP);
		  addcart.viewCartButton_PDP.click(); //captureScreen();
		  Reporter.log("View cart button clicked",true);

	}
	}
	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}