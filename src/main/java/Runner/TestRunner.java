package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Selenium_WorkSpace\\FreeCrmBDDFramework1\\src\\main\\java\\Features\\contact.feature", //the pathof feature files
		glue = {"stepDefinitions"}, //the path of step definition file
		plugin= {"Pretty","html:output\\index.html"}, //to generate reports
		stepNotifications = true, //to see all the steps of feature file in junit execution tree
		dryRun = false, //to check the mapping is proper between feature file and step def file
		monochrome = true //it will check if any step is not defined in step definition file
		)

public class TestRunner {

}
