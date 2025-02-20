package com.SvcProject.TestLayer;

import java.util.List;

import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;

public class FAQsTest extends TestBase {
	
	
	
	
	
	@Test
	public void verifyFAQs() throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home signin button");
		Thread.sleep(1000);
		signinviaotp.setUsername("9898989898");
		logger.info("Entered username");
		Thread.sleep(1000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on signin via otp button");
		Thread.sleep(1000);
		signinviaotp.setOTP("789123");
		logger.info("Entered user otp");
		Thread.sleep(1000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		//driver.switchTo().alert().accept();
		faq.clickSupportmodule();
		Thread.sleep(1000);
		faq.clickraiseticketform();
		Thread.sleep(1000);
		faq.selectFAQs("How To Download The App?");
		

	}
	
	

}
