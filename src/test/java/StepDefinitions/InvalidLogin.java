package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages_PF.LoginPagesPF;

public class InvalidLogin {
	
	
	WebDriver driver = null;
	LoginPagesPF login;
	@Given("browser is opened")
	public void browser_is_opened() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@And("invalid user is on login page")
	public void invalid_user_is_on_login_page() throws InterruptedException {
	    driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    Thread.sleep(1000);
	}

	@When("^invalid user enters wrong (.*?) and (.*?)$")
	public void invalid_user_enters_wrong_username_and_password(String username, String password) throws InterruptedException {
	    login = new LoginPagesPF(driver);
	    login.enterUsernamePassword(username, password);
	    Thread.sleep(2000);
	}

	@And("enter on submit button")
	public void enter_on_submit_button() {
	    login.enterBtn();
	}

	@Then("invalid username will be displayed")
	public void invalid_username_will_be_displayed() throws InterruptedException {
	    login.errorMsg();
	    Thread.sleep(2000);
	    driver.close();
	    driver.quit();
	}
}
