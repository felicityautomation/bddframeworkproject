package tests;

import org.testng.annotations.Test;

import utilities.DriverScript;

public class KeywordDrivenTest1 {
	
	@Test
	public void fbTest() throws Exception {
		DriverScript driverScript=new DriverScript();
		driverScript.runScript("testdata/KeywordDrivenData.xlsx", "Module1", "TC1");
	}
	
	@Test
	public void fbTest2() throws Exception {
		DriverScript driverScript=new DriverScript();
		driverScript.runScript("testdata/KeywordDrivenData.xlsx", "Module1", "TC2");
	}

}
