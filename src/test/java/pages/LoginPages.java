package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {
	protected WebDriver driver;
	private By txt_username = By.xpath("//input[@id = 'username']");
	private By txt_password = By.xpath("//input[@id = 'password']");
	private By login_click = By.xpath("//button[@id = 'submit']");
	
	public LoginPages(WebDriver driver) {
		this.driver = driver;
		if(!driver.getTitle().contains("Test Login")) {
			throw new IllegalStateException("This is not the login page. Current page url is "+driver.getCurrentUrl());
		}
	}
	
	public void loginCredentials(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
	}
	public void loginClick() {
		driver.findElement(login_click).click();
	}
}
