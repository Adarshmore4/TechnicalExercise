package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


// Running using JUnit
@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions
(
		monochrome = true,
		tags = ("not @Test"),
		features = "Feature/technicalexercisescenario.feature",
		glue="stepDefinition",
		plugin = { "pretty", "html:target/cucumber-reports" }
)

public class TechnicalExerciseTest {
}


/* <-----Uncomment this class to run as Java----->
	public class TechnicalExerciseTest {	
	public static void main(String[] args) throws Exception {		
		 String[] options = {"--glue", "stepDefinition",
         "Feature\\technicalexercisescenario.feature"};
		  byte exitcode = Main.run(options, Thread.currentThread().getContextClassLoader());
		  System.out.println("exitcode = " + exitcode);
	}
} */

/*	<-----Uncomment this class to run as TestNG----->
 	@Test
	public class TechnicalExerciseTest extends cucumber.api.testng.AbstractTestNGCucumberTests {
	
} */
