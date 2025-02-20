package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class SvcRegistrationTest extends TestBase{
	
	@DataProvider
	public Object [][] getSvcRegistrationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("svcregistration");
		return data;
	}
	
	@Test(dataProvider="getSvcRegistrationData")
	public void verifySvcRegistration(
			String Username,
			String LoginOtp,
			String SvcCode,
			String SvcName,
			String SvcShortName,
			String SvcAddress,
			String SvcLandMark,
			String SvcMobileNo,
			String SvcConstitency,
			String SvcWard,
			String SvcPincode,
			String SvcContactName,
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
		logger.info("Clicked on signinviaotp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		Thread.sleep(2000);
		svcregistration.clickOnAdmin();
		logger.info("Clicked on admin module");
		Thread.sleep(2000);
		svcregistration.clickOnStaffRegistration();
		logger.info("Clicked on staff registration link");
		Thread.sleep(2000);
		svcregistration.clickOnCreateSvcButton();
		logger.info("Clicked on create svc button");
		Thread.sleep(2000);
		svcregistration.setSvcCode(SvcCode);
		logger.info("Entered svc code");
		Thread.sleep(2000);
		svcregistration.setSvcName(SvcName);
		logger.info("Entered svc name");
		Thread.sleep(2000);
		svcregistration.setSvcShortName(SvcShortName);
		logger.info("Entered svc shortname");
		Thread.sleep(2000);
		svcregistration.setSvcAddress(SvcAddress);
		logger.info("Entered svcaddress");
		Thread.sleep(2000);
		svcregistration.setSvcLandMark(SvcLandMark);
		logger.info("Entered svclandmark");
		Thread.sleep(2000);
		svcregistration.setSvcMobileNo(SvcMobileNo);
		logger.info("Entered svc mobileno");
		Thread.sleep(2000);
		svcregistration.selectSvcConstituency(SvcConstitency);
		logger.info("Selected svc constitency");
		Thread.sleep(4000);
		svcregistration.selectSvcWard(SvcWard);
		logger.info("Selected svcward");
		Thread.sleep(2000);
		svcregistration.setSvcPincode(SvcPincode);
		logger.info("Entered svc pincode");
		Thread.sleep(2000);
		svcregistration.setSvcContactName(SvcContactName);
		logger.info("Entered svc contact name");
		Thread.sleep(2000);
		svcregistration.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(svcregistration.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		svcregistration.clickOnConfirmOkButton();
		
	}
	

}
