package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utilities.BrowserUtil;

public class ActionsExamples2 {
	
	@Test(enabled=true)
	public void amazonTest() throws InterruptedException {
		RemoteWebDriver driver=BrowserUtil.getDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		Actions actions=new Actions(driver);
		//actions.clickAndHold(draggable).release(droppable).build().perform();
		actions.dragAndDrop(draggable, droppable).build().perform();
		driver.navigate().to("https://www.icicibank.com/");
		WebElement link=driver.findElement(By.xpath("//span[text()='Payments']"));
		actions.moveToElement(link).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Tax Payment')]")).click();
		
		boolean flag=false;
		for(int i=1;i<=20;i++) {
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath("//a[contains(text(),'Tax Payment')]")).click();
				flag=true;
				break;
			}
			catch(Exception e) {
				flag=false;
			}
		}
		
		if(flag==true) {
			//success
		}
		else {
			//fail
		}
		
	}

}
