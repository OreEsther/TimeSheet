package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class CreateTimesheet extends TestBase{

	
	@Test
	public void createTimesheet () throws InterruptedException {

		//first login
		driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("emailKeys"));
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("passwordKey"));		
		Thread.sleep(3000);
		click("finalLogin_XPATH");
		
		Thread.sleep(20000);
		//creating Timesheet starts
		click("cTimesheetBtn_XPATH");
		Thread.sleep(3000);
		
		//select client
		click("Client_XPATH");
		click("clientOption_XPATH");
		Thread.sleep(10000);
		click("NextBtn_XPATH");
		Thread.sleep(3000);
		
		//select field
		click("Field_XPATH");
		click("fieldOption_XPATH");
		Thread.sleep(10000);
		click("NextBtn2_XPATH");
		Thread.sleep(3000);
		
		//fill current position and place of work
		driver.findElement(By.xpath(OR.getProperty("currentPosition_XPATH"))).sendKeys(OR.getProperty("currPosKey"));
		driver.findElement(By.xpath(OR.getProperty("placeOfWork_XPATH"))).sendKeys(OR.getProperty("poWorkKey"));	
		Thread.sleep(2000);
		click("NextBtn2_XPATH");
		Thread.sleep(3000);
		
		click("Month_XPATH");
		click("monthOption_XPATH");
		
		driver.findElement(By.xpath(OR.getProperty("placeOfRes_XPATH"))).sendKeys(OR.getProperty("poResKey"));
		
		click("Nation_XPATH");
		click("CountryOption_XPATH");
		Thread.sleep(7000);
		click("FinishBtn_XPATH");
		Thread.sleep(10000);
		
		
	}
}
