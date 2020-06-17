package com.w2a.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class ForgotPassTest extends TestBase {
	
	@Test
	public void personnelForgotPass () throws InterruptedException {

		click("FgPassword_XPATH");
		Thread.sleep(30000);
		driver.findElement(By.xpath(OR.getProperty("email_XPATH"))).sendKeys(OR.getProperty("emailKeys"));	
		Thread.sleep(3000);
		click("RecoveryBtn_XPATH");
		click("OKbtn_XPATH");
		Thread.sleep(10000);
	}

}
