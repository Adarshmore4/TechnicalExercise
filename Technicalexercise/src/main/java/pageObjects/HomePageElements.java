package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageElements {

	public static WebElement getWelcomeMessageElement(WebDriver driver, int seconds) {
		WebElement WelcomeMessageElement = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"static-page__header\"]//h1[@class=\"title\"]")));
		return WelcomeMessageElement;
	}
	
	public static WebElement getProfileDropdownElement(WebDriver driver, int seconds) {
		WebElement ProfileDropdownElement = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header__logged dropdown']")));
		return ProfileDropdownElement;
	}
	
	public static WebElement getAdminElement(WebDriver driver, int seconds) {
		WebElement AdminElement = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Admin')]")));
		return AdminElement;
	}
	
	public static WebElement getLogoutElement(WebDriver driver, int seconds) {
		WebElement LogoutElement = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Log Out')]")));
		return LogoutElement;
	}
	
	
}
