package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPages;

public class LoginSteps {
	
	WebDriver driver = null;
	
	LoginPages login;
	@Given("browser is open")
	public void browser_is_open() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	    driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	    
	}

	@When("^user enters (.*?) and (.*?)$")
	public void userenters_username_and_password(String username, String password) throws InterruptedException {
		
		login = new LoginPages(driver);
		login.loginCredentials(username, password);
//	    driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(username);
//	    driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
	    Thread.sleep(3000);
	}

	@And("enter on click button")
	public void enter_on_click_button() {
		
		login.loginClick();
//	    driver.findElement(By.xpath("//button[@id = 'submit']")).click();
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
	    driver.getPageSource().contains("Logged In Successfully");
	    Thread.sleep(3000);
	    driver.close();
	    driver.quit();
	}

}
