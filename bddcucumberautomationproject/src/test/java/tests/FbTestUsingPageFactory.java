package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import pages.factory.FaceBookForgotPassword;
import pages.factory.FaceBookLoginPage;

public class FbTestUsingPageFactory {
	
	@Test
	public void loginTest() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
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
