package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DemoForHooks {
	
	WebDriver driver = null;
	
	@Before
	public void browserOpen() {
		System.out.println("Inside the Browser open method");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		System.out.println("Inside the Teardown method");
		driver.close();
		driver.quit();
	}
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	}

	@When("user enters credentials")
	public void user_enters_credentials() {
	}

	@And("click button")
	public void click_button() {
	}

	@Then("user navigates to homepage")
	public void user_navigates_to_homepage() {
	}

}
