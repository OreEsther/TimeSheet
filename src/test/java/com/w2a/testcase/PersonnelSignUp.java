package com.w2a.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class PersonnelSignUp extends TestBase{
	//
	@Test
	public void signUp() throws InterruptedException {
		Thread.sleep(2000);
		click("SignUpBtn_XPATH");
		//fill in first name
		driver.findElement(By.xpath(OR.getProperty("fname_XPATH"))).sendKeys(OR.getProperty("fnameKey"));
		//fill in last name
		driver.findElement(By.xpath(OR.getProperty("lname_XPATH"))).sendKeys(OR.getProperty("lnameKey"));		
		driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("SemailKeys"));
		
		//select nationality
		Select drpCountry = new Select(driver.findElement(By.xpath(OR.getProperty("Nationality_XPATH"))));
		drpCountry.selectByVisibleText("Nigeria");
	
		driver.findElement(By.xpath(OR.getProperty("CurPos_XPATH"))).sendKeys(OR.getProperty("curPosKey"));
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("passwordKey"));	
		driver.findElement(By.xpath(OR.getProperty("cpassword_XPATH"))).sendKeys(OR.getProperty("passwordKey"));
		
		//upload signature file
		driver.findElement(By.xpath(OR.getProperty("chooseFile_XPATH"))).sendKeys(OR.getProperty("fileLinkKey"));

	    // check the "I accept the terms of service" check box
	   click("TermsCon_XPATH");
	   
	   click("RegisterBtn_XPATH");

	}

}
