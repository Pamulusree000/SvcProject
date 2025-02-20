package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class DoctorProfileTest extends TestBase {

	
	@DataProvider 
	public Object [][] getDoctorProfileData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("doctorprofile");
		return data;
	}

	
	@Test(dataProvider="getDoctorProfileData")
	public void verifyDoctorProfile(
			String Username,
			String UserOtp,
			String DoctorName,
			String Gender,
			String MobileNo,
			String Otp,
			String EmailId,
			String DateOfBirth,
			String Country,
			String State,
			String District,
			String Pincode,
			String Specialization,
			String LicenseNo,
			String LicenseCountry,
			String LicenseState,
			String DoctorType,
			String CommandCenter,
			String DoctorCollege,
			String Degree,
			String Year,
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
		signinviaotp.setOTP(UserOtp);
		logger.info("Entered user otp");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		Thread.sleep(2000);
		doctorprofile.clickOnDoctorProfileLink();
		logger.info("Clicked on doctor profile link");
		Thread.sleep(2000);
		doctorprofile.clickOnUpdateProfileButton();
		logger.info("Clicked on add doctor profile button");
		Thread.sleep(2000);
		doctorprofile.setDoctorName(DoctorName);
		logger.info("Entered doctor name");
		Thread.sleep(2000);
		doctorprofile.selectgender(Gender);
		logger.info("Entered Gender");
		Thread.sleep(2000);
		doctorprofile.setMobileNo(MobileNo, Otp);
		logger.info("Entered mobile no and verified otp");
		Thread.sleep(2000);
		doctorprofile.setEmailId(EmailId);
		logger.info("Entered email id");
		Thread.sleep(2000);
		doctorprofile.selectDateOfBirth(DateOfBirth);
		logger.info("Selected date of birth");
		Thread.sleep(2000);
		doctorprofile.selectCountry(Country);
		logger.info("Selected country");
		Thread.sleep(2000);
		doctorprofile.selectState(State);
		logger.info("Selected State");
		Thread.sleep(2000);
		doctorprofile.selectDistrict(District);
		logger.info("Selected district");
		Thread.sleep(2000);
		doctorprofile.setPincode(Pincode);
		logger.info("Enterd pincode");
		Thread.sleep(2000);
		doctorprofile.selectSpecialization(Specialization);
		logger.info("Selected Specialization");
		Thread.sleep(2000);
		doctorprofile.setLicenseNo(LicenseNo);
		logger.info("Entered license no");
		Thread.sleep(2000);
		doctorprofile.selectLicenseCountry(LicenseCountry);
		logger.info("Selected license country");
		Thread.sleep(2000);
		doctorprofile.selectLicenseState(LicenseState);
		logger.info("Selected license state");
		Thread.sleep(2000);
		doctorprofile.selectDoctorType(DoctorType);
		logger.info("Selected doctor type");
		Thread.sleep(2000);
		doctorprofile.clickOnVirtualClinicToggleBtn();
		logger.info("Clicked on virtual clinic toggle button");
		Thread.sleep(2000);
		doctorprofile.selectCommandCenter(CommandCenter);
		logger.info("Selected command center");
		Thread.sleep(2000);
		doctorprofile.setDoctorCollge(DoctorCollege);
		logger.info("Entered doctor college");
		Thread.sleep(2000);
		doctorprofile.selectDegree(Degree);
		logger.info("Selected doctor degree");
		Thread.sleep(2000);
		doctorprofile.selectYear(Year);
		logger.info("Selected year completed of degree");
		Thread.sleep(2000);
		doctorprofile.clickOnSaveBtn();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(doctorprofile.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
	
		doctorprofile.clickOnOkBtn();
		logger.info("Clicked on confirm ok button");
		
	}
	
	
}
