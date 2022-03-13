package Com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber .class)
@CucumberOptions(
		features={"Com.AllFeatureFile/login.feature"},
		glue = {"Com.StepDefination"},
		dryRun = false,
				plugin = {"html:Reports/orange.html",
						"json:Reports/orange.json",
						"junit:Reports/ornage.xml",
						"pretty:Reports/ornage.txt"
		}
	
	
		
		)
public class Testrunner {

}
