package pagObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import globals.Globals;

public class SaveForLaterObjects extends Globals{
	
	public SaveForLaterObjects (WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath=".//*[@id='pincode_check']")
	public WebElement pncode;
	
	@FindBy(id="pincodeSubmit")
	public WebElement checkbtn;
	
	@FindBy(xpath=".//*[@id='main-menu']/ul/li[2]/div[1]/a/span")
	public WebElement wmenCtegory;
	
	@FindBy(xpath=".//*[@id='main-menu']/ul/li[2]/div[2]/div/div[3]/div[1]/ul/li[7]/a")
	public WebElement wmenLehnga;
	
	@FindBy(xpath=".//*[@id='productsCatalog']/li[1]/div/div[2]/div[2]")
	public WebElement saveforLater;
	
	@FindBy(xpath=".//*[@id='page']/header/div/div/div/div[3]/div[3]/div/a[3]/span")
	public WebElement loginButton;
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[4]")
	public WebElement saveforLaterPopUp;
	
	@FindBy(xpath =".//*[@id='uiDialogBody']/div[2]/div[3]/div[2]/span/span")
	public WebElement saveforLaterQuickview;
	
	@FindBy(xpath =".//*[@id='content']/div[4]/div[1]/div[1]/div/div[3]/div[3]/div[2]/span/span")
	public WebElement saveforLaterPDP;
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[4]/div[2]/p/b/b")
	public WebElement savedforLaterMsg;
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[3]/a/span[1]")
	public WebElement savedforLaterIcon;
	
	@FindBy(xpath =".//*[@id='productsCatalog']/li/div/div/button")
	public WebElement addToBagButton;
	
	@FindBy(xpath =".//*[@id='productsCatalog']/li/div/div/div[3]/div/div[3]/span[2]")
	public WebElement addToBagSize;
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[4]/div[2]/p")
	public WebElement addToBagPopupMsg;
	
	@FindBy(xpath =".//*[@id='productsCatalog']/li[1]/div/div/a[2]")
	public WebElement deleteProduct;
	
	@FindBy(xpath =".//*[@id='page']/header/div/div/div/div[3]/div[4]")
	public WebElement deleteProductMsg;
}
