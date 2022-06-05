package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/AutomationPage.feature"},

        glue = {"stepDefinition"},

        plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json", "html:target/cucumber-html-report", "usage:target/cucumber-usage.json",""+
                "junit:target/cucumber-results.xml"
        },
        dryRun = false


)


public class AutomationRunTestCase extends AbstractTestNGCucumberTests {
}