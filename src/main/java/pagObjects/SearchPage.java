package pagObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import globals.Globals;

public class SearchPage extends Globals{
	public SearchPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Define the page Objects
	
		@FindBy(xpath="//*[contains(@title, 'Search')]")
		public WebElement searchIcon;
		
		@FindBy(xpath="//*[contains(@id, 'searchInput')]")
		public WebElement searchBox;
		
		@FindBy(xpath="//*[contains(@id, 'search_submit_btn')]")
		public WebElement searchButton;
		
		@FindBy(xpath="//*[@id='content']/div[2]/div/div[2]/div[2]/div/div[1]/h1")
		public WebElement searchResult;
		
		//Banner object
		@FindBy(xpath="//*[contains(@class, 'owl-dot active')]")
		public WebElement bannerSlider;
		
		@FindBy(xpath="//*[starts-with(@id, 'myCarousel')]")
		public WebElement bannerOne;
		
		@FindBy(xpath="//*[contains(@class, 'new-in-banner')]")
		public WebElement bannerTwo;
		
	}