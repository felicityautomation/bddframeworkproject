package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HandlingAlerts {
	
	//Control+Shift+O - To add imports automatically
	@Test
	public void testAlerts() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Capture the time
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//Capture the time
		//Create a difference of above two to calculate the load time
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		String message=myalert.getText();
		System.out.println("Alert Message:="+message);
		myalert.dismiss();//OK button
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		myalert=driver.switchTo().alert();
		message=myalert.getText();
		System.out.println("Alert Message:="+message);
		//myalert.dismiss();//Cancel button
		myalert.accept(); //Click on OK button
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		myalert=driver.switchTo().alert();
		message=myalert.getText();
		System.out.println("Alert Message:="+message);
		//myalert.dismiss();//Cancel button
		myalert.sendKeys("Bharath from Edureka");
		myalert.accept(); //Click on OK button
		Thread.sleep(5000);
		
		driver.quit();
	}

}
