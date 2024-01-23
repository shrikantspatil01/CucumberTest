package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"StepDefinitions"},
monochrome=false,
plugin={"pretty","html:target/HtmlReports"},
//tags={"@smoke"},
dryRun=false)
public class TestRunner {

}
