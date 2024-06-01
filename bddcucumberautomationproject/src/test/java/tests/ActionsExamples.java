package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class ActionsExamples {
	
	@Test(enabled=true)
	public void amazonTest() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement e=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		actions.contextClick(e).build().perform();
		WebElement pasteButton=driver.findElement(By.xpath("//span[text()='Paste']"));
		actions.click(pasteButton).build().perform();
		driver.switchTo().alert().accept();
		driver.navigate().to("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_dblclick");
		driver.switchTo().frame("iframeResult");
		WebElement p=driver.findElement(By.xpath("//p[text()='Double-click on this paragraph.']"));
		actions.doubleClick(p).build().perform();
		driver.switchTo().alert().accept();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_event_key_ctrlkey");
		driver.switchTo().frame("iframeResult");
		WebElement input=driver.findElement(By.xpath("//input[@onkeydown='isKeyPressed(event)']"));
		input.click();
		Thread.sleep(5000);
		actions.keyDown(Keys.CONTROL).build().perform();
		actions.keyUp(Keys.CONTROL).build().perform();
	}

}
