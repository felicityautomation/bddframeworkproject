package step.definition;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoBlazeHomePage;
import pages.DemoBlazeLoginPage;
import utilities.BrowserUtil;
import utilities.WebActions;

public class LoginSteps {
	RemoteWebDriver driver;

	@Given("User opens the browser")
	public void user_opens_the_browser() {
		driver=BrowserUtil.getDriver();
	}

	@When("User navigated to the Login page")
	public void user_navigated_to_the_login_page() {
		WebActions.openUrl(driver, "https://www.demoblaze.com/index.html");
	}

	@When("User enters user name as {string} and password as {string}")
	public void user_enters_user_name_as_and_password_as(String username, String password) {
		DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
		homePage.clickOnLoginLink();
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		loginPage.setUserName(username);
		loginPage.setPassword(password);
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		loginPage.clickLoginButton();
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
		DemoBlazeHomePage homePage=new DemoBlazeHomePage(driver);
		boolean flag=homePage.isLogoutLinkDisplayed();
		Assert.assertTrue(flag, "Verify logout lik displayed in the home page");
	}

	@Then("error message is displayed")
	public void the_home_page_with_error() {
		DemoBlazeLoginPage loginPage=new DemoBlazeLoginPage(driver);
		boolean flag=loginPage.isAlertPresent();
		Assert.assertTrue(flag, "Verify Alert with error message");
	}

	@And("close the browser")
	public void closeBrowser() {
		driver.quit();
	}


}
