package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome = true,
		tags = ("~@Test"),
		features = "Feature/technicalexercisescenario.feature",
		glue="stepDefinition",
		plugin = { "pretty", "html:target/cucumber-reports" }
)

	public class TechnicalExerciseTest {	
	public static void main(String[] args) throws Exception {		
		 String[] options = {"--glue", "stepDefinition",
         "Feature\\technicalexercisescenario.feature"};
		  byte exitcode = Main.run(options, Thread.currentThread().getContextClassLoader());
		  System.out.println("exitcode = " + exitcode);
	}
}
