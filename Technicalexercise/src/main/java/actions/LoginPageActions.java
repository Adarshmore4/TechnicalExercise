package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.Constants;
import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;

public class LoginPageActions {
	
	//function to enter UserName for a particular User
	public static void enterUserEMail(WebDriver driver, String user) {		
		if(user.equals("ROHAN")) {
			WebElement userEmailElement = LoginPageElements.getUserEmailElement(driver);
			userEmailElement.sendKeys(Constants.ROHAN_USERNAME);
		}
	}
	
	//function to enter Password for a particular User
	public static void enterUserPassword(WebDriver driver, String user) {		
		if(user.equals("ROHAN")) {
			WebElement userPasswordElement = LoginPageElements.getUserPasswordElement(driver);
			userPasswordElement.sendKeys(Constants.ROHAN_PASSWORD);
		}
	}
	
	//function to click the Login button
	public static void clickLoginButton(WebDriver driver) {
		WebElement loginButtonElement = LoginPageElements.getLoginButtonElement(driver);
		loginButtonElement.click();
	}
		
	//function to perform logout from home screen
		public static void logOut(WebDriver driver) {		
			WebElement profileElement = HomePageElements.getProfileDropdownElement(driver, Constants.WAIT1);
			profileElement.click();
			WebElement logOutElement = HomePageElements.getLogoutElement(driver, Constants.WAIT1);
			logOutElement.click();
			driver.close();
		}
}
