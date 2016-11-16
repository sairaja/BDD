package AutomationRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"features"},glue={"stepdefination"},plugin= {"pretty","html:target/html", "json:target/cucumber.json","junit:target/cucumber-results.xml"})
public class AutomationRunner {

}

