package pages.factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookForgotPassword {


	public FaceBookForgotPassword(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "identify_email")
	WebElement inputEmail;
	
	@FindBy(id="did_submit")
	WebElement buttonSearch;
	
	

	public void setEmail(String email) {
		inputEmail.sendKeys(email);
	}

	public void clickSearchButton() {
		buttonSearch.click();
	}

}
