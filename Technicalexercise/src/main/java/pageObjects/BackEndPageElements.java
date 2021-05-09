package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackEndPageElements {
	
	public static WebElement getCategoriesElement(WebDriver driver, int seconds) {
		WebElement CategoriesElement = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Categories')]")));
		return CategoriesElement;
	}
	
	public static WebElement getCreateCategoryButtonElement(WebDriver driver, int seconds) {
		WebElement AdminElement = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), \"Create Category\")]")));
		return AdminElement;
	}
	
	public static WebElement getCreateCategoryNameElement(WebDriver driver, int seconds) {
		WebElement CreateCategoryNameElement = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='MediaContentGroupCCG_name']")));
		return CreateCategoryNameElement;
	}
	
	public static WebElement getCreateCategoryYesButtonElement(WebDriver driver) {
		WebElement CreateCategoryYesButtonElement = driver.findElement(By.xpath("//button[text()[normalize-space()='Create']]"));
		return CreateCategoryYesButtonElement;
	}
	
	public static WebElement getCancelCreateCategoryButtonElement(WebDriver driver) {
		WebElement CancelCreateCategoryButtonElement = driver.findElement(By.xpath("//a[text()[normalize-space()='Cancel']]"));
		return CancelCreateCategoryButtonElement;
	}

	public static List<WebElement> getListCreatedElements(WebDriver driver, int seconds) {
		List<WebElement> ListCreatedElements = (new WebDriverWait(driver, seconds)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//table[contains(@class,'items table')]//a"))));
		return ListCreatedElements;
	}
	
	public static WebElement getDeleteCategoryButtonElement(WebDriver driver, String categoryName) {
		WebElement DeleteCategoryButtonElement = driver.findElement(By.xpath("//table[contains(@class,'items table')]//a[contains(text(), "+categoryName+")]//parent::td//following-sibling::td//li[@class='delete']"));
		return DeleteCategoryButtonElement;
	}
	
		
	public static WebElement getGotoMySiteButtonElement(WebDriver driver) {
		WebElement GotoMySiteButtonElement = driver.findElement(By.xpath("//a[text()[normalize-space()='Go to my site']]"));
		return GotoMySiteButtonElement;
	}
	
	
}
