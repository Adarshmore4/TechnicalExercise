package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {
	
	public static WebElement getUserEmailElement(WebDriver driver) {
		WebElement UserEmailElement = driver.findElement(By.xpath("//input[contains(@id,'FormLogin_username')]"));
		return UserEmailElement;
	}
	
	public static WebElement getUserPasswordElement(WebDriver driver) {
		WebElement UserPasswordElement = driver.findElement(By.xpath("//input[contains(@id,'FormLogin_password')]"));
		return UserPasswordElement;
	}

	public static WebElement getLoginButtonElement(WebDriver driver) {
		WebElement LoginButtonElement = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		return LoginButtonElement;
	}
	
}
