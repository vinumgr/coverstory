package globals;

public class Constants {
/*
	public static String fbb_URL = "";
	public static String fbb_UserName = "vinodmgr22@gmail.com.com";
	public static String fbb_Password = "123456";
	public static String Pincode="";
	
	public static String live_FutureGroup_URL = "";
	public static String live_FutureGroup_UserName = "";
	public static String live_FutureGroup_Password = "";*/
	
	
	public static String excelFilePath = System.getProperty("user.dir")+"/src/main/java/DataUtilities/LoginData.xlsx";
	/*public static String excelFileName = "";
	public static String excelSheetName = "";
	public static String cardnumber = "5123456789012346";
	public static String cardname = "Test";
	public static String cardexpiryyear = "2017";
	public static String cvvnumber = "123";
	*/
	
	//Objects xpath
	public static String loginIcon = ".//span[@class='user-icon-inner']";
	public static String signInButton = "//*[@id='stepOneSubmit']";
	public static String signOutButton = "//li[@class='signout-afterlogin']//a[contains(@class,'sel-logout')][contains(text(),'Sign Out')]";
	public static String loginInputId = "//*[@id='loginInput']";
	public static String signinGooglePlus = "//button[@type='button'][contains(text(),'Sign in with Gplus')]";
	public static String signinFacebook = "//button[@type='button'][contains(text(),'Sign in with Facebook')]";
	public static String facebookLoginButton = "//button[@id='loginbutton']";
	public static String facebookEmailAndPhone = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]";
	public static String MyAccount = "//*[@id='page']/header/div/div/div/div[4]/div/div[3]/div/ul/li[3]/a";
	public static String editProfileButton = "//*[@id='CProEditButton']";
	public static String saveProfileButton = "//*[@id='CProSaveButton']";

}
