package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class ChangePasswordTest extends TestBase{

	
	@DataProvider
	public Object [][] getChangePassword() throws Exception
	{
		Object [][] data =ReadExcelData.excelTestData("changepassword");
		return data;
	}
	
	
	@Test(dataProvider="getChangePassword")
	public void verifyChangePasswordScenarios(
			String Username,
			String LoginOtp,
			String CurrentPassword,
			String NewPassword,
			String ConfirmPassword,
			String ExpectedTitle,
			String ExpectedValidation
			) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home signin button");
		Thread.sleep(3000);		
		signinviaotp.setUsername(Username);
		String username=signinviaotp.getUsername();
		logger.info("Username :"+username);
		Thread.sleep(3000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		Thread.sleep(3000);
		signinviaotp.setOTP(LoginOtp);
		String otp=signinviaotp.getOtp();
		logger.info("Otp :"+otp);
		Thread.sleep(3000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		Thread.sleep(3000);
		changepassword.clickOnOthersLink();
		logger.info("Clicked on otherslink module");
		Thread.sleep(2000);
		changepassword.clickOnChangePasswordLink();
		logger.info("Clicked on changepasswordlink");
		Thread.sleep(2000);
		changepassword.setCurrentPassword(CurrentPassword);
		String currentpassword=changepassword.getCurrentPassword();
		logger.info("CurrentPassword :"+currentpassword);
		Thread.sleep(2000);
		changepassword.setNewPassword(NewPassword);
		String newpassword=changepassword.getNewPassword();
		logger.info("NewPassword :"+newpassword);
		Thread.sleep(2000);
		changepassword.setConfirmPassword(ConfirmPassword);
		String confirmpassword=changepassword.getConfirmPassword();
		logger.info("ConfirmPassword :"+confirmpassword);
		Thread.sleep(2000);
		changepassword.clickOnUpdateBtn();
		logger.info("Clicked on update button");
		Thread.sleep(3000);
		
	
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(changepassword.getActualResponseMessage().contains(ExpectedValidation));
		}
	
	
	}
	
}
