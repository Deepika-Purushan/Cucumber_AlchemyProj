package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = {"stepDefinitions"},
		tags = {"~@activity1_1","~@activity1_2","~@activity1_3","@activity1_4"},
		strict = true,
		//plugin = {"pretty"},
		plugin = {"html: test-reports"},
		//plugin = {"json: test-reports/json-report.json"},
	    monochrome = true
		)
		
public class ActivitiesRunner {
    //empty
}