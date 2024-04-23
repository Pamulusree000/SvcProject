package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class CommandCenterTest extends TestBase{

	
	@DataProvider
	public Object [][] getCommandCenterData1() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("commandcenter1");
		return data;
	}
	
	@DataProvider
	public Object[][] getCommandCenterData2() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("commandcenter2");
		return data;
	}


	@Test(dataProvider="getCommandCenterData1")
	public void verifyCommandCenter1(
			String Username,
			String LoginOtp,
			String CommandCenterCode,
			String CommandCenterName,
			String CommandCenterShortName,
			String CommandCenterMobileNo,
			String CommandCenterPincode,
			String CommandCenterContactName, 
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on the home signin button");
		Thread.sleep(2000);
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		Thread.sleep(2000);
		commandcenter.clickOnMasterModule();
		logger.info("Clicked on the master module");
		Thread.sleep(2000);
		commandcenter.clickOnCommandCenter();
		logger.info("Clicked on command center form");
		Thread.sleep(2000);
		commandcenter.clickOnNewButton();
		logger.info("Clicked on new button");
		Thread.sleep(2000);
		commandcenter.setCommandCenterCode(CommandCenterCode);
		logger.info("Entered commandcenter code");
		Thread.sleep(2000);
		commandcenter.setCommandCenterName(CommandCenterName);
		logger.info("Entered command center name");
		Thread.sleep(2000);
		commandcenter.setCommandCenterShortName(CommandCenterShortName);
		logger.info("Entered command center shortname");
		Thread.sleep(2000);
		commandcenter.setCommandCenterMobileNo(CommandCenterMobileNo);
		logger.info("Entered command center mobile no");
		Thread.sleep(2000);
		commandcenter.setCommandCenterPincode(CommandCenterPincode);
		logger.info("Entered command center pincode");
		Thread.sleep(2000);
		commandcenter.setCommandCenterContactName(CommandCenterContactName);
		logger.info("Entered command center contact name");
		Thread.sleep(2000);
		commandcenter.clickOnSaveButton();
		logger.info("Clicked on the save button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(commandcenter.getActualResponseMessage1().contains(ExpectedResponseMessage));
		}
		
		commandcenter.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	}
	
	
	@Test(dataProvider="getCommandCenterData2")
	public void verifyCommandCenter2(
			String Username,
			String LoginOtp,
			String CommandCenterCode,
			String CommandCenterName,
			String CommandCenterShortName,
			String CommandCenterMobileNo,
			String CommandCenterPincode,
			String CommandCenterContactName, 
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on the home signin button");
		Thread.sleep(2000);
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		Thread.sleep(2000);
		commandcenter.clickOnMasterModule();
		logger.info("Clicked on the master module");
		Thread.sleep(2000);
		commandcenter.clickOnCommandCenter();
		logger.info("Clicked on command center form");
		Thread.sleep(2000);
		commandcenter.clickOnNewButton();
		logger.info("Clicked on new button");
		Thread.sleep(2000);
		commandcenter.setCommandCenterCode(CommandCenterCode);
		logger.info("Entered commandcenter code");
		Thread.sleep(2000);
		commandcenter.setCommandCenterName(CommandCenterName);
		logger.info("Entered command center name");
		Thread.sleep(2000);
		commandcenter.setCommandCenterShortName(CommandCenterShortName);
		logger.info("Entered command center shortname");
		Thread.sleep(2000);
		commandcenter.setCommandCenterMobileNo(CommandCenterMobileNo);
		logger.info("Entered command center mobile no");
		Thread.sleep(2000);
		commandcenter.setCommandCenterPincode(CommandCenterPincode);
		logger.info("Entered command center pincode");
		Thread.sleep(2000);
		commandcenter.setCommandCenterContactName(CommandCenterContactName);
		logger.info("Entered command center contact name");
		Thread.sleep(2000);
		commandcenter.clickOnSaveButton();
		logger.info("Clicked on the save button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(commandcenter.getActualResponseMessage2().contains(ExpectedResponseMessage));
		}
		
		commandcenter.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	
	}

}
