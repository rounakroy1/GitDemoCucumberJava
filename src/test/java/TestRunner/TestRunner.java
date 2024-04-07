package TestRunner;
import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions"},
monochrome = true,

tags = ("@Smoke"),
plugin = { "pretty",  "junit:target/reports/cucumber.xml"}
)
public class TestRunner {
}