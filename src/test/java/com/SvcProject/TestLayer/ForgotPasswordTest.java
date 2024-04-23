package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class ForgotPasswordTest extends TestBase {
	

	@DataProvider
	public Object[][] getForgotPasswordScenario1Data() throws Exception
	{
		Object [][] data= ReadExcelData.excelTestData("forgotpasswordscenario1");
		return data;
	}
	
	@DataProvider
	public Object[][] getForgotPasswordScenario2Data() throws Exception
	{
		Object [][] data= ReadExcelData.excelTestData("forgotpasswordscenario2");
		return data;
	}
	
	@DataProvider
	public Object[][] getForgotPasswordScenario3Data() throws Exception
	{
		Object [][] data= ReadExcelData.excelTestData("forgotpasswordscenario3");
		return data;
	}
	
	@DataProvider
	public Object [][] getForgotPasswordScenario4() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("forgotpasswordscenario4");
		return data;
	}
	
	
	@Test(dataProvider="getForgotPasswordScenario1Data",priority=1)
	public void verifyForgotPasswordScenario1(
			String Username,
			String ExpectedTitle,
			String ExpectedErrorMessage
			) throws InterruptedException
	{
		
		forgotpassword.clickOnHomeSignInBtn();
		logger.info("Clicked on home signin button");
		Thread.sleep(2000);
		forgotpassword.clickOnForgotPasswordLinkTxt();
		logger.info("Clicked on the forgotpassword link");
		Thread.sleep(2000);
		forgotpassword.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		forgotpassword.clickOnSubmitBtn();
		logger.info("Clicked on submit button");
		Thread.sleep(2000);
		
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals(":: Virtual Clinic ::"))
		{
			Assert.assertTrue(forgotpassword.getActualErrorMessage().contains(ExpectedErrorMessage));
		}
		
		
	}
	
	@Test(dataProvider="getForgotPasswordScenario2Data",priority=2)
	public void verifyForgotPasswordScenario2(
			String Username,
			String Otp,
			String ExpectedTitle,
			String ExpectedErrorMessage
			) throws InterruptedException
	{
		
		forgotpassword.clickOnHomeSignInBtn();
		logger.info("Clicked on home signin button");
		Thread.sleep(2000);
		forgotpassword.clickOnForgotPasswordLinkTxt();
		logger.info("Clicked on the forgotpassword link");
		Thread.sleep(2000);
		forgotpassword.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		forgotpassword.clickOnSubmitBtn();
		logger.info("Clicked on submit button");
		Thread.sleep(2000);
		forgotpassword.setOtp(Otp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		forgotpassword.clickOnOtpSubmitBtn();
		logger.info("Clicked on otp submit button");
		Thread.sleep(2000);
	
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals(":: Virtual Clinic ::"))
		{
			Assert.assertTrue(forgotpassword.getActualErrorMessage().contains(ExpectedErrorMessage));
		}
		
	}
	
	@Test(dataProvider="getForgotPasswordScenario3Data",priority=3)
	public void verifyForgotPasswordScenario3(
			String Username,
			String Otp,
			String NewPassword,
			String ConfirmPassword,
			String ExpectedTitle,
			String ExpectedErrorMessage
			) throws InterruptedException
	{
		
		forgotpassword.clickOnHomeSignInBtn();
		logger.info("Clicked on home signin button");
		Thread.sleep(2000);
		forgotpassword.clickOnForgotPasswordLinkTxt();
		logger.info("Clicked on the forgotpassword link");
		Thread.sleep(2000);
		forgotpassword.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		forgotpassword.clickOnSubmitBtn();
		logger.info("Clicked on submit button");
		Thread.sleep(2000);
		forgotpassword.setOtp(Otp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		forgotpassword.clickOnOtpSubmitBtn();
		logger.info("Clicked on otp submit button");
		Thread.sleep(2000);
		forgotpassword.setNewPassword(NewPassword);
		logger.info("Entered new password");
		Thread.sleep(2000);
		forgotpassword.setConfirmPassword(ConfirmPassword);
		logger.info("Entered confirm password");
		Thread.sleep(2000);
		forgotpassword.clickOnUpdateBtn();
		logger.info("Clicked on update button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals(":: Virtual Clinic ::"))
		{
			Assert.assertTrue(forgotpassword.getActualErrorMessage().contains(ExpectedErrorMessage));
		}
		
	}
	
	
	@Test(dataProvider="getForgotPasswordScenario4",priority=4)
	public void verifyForgotPasswordScenario4(
			String Username,
			String Otp,
			String NewPassword,
			String ConfirmPassword,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		
		forgotpassword.clickOnHomeSignInBtn();
		logger.info("Clicked on home signin button");
		Thread.sleep(2000);
		forgotpassword.clickOnForgotPasswordLinkTxt();
		logger.info("Clicked on the forgotpassword link");
		Thread.sleep(2000);
		forgotpassword.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		forgotpassword.clickOnSubmitBtn();
		logger.info("Clicked on submit button");
		Thread.sleep(2000);
		forgotpassword.setOtp(Otp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		forgotpassword.clickOnOtpSubmitBtn();
		logger.info("Clicked on otp submit button");
		Thread.sleep(2000);
		forgotpassword.setNewPassword(NewPassword);
		logger.info("Entered new password");
		Thread.sleep(2000);
		forgotpassword.setConfirmPassword(ConfirmPassword);
		logger.info("Entered confirm password");
		Thread.sleep(2000);
		forgotpassword.clickOnUpdateBtn();
		logger.info("Clicked on update button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals(":: Virtual Clinic ::"))
		{
			Assert.assertTrue(forgotpassword.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
	
		
	}

	
}
