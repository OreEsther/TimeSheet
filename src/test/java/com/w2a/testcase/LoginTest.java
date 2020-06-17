package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void personnelLogin () throws InterruptedException {

		driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("emailKeys"));
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys(OR.getProperty("passwordKey"));		
		Thread.sleep(3000);
		click("finalLogin_XPATH");
		
		Thread.sleep(30000);
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("assert_XPATH"))), "Dashboard");
		log.debug("Log in successfully executed");
		Thread.sleep(3000);
	}

}
