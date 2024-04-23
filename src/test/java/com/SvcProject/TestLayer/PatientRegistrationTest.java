package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class PatientRegistrationTest  extends TestBase{

	@DataProvider
	public Object [][]getPatientRegistrationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientregistration");
		return data;
	}
	
	
	
	@Test(dataProvider="getPatientRegistrationData")
	public void verifyPatientRegistration(
			String Username,
			String Otp,
			String RegName,
			String RegAge,
			String RegRelationship,
			String RegRelationshipName,
			String RegPincode,
			String RegGender,
			String RegMobileno,
			String RegOtp,
			String RegPreferredSvc,
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
		signinviaotp.setOTP(Otp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		Thread.sleep(2000);
		patientregistration.clickOnPatientRegistrationLink();
		logger.info("Clicked on patient registration link");
		Thread.sleep(2000);
		patientregistration.clickOnAddPatientBtn();
		logger.info("Clicked on add patient button");
		Thread.sleep(2000);
		patientregistration.setPatientRegName(RegName);
		logger.info("Entered patient name");
		Thread.sleep(2000);
		patientregistration.setPatientRegAge(RegAge);
		logger.info("Entered patient age");
		Thread.sleep(2000);
		patientregistration.selectPatientRegRelationship(RegRelationship);
		logger.info("Selected the patient relationship");
		Thread.sleep(2000);
		patientregistration.setPatientRegRelationshipName(RegRelationshipName);
		logger.info("Entered pateint relationship name");
		Thread.sleep(2000);
		patientregistration.setPatientRegPincode(RegPincode);
		logger.info("Entered pincode");
		Thread.sleep(2000);
		patientregistration.selectPatientRegGender(RegGender);
		logger.info("Selected patient gender");
		Thread.sleep(2000);
		patientregistration.enterRegMobileNo(RegMobileno, RegOtp);
		logger.info("Entered mobile no and Verified mobile  no with otp");
		Thread.sleep(2000);
		patientregistration.selectPatientRegReferredsvc(RegPreferredSvc);
		logger.info("Selected preferred svc");
		Thread.sleep(2000);
		patientregistration.clickOnPatientRegSaveBtn();
		logger.info("Clicked on save button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(patientregistration.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		patientregistration.clickOnPatientSuccessfullOkBtn();
		logger.info("Clicked on ok button");
		Thread.sleep(2000);
	}
	

}
