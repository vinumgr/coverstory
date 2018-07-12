package pagObjects;

import globals.Globals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCartObjects extends Globals {
	
	public AddToCartObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	//Define the page Objects
	
	@FindBy(xpath="//span[contains(text(),'Clothing')]")
	public WebElement clothing;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'All New')]")
	public WebElement allNew;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Dresses & Jumpsuits')]")
	public WebElement dressAndJumpsuits;
	
	@FindBy(xpath="//a[@id='jumpsuit']")
	public WebElement jumpsuits;
	
	@FindBy(xpath="//a[@id='maxi']")
	public WebElement maxi;
	
	@FindBy(xpath="//*[@id='productsCatalog']/li[3]/div/div[2]/a/img")
	public WebElement PLP;	
	
	@FindBy(xpath="//*[@id='productsCatalog']/li[16]/div/div[2]/a")
	public WebElement PLPTwo;
	
	@FindBy(xpath="//span[contains(text(),'XS')]")
	public WebElement selectSizeXS;
	
	@FindBy(xpath="//span[contains(text(),'S')]")
	public WebElement selectSizeS;
	
	@FindBy(xpath="//span[contains(text(),'M')]")
	public WebElement selectSizeM;
	
	@FindBy(xpath="//span[contains(text(),'L')]")
	public WebElement selectSizeL;
	
	@FindBy(xpath="//span[contains(text(),'XL')]")
	public WebElement selectSizeXL;
	
	@FindBy(xpath="//a[@id='midi']")
	public WebElement madi;
	
	@FindBy(xpath="//a[@id='mini']")
	public WebElement mani;
	
	@FindBy(xpath="//a[@id='skater']")
	public WebElement skaters;
	
	@FindBy(xpath="//a[@id='shift']")
	public WebElement shifts;
	
	@FindBy(xpath="//a[@id='bodycon']")
	public WebElement bodycon;
	
	//Adding to cart from PDP
	@FindBy(xpath="//button[@id='pdp-add-tocart-btn']")
	public WebElement addTocartButton;
	
	@FindBy(xpath="//*[@id=\"page\"]/header/div/div/div/div[4]/div/div[1]/div[1]")
	public WebElement cartIcon_PDP;

	@FindBy(xpath="//*[@id=\"mini-cart-drobdwon\"]/div[4]/div[4]/div[1]/a")
	public WebElement viewCartButton_PDP;
	
	@FindBy(xpath="//*[@id=\"items_minicart_overlay_1\"]/div[2]/a")
	public WebElement removeFromMiniCartSymbol;
	
	@FindBy(xpath="//button[@class='btn remove-item cart-pop-btn']")
	public WebElement removeFromMiniCartButton;
	
	@FindBy(xpath="//*[@id=\"items_overlay_1\"]/div[6]/a[1]")
	public WebElement removeFromCartSymbol;
	
	@FindBy(xpath="//button[@class='btn remove-item cart-pop-btn']")
	public WebElement removeFromCartButton;
	
	//Adding to cart from Quick View
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Tops & Tees')]")
	public WebElement topsAnTees;
	
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Skirts & Shorts')]")
	public WebElement skirtsAndShorts;
	
	@FindBy(xpath="//*[@id='productsCatalog']/li[1]/div/div[2]/a")
	public WebElement skirtsPLP;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Trousers & Leggings')]")
	public WebElement trousersAndLeggings;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Jeans')]")
	public WebElement jeans;
	
	@FindBy(xpath="//h3[@class='widgettitle'][contains(text(),'Jackets & Sweaters')]")
	public WebElement jacketsAndSweaters;
	
	@FindBy(xpath="//span[contains(text(),'Accessories')]")
	public WebElement accessories;
	
	
	// Size Handling
	
	public void PDPsizeSelect(){
		  
		  
		  if( selectSizeXS.isEnabled()) {
		    
			  selectSizeXS.click();
		     System.out.println("Extra Small size is selected");
		      
		       }
		  
		   else if(selectSizeS.isEnabled())  {
			   selectSizeS.click();
		       System.out.println("Small size is selected");
		       
		       }
		   else if(selectSizeM.isEnabled())  {
			   selectSizeM.click();
		       System.out.println("Medium size is selected");
		       }
		   else if(selectSizeL.isEnabled())  {
			   selectSizeL.click();
		       System.out.println("Large size is selected");
		       }
	
		   else {
		    System.out.println("Product is Out of stock");
		   }
		    
		 }
	
	
	
	public void QuickviewSelectsize(){
		  
		  
		  if( selectSizeXS.isEnabled()) {
		    
			  selectSizeXS.click();
		     System.out.println("Extra Small size is selected");
		      
		       }
		  
		   else if(selectSizeS.isEnabled())  {
			   selectSizeS.click();
		       System.out.println("Small size is selected");
		       
		       }
		   else if(selectSizeM.isEnabled())  {
			   selectSizeM.click();
		       System.out.println("Medium size is selected");
		       }
		   else if(selectSizeL.isEnabled())  {
			   selectSizeL.click();
		       System.out.println("Large size is selected");
		       }
	
		   else {
		    System.out.println("Product is Out of stock");
		   }
		    
		 }	
		 
/*		 public void PDPsizeSelect(){
		  
		  if( selectsizePdpsmall.isEnabled()) {
		    
		     selectsizePdpsmall.click();
		     System.out.println("Small size is selected");
		      
		       }
		  
		   else if(selectsizePdpmedium.isEnabled())  {
		    selectsizePdpmedium.click();
		       System.out.println("Medium size is selected");
		       
		       }
		   else if(selectsizePdplarge.isEnabled())  {
		    selectsizePdplarge.click();
		       System.out.println("Large size is selected");
		       }
		   else if(selectsizePdpxl.isEnabled())  {
		    selectsizePdpxl.click();
		       System.out.println("XL size is selected");
		       }
		   else if(selectsizePdpxxl.isEnabled())  {
		    selectsizePdpxxl.click();
		       System.out.println("XXL size is selected");
		       }
		   else {
		    System.out.println("Product is Out of stock");
		   }
		  
		 }
		 */
		
		  
		  
		 }
