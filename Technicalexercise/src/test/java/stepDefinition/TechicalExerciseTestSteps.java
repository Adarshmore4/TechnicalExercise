package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import actions.TechnicalExerciseActions;
import common.Constants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.BackEndPageElements;
import pageObjects.HomePageElements;

public class TechicalExerciseTestSteps {
	
	@Then("User should get navigated to welcome page successfully")
	public void user_should_get_navigated_to_welcome_page_successfully() throws Throwable {	    
		WebElement welcomeText = HomePageElements.getWelcomeMessageElement(LoginTestSteps.driver,Constants.WAIT1);
		Assert.assertTrue("Welcome Message is Incorrect", welcomeText.getText().equalsIgnoreCase("Welcome Message"));
	 }

	@And("user navigate to back end Admin Panel")
	public void user_navigate_to_back_end_Admin_Panel() throws Throwable {		
		TechnicalExerciseActions.navigateToBackEndAdmin(LoginTestSteps.driver);
	 }

	@And("user clicks on categories")
	public void user_clicks_on_categories() throws Throwable {	    
		WebElement categoryElement = BackEndPageElements.getCategoriesElement(LoginTestSteps.driver, Constants.WAIT1);
		categoryElement.click();
	}

	@Given("user creates a category {string}")
	public void user_creates_a_category(String categoryName) throws Throwable{
		TechnicalExerciseActions.createCategory(LoginTestSteps.driver, categoryName);
	}

	@Then("category should get created successfully {string}")
	public void category_should_get_created_successfully(String categoryName) throws Throwable{
	    boolean isCategoryPresent = TechnicalExerciseActions.checkCategoryPresent(LoginTestSteps.driver, categoryName);
	    Assert.assertTrue("Category Created is not Saved", isCategoryPresent);
	}

	@Given("user deletes the category {string}")
	public void user_deletes_the_category(String categoryName)  throws Throwable{		
		TechnicalExerciseActions.deleteCategory(LoginTestSteps.driver, categoryName);
	}

	@Then("category should get deleted successfully {string}")
	public void category_should_get_deleted_successfully(String categoryName)  throws Throwable{
		 boolean isCategoryPresent = TechnicalExerciseActions.checkCategoryPresent(LoginTestSteps.driver, categoryName);
		 Assert.assertFalse("Category Created is not deleted", isCategoryPresent);
	}

	@And("user clicks on Goto My site")
	public void user_clicks_on_Goto_My_site() throws Throwable{
		WebElement gotoMySiteButton = BackEndPageElements.getGotoMySiteButtonElement(LoginTestSteps.driver);
		gotoMySiteButton.click();
	 }

}
