package TestRunner;
import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features/demoForHooks.feature",
glue={"StepDefinitions"},
monochrome = true,
plugin = { "pretty",  "junit:target/reports/cucumber.xml"}
)
public class TestRunnerForHooks {
}