package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class DeviceStatusTest extends TestBase {

	
	@DataProvider
	public Object [][] getDeviceStatusData1() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("devicestatus1");
		return data;
	}
	
	@DataProvider
	public Object [][] getDeviceStatusData2() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("devicestatus2");
		return data;
	}
	
	
	@Test(dataProvider="getDeviceStatusData1",priority=1)
	public void verifyDeviceStatusScenario1(
			String Username,
			String LoginOtp,
			String Comments,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		devicestatus.clickOnDeviceStatus();
		logger.info("Clicked on device status");
		devicestatus.clickOnUpdateButton();
		logger.info("Clicked on update button");
		Thread.sleep(3000);
		devicestatus.clickOnDeviceStatusToggleButton();
		logger.info("Clicked on device status toggle button");
		devicestatus.setCommentsTextBox(Comments);
		logger.info("Entered the comments");
		devicestatus.clickOnSaveButton();
		logger.info("Clicked on save button");
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(devicestatus.getActualResponseMessage1().contains(ExpectedResponseMessage));
		}
		
		devicestatus.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
	
	}
	
	@Test(dataProvider="getDeviceStatusData2",priority=2)
	public void verifyDeviceStatusScenario2(
			String Username,
			String LoginOtp,
			String Comments,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		devicestatus.clickOnDeviceStatus();
		logger.info("Clicked on device status");
		devicestatus.clickOnUpdateButton();
		logger.info("Clicked on update button");
		Thread.sleep(3000);
		devicestatus.clickOnDeviceStatusToggleButton();
		logger.info("Clicked on device status toggle button");
		devicestatus.setCommentsTextBox(Comments);
		logger.info("Entered the comments");
		devicestatus.clickOnSaveButton();
		logger.info("Clicked on save button");
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(devicestatus.getActualResponseMessage2().contains(ExpectedResponseMessage));
		}
		
		devicestatus.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
	
	}
	
}
