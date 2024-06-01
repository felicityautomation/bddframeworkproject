package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class DropdownExample {
	
	@Test(enabled=false)
	public void amazonTest() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select dropdownList=new Select(dropdown);
		dropdownList.selectByIndex(5);
		Thread.sleep(5000);
		dropdownList.selectByVisibleText("Audible Audiobooks");
		Thread.sleep(5000);
		dropdownList.selectByValue("search-alias=jewelry");
		List<WebElement> options=dropdownList.getOptions();
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		boolean flag=dropdownList.isMultiple();
		System.out.println(flag);
	}
	
	
	@Test
	public void amazonTest1() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select dropdownList=new Select(dropdown);
		dropdownList.selectByIndex(1);
		Thread.sleep(5000);
		dropdownList.selectByIndex(3);
		dropdownList.selectByVisibleText("Opel");
		//dropdownList.deselectAll();
		List<WebElement> options=dropdownList.getOptions();
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		boolean flag=dropdownList.isMultiple();
		System.out.println(flag);
	}

}
