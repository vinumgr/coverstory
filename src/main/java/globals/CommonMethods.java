package globals;

import DataUtilities.Excelutility;
import pagObjects.LoginPageobjects;
public class CommonMethods extends Globals{
	public static void loginViaEmail() throws Exception{
		LoginPageobjects lgin = new LoginPageobjects(driver);
		Thread.sleep(10000);
		lgin.loginIcon.click();
		lgin.loginButton.click();
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Thread.sleep(1000);
		lgin.signInButton.click();
		Thread.sleep(1000);
		//lgin.loginIcon.click();
	}
	
	public static void loginIntoEmail() throws Exception{
		LoginPageobjects lgin = new LoginPageobjects(driver);
		Thread.sleep(10000);
		lgin.loginIcon.click();
		lgin.loginButton.click();
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Thread.sleep(1000);
		lgin.signInButton.click();
		Thread.sleep(1000);
		//lgin.loginIcon.click();
	}

}

