package com.SvcProject.TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class SlotConfigurationTest extends TestBase{

	@DataProvider
	public Object [][]slotConfigurationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("slotconfiguration");
		return data;
	}
	
	
	
	@Test(dataProvider="slotConfigurationData")
	public void verifySlotConfiguration(
			String Username,
			String LoginOtp,
			String FromTime,
			String ToTime,
			String TimeInterval,
			String Date
			) throws InterruptedException
	{
		
	
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home signin button");
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		slotconfiguration.clickOnMasterModule();
		logger.info("Clicked on master module");
		slotconfiguration.clickOnSlotConfiguration();
		logger.info("Clicked on slot configuration");
		slotconfiguration.setFromTime(FromTime);
		logger.info("Entered from time");
		slotconfiguration.setToTime(ToTime);
		logger.info("Entered to time");
		slotconfiguration.setTimeInterval(TimeInterval);
		logger.info("Entered time interval");
		slotconfiguration.selectDatePicker(Date);
		logger.info("Selected date");
		slotconfiguration.clickOnUpdateButton();
		logger.info("Clicked on update button");
		Thread.sleep(2000);
		slotconfiguration.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		Thread.sleep(2000);
		slotconfiguration.clickOnHealthCenterSlotButton();
		logger.info("Clicked on health center slot button");
		Thread.sleep(3000);
		slotconfiguration.clickOnHealthCenterStatusButton();
		logger.info("Clicked on health center status button");
		slotconfiguration.clickOnHealthCenterSlotSaveButton();
		logger.info("Clicked on health cetner slot save button");
		Thread.sleep(2000);
		slotconfiguration.clickOnHealthCenterConfirmOkButton();
		logger.info("Clicked on health center confirm ok button");
		Thread.sleep(2000);
		slotconfiguration.clickOnDoctorSlotButton();
		logger.info("Clicked on doctor slot button");
		Thread.sleep(3000);
		slotconfiguration.clickOnDoctorStatusButton();
		logger.info("Clicked on docotr status button");
		slotconfiguration.clickOnDoctorSlotSaveButton();
		logger.info("Clicked on doctor slot save button");
		Thread.sleep(2000);
		slotconfiguration.clickOnDoctorSlotConfrimOkButton();
		logger.info("Clicked on doctor slot confirm ok button");
		Thread.sleep(2000);
	
		
	}	
	
}
