package pages_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagesPF {
	
	WebDriver driver;
	@FindBy(xpath= "//input[@id = 'username']")
	WebElement txt_Username;
	
	@FindBy(xpath= "//input[@id = 'password']")
	WebElement txt_password;
	
	@FindBy(xpath= "//button[@id = 'submit']")
	WebElement btn_Submit;
	
	@FindBy(id = "error")
	WebElement txt_wrongUsername;
	
	public LoginPagesPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUsernamePassword(String username, String password) {
		txt_Username.sendKeys(username);
		txt_password.sendKeys(password);
	}
	
	public void enterBtn() {
		btn_Submit.click(); 
	}
	
	public void errorMsg() {
		txt_wrongUsername.isDisplayed();
	}

}
