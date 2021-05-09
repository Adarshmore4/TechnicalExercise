package actions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.Constants;
import pageObjects.BackEndPageElements;
import pageObjects.HomePageElements;


public class TechnicalExerciseActions {
	
	//function to navigate from home page to back end screen
	public static void navigateToBackEndAdmin(WebDriver driver) {		
		WebElement profileElement = HomePageElements.getProfileDropdownElement(driver, Constants.WAIT1);
		profileElement.click();
		WebElement adminElement = HomePageElements.getAdminElement(driver, Constants.WAIT1);
		adminElement.click();
	}

	//function to create a new category
	public static void createCategory(WebDriver driver, String categoryName) {		
		WebElement createCategoryButton = BackEndPageElements.getCreateCategoryButtonElement(driver, Constants.WAIT1);
		createCategoryButton.click();
		WebElement categoryNameTextBox = BackEndPageElements.getCreateCategoryNameElement(driver, Constants.WAIT1);
		categoryNameTextBox.sendKeys(categoryName);
		WebElement createCategoryYesButton = BackEndPageElements.getCreateCategoryYesButtonElement(driver);
		createCategoryYesButton.click();
	}
	
	//function to check whether a category is already present
	public static boolean checkCategoryPresent(WebDriver driver, String categoryName) {		
		boolean isPresent=false;
		List<WebElement> categories = BackEndPageElements.getListCreatedElements(driver, Constants.WAIT1);
		for(WebElement category : categories)
		{	
				if(category.getText().equalsIgnoreCase(categoryName)) {
				System.out.println(category.getText());
				isPresent = true;
				break;
			}
		}		
		return isPresent;
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
