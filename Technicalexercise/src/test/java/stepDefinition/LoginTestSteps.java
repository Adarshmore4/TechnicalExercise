package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import actions.LoginPageActions;
import common.Constants;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LoginTestSteps {
	
	public static WebDriver driver;
	
	public static void instantiateDriver() throws Throwable {		
		setBrowserBasedDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(Constants.URL);
	}

	//instantiate driver based on browser input from Constants file
	public static void setBrowserBasedDriver() throws Throwable{
		if(Constants.BROWSER.equals("CHROME")) {
			String chromeDriverEnvVariable = System.getenv("webdriver.chrome.driver");
			{
				System.setProperty("webdriver.chrome.driver", chromeDriverEnvVariable);
				System.setProperty("webdriver.chrome.silentOutput", chromeDriverEnvVariable);
				driver = new ChromeDriver();
			}
		}
		
		if(Constants.BROWSER.equals("FIREFOX")) {
			String chromeDriverEnvVariable = System.getenv("webdriver.gecko.driver");
			{
				System.setProperty("webdriver.gecko.driver", chromeDriverEnvVariable);
				System.setProperty("webdriver.gecko.silentOutput", chromeDriverEnvVariable);
				driver = new FirefoxDriver();
			}
		}
		
		if(Constants.BROWSER.equals("EDGE")) {
			String chromeDriverEnvVariable = System.getenv("webdriver.edge.driver");
			{
				System.setProperty("webdriver.edge.driver", chromeDriverEnvVariable);
				System.setProperty("webdriver.edge.silentOutput", chromeDriverEnvVariable);
				driver = new EdgeDriver();
			}
		}
	}
	
	@Given("^User \"([^\"]*)\" is logged to WPN Staging$")
	public void user_is_logged_to_WPN(String User) throws Throwable {		
			LoginTestSteps.instantiateDriver();
			LoginPageActions.enterUserEMail(LoginTestSteps.driver, User);
			LoginPageActions.enterUserPassword(LoginTestSteps.driver, User);
			LoginPageActions.clickLoginButton(LoginTestSteps.driver);
		
	}
	
	@And("logged out of the application")
	public void logged_out_of_the_appliacation() throws Throwable{		
		LoginPageActions.logOut(LoginTestSteps.driver);
	}
	
	 // Takes a screenshot on fail
	@After
	public void captureScreenshot(Scenario scenario) throws Throwable{
			if (scenario.isFailed()) {
		     
		      final byte[] screenshot = ((TakesScreenshot) LoginTestSteps.driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png"); 
		      LoginTestSteps.driver.quit();
		    }
	}
	
	
}
