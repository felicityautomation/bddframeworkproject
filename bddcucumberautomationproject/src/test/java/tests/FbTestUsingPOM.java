package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import pages.FaceBookForgotPassword;
import pages.FaceBookLoginPage;
import utilities.BrowserUtil;
import utilities.LoggerUtil;

public class FbTestUsingPOM {
	
	@Test
	public void loginTest() throws InterruptedException {
		LoggerUtil.setTimeForLogger();
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.facebook.com");
		FaceBookLoginPage loginPage=new FaceBookLoginPage(driver);
		loginPage.login("kjjlkjsdf@edureka", "34343");
		loginPage.clickForgotPasswordLink();
		FaceBookForgotPassword forgotPage=new FaceBookForgotPassword(driver);
		forgotPage.setEmail("kjjlkjsdf@edureka");
		forgotPage.clickSearchButton();
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	@Test(enabled=false)
	public void loginTest2() throws InterruptedException {
		LoggerUtil.setTimeForLogger();
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.facebook.com");
		FaceBookLoginPage loginPage=new FaceBookLoginPage(driver);
		loginPage.login("kjjlkjsdf@edureka", "34343");
		loginPage.clickForgotPasswordLink();
		FaceBookForgotPassword forgotPage=new FaceBookForgotPassword(driver);
		forgotPage.setEmail("kjjlkjsdf@edureka");
		forgotPage.clickSearchButton();
		Thread.sleep(5000);
		driver.quit();
	}

}
