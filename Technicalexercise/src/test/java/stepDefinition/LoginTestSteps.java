package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import actions.LoginPageActions;
import common.Constants;
import cucumber.api.java.en.Given;


public class LoginTestSteps {
	
	public static WebDriver driver;
	
	public static void instantiateDriver() throws Throwable {		
		setBrowserBasedDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(Constants.URL);
	}

	//instantiate driver based on input from Constants file
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
}
