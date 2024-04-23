package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class SpecializationTest extends TestBase{

	
	@DataProvider
	public Object [][] getSpecializationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("specialization");
		return data;
	}
	
	
	@Test(dataProvider="getSpecializationData")
	public void verifySpecialization(
			String Username,
			String LoginOtp,
			String SpecializationName,
			String SpecializationDescription,
			String SpecializationAliasName,
			String SpecializationNoOfSlots,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home signin button");
		Thread.sleep(2000);
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on signin via otp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		Thread.sleep(2000);
		specialization.clickOnAdminModule();
		logger.info("Clicked on admin module");
		Thread.sleep(2000);
		specialization.clickOnSpecialization();
		logger.info("Clicked on specialization form");
		Thread.sleep(2000);
		specialization.clickOnNewButton();
		logger.info("Clicked on new button");
		Thread.sleep(2000);
		specialization.setSpecializationName(SpecializationName);
		logger.info("Entered specialization name");
		Thread.sleep(2000);
		specialization.setSpecializationDescription(SpecializationDescription);
		logger.info("Entered specialization description");
		Thread.sleep(2000);
		specialization.setSpecializationAliasName(SpecializationAliasName);
		logger.info("Entered specialization aliasname");
		Thread.sleep(2000);
		specialization.setSpecializationNoOfSlots(SpecializationNoOfSlots);
		logger.info("Entered no of slots requried");
		Thread.sleep(2000);
		specialization.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(specialization.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		specialization.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		Thread.sleep(2000);
			
	}
	
	

}
