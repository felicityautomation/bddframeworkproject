package pages.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	
	
	public FaceBookLoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//1. Locators of the page
	//2. Operations that are supported by the page
	
	//Locators that required for the test cases needs to be defined as below
	@FindBy(id="email")
	WebElement inputEmail;
	
	@FindBy(id="pass")
	WebElement inputPassword;
	
	
	@FindBy(name="login")
	WebElement buttonLogin;
	
	
	@FindBy(how = How.XPATH,using="//a[text()='Forgotten password?']")
	WebElement linkForgotPassword;
	
	
	
	public void clickForgotPasswordLink() {
		linkForgotPassword.click();
	}
	
	public void setEmailId(String emailId) {
		inputEmail.sendKeys(emailId);
	}

	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickLoginButton() {
		buttonLogin.click();	
	}
	
	public void login(String emailId,String password) {
		this.setEmailId(emailId);
		this.setPassword(password);
		//Additional step over here
		this.clickLoginButton();
	}
}
