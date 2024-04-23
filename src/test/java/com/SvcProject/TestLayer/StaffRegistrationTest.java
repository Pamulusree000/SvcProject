package com.SvcProject.TestLayer;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class StaffRegistrationTest extends TestBase {
	
	
	@DataProvider
	public Object [][]getStaffRegistrationData() throws Exception
	{
		Object [][]data=ReadExcelData.excelTestData("staffregistration");
		return data;
				
	}


	
	@Test(dataProvider="getStaffRegistrationData")
	public void verifyStaffRegistration(
			String Username,
			String LoginOtp,
			String StaffName,
			String StaffGender,
			String StaffMaritalStatus,
			String StaffAadharNo,
			String StaffMobileNo,
			String Otp,
			String StaffEmailId,
			String StaffRole,
			String Svc,
			String StaffCountry,
			String StaffState,
			String StaffCity,
			String StaffHouseNo,
			String StaffStreet,
			String StaffAreaName,
			String StaffPincode,
			String StaffCollege,
			String StaffDegree,
			String StaffYear,
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
		staffregistration.clickOnAdminModule();
		logger.info("Clicked on admin module");
		Thread.sleep(2000);
		staffregistration.clickOnStaffRegistration();
		logger.info("Clicked on staff registration form");
		Thread.sleep(2000);
		staffregistration.clickOnAddStaffbutton();
		logger.info("Clicked on add staff button");
		Thread.sleep(2000);
		staffregistration.setStaffName(StaffName);
		logger.info("Entered staffname");
		Thread.sleep(2000);
		staffregistration.selectStaffGender(StaffGender);
		logger.info("Selected staff gender");
		Thread.sleep(2000);
		staffregistration.selectStaffMaritalStatus(StaffMaritalStatus);
		logger.info("Selected staff marital status");
		Thread.sleep(2000);
		staffregistration.setStaffAadharNo(StaffAadharNo);
		logger.info("Entered staff Aadhar no");
		Thread.sleep(2000);
		staffregistration.setStaffMobileNo(StaffMobileNo, Otp);
		logger.info("Entered staff mobile no and verified otp");
		Thread.sleep(2000);
		staffregistration.setStaffEmailId(StaffEmailId);
		logger.info("Entered staff email id");
		Thread.sleep(2000);
		staffregistration.selectStaffRole(StaffRole);
		logger.info("Selected staff role");
		Thread.sleep(2000);
		staffregistration.selectSvc(Svc);
		logger.info("Selected svc");
		Thread.sleep(2000);
		staffregistration.selectStaffCountry(StaffCountry);
		logger.info("Selected staff country");
		Thread.sleep(2000);
		staffregistration.selectStaffState(StaffState);
		logger.info("Selected staff state");
		Thread.sleep(2000);
		staffregistration.selectStaffCity(StaffCity);
		logger.info("Selected staff city");
		Thread.sleep(2000);
		staffregistration.setStaffHouseNo(StaffHouseNo);
		logger.info("Entered staff house no");
		Thread.sleep(2000);
		staffregistration.setStaffStreet(StaffStreet);
		logger.info("Entered staff street");
		Thread.sleep(2000);
		staffregistration.setStaffAreaName(StaffAreaName);
		logger.info("Entered staff area name");
		Thread.sleep(2000);
		staffregistration.setStaffPincode(StaffPincode);
		logger.info("Entered staff pincode");
		Thread.sleep(2000);
		staffregistration.setStaffCollege(StaffCollege);
		logger.info("Entered staff college");
		Thread.sleep(2000);
		staffregistration.selectStaffDegree(StaffDegree);
		logger.info("Selected staff degree");
		Thread.sleep(2000);
		staffregistration.selectStaffYear(StaffYear);
		logger.info("Selected staff year for completed degree");
		Thread.sleep(2000);
		staffregistration.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(staffregistration.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		staffregistration.clickOnConfirmOkButton();
		logger.info("Clicked on the confirm ok button");
		Thread.sleep(2000);
		


	}
	
	
}
