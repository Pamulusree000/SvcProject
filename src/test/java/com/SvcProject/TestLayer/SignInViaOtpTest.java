package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;


public class SignInViaOtpTest extends TestBase {

	
	@DataProvider
	public Object[][] getSignInViaOtpDataScenarios1() throws Exception
	{
		Object[][] data = ReadExcelData.excelTestData("signinviaotpscenarios1");
		return data;
	}
	@DataProvider
	public Object[][] getSignInViaOtpDataScenarios2() throws Exception
	{
		Object[][] data = ReadExcelData.excelTestData("signinviaotpscenarios2");
		return data;
	}
	

	@Test (dataProvider = "getSignInViaOtpDataScenarios1",priority=1)
	public void verifySignInViaOtpScenarios1(
			String Username,
			String LoginOtp,
			String Expectedtitle,
			String Expectedvalidation
			) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		logger.info("clicked on home signin button");
		Thread.sleep(3000);		
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(3000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("clicked on sign in via otp button");
		Thread.sleep(3000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		Thread.sleep(3000);
		signinviaotp.clickOnSignInButton();
		logger.info("clicked on signin button");
		Thread.sleep(3000);
		
		String Actualtitle=driver.getTitle();
		//System.out.println(title);
		
		Assert.assertEquals(Actualtitle, Expectedtitle);
		
		if(Actualtitle.equals("i~Virtual Vaidya"))
		{
			Assert.assertTrue(signinviaotp.getErrorText().contains(Expectedvalidation));
		}

	}
	
	@Test (dataProvider = "getSignInViaOtpDataScenarios2",priority=2)
	public void verifySignInViaOtpScenarios2(
			String Username,
			String Expectedtitle,
			String Expectedvalidation
			) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		logger.info("clicked on home signin button");
		Thread.sleep(3000);		
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(3000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("clicked on sign in via otp button");
		Thread.sleep(3000);
		
		String Actualtitle=driver.getTitle();
		//System.out.println(title);
		
		Assert.assertEquals(Actualtitle, Expectedtitle);
		
		if(Actualtitle.equals("i~Virtual Vaidya"))
		{
			Assert.assertTrue(signinviaotp.getErrorText().contains(Expectedvalidation));
		}

	}
}
