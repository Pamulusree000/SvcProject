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
	
	@DataProvider
	public Object [][] getDeletePatientDetailsData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientregistrationdelete");
		return data;
	}
	
	@DataProvider
	public Object [][] getAccountDeactivateStatusData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientregistrationdeactivate");
		return data;
	}
	
	@DataProvider
	public Object [][] getPatientUpdateData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientregistrationupdate");
		return data;
	}
	
	@DataProvider
	public Object [][] getPatientViewData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientregistrationview");
		return data;
	}
	
	
	
	

	@Test(dataProvider="getPatientRegistrationData",priority=1)
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
	
	

	
	@Test(dataProvider="getDeletePatientDetailsData",priority=5)
	public void verifyDeletePatientDetails(
			String Username,
			String Otp,
			String DeleteAccountSearch,
			String DeleteReason,
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
		patientregistration.setDeleteAccountSearch(DeleteAccountSearch);
		logger.info("Entered the required data in the search field");
		Thread.sleep(2000);
		patientregistration.clickOnGridDeleteButton();
		logger.info("Clicked on the grid delete button");
		Thread.sleep(2000);
		patientregistration.clickOnDeleteButton();
		logger.info("Clicked on the delete button");
		Thread.sleep(2000);
		Thread.sleep(2000);
		patientregistration.setDeleteReason(DeleteReason);
		logger.info("Entered the delete reason");
		Thread.sleep(2000);
		patientregistration.clickOnDeleteAccountButton();
		logger.info("Clicked on the delete account button");
		Thread.sleep(4000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(patientregistration.getActualDeleteResponseMessage().contains(ExpectedResponseMessage));
		}
		
		Thread.sleep(2000);
		patientregistration.clickOnDeleteConfirmOkButton();
		logger.info("Clicked on the delete confirm ok button");
	}
	
	
	@Test(dataProvider="getAccountDeactivateStatusData",priority=3)
	public void verifyPatientAccountStatus(
			
			String Username,
			String Otp,
			String AccountStatusSearch,
			String DeactivateReason,
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
		
		patientregistration.setAccountStatusSearch(AccountStatusSearch);
		logger.info("Entered the required details in the search box");
		Thread.sleep(2000);
		patientregistration.clickOnStatusToggleButton();
		logger.info("Clicked on the status toggle button");
		Thread.sleep(2000);
		patientregistration.clickOnDeactivateButton();
		logger.info("Clicked on ok deactivate button");
		Thread.sleep(2000);
		patientregistration.setDeactivateReason(DeactivateReason);
		logger.info("Entered the deactivate reason");
		Thread.sleep(2000);
		patientregistration.clickOnConfirmDeactivateButton();
		logger.info("Clicked on confirm deactivate button");
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic")) 
		{
			Assert.assertTrue(patientregistration.getActualDeactivateResponseMessage().contains(ExpectedResponseMessage));
		}
		
		patientregistration.clickOnDeactivateConfirmOkButton();
		logger.info("Clicked on the confirm ok button");

	}
	
	
	@Test(dataProvider="getPatientUpdateData",priority=2)
	public void verifyEditPatientDetails(
			
			String Username,
			String Otp,
			String EditSearch,
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
		patientregistration.setEditSearchBox(EditSearch);
		logger.info("Entered the required data in search box");
		Thread.sleep(2000);
		patientregistration.clickOnEditButton();
		logger.info("Clicked on edit button");
		Thread.sleep(2000);
		patientregistration.setEditPatientRegName(RegName);
		logger.info("Entered patient name");
		Thread.sleep(2000);
		patientregistration.setEditPatientRegAge(RegAge);
		logger.info("Entered patient age");
		Thread.sleep(2000);
		patientregistration.selectPatientRegRelationship(RegRelationship);
		logger.info("Selected the patient relationship");
		Thread.sleep(2000);
		patientregistration.setEditPatientRegRelationshipName(RegRelationshipName);
		logger.info("Entered pateint relationship name");
		Thread.sleep(2000);
		patientregistration.setEditPatientRegPincode(RegPincode);
		logger.info("Entered pincode");
		Thread.sleep(2000);
		patientregistration.selectPatientRegGender(RegGender);
		logger.info("Selected patient gender");
		Thread.sleep(2000);
		patientregistration.selectPatientRegReferredsvc(RegPreferredSvc);
		logger.info("Selected preferred svc");
		Thread.sleep(2000);
		patientregistration.clickOnUpdateButton();
		logger.info("Clicked on update button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(patientregistration.getUpdateResponseMessage().contains(ExpectedResponseMessage));
		}
		
		patientregistration.clickOnUpdateConfirmOkButton();
		logger.info("Clicked on ok button");
		Thread.sleep(2000);
	
	}
	
	@Test(dataProvider="getPatientViewData",priority=4)
	public void verifyViewPatientDetails(
			
			String Username,
			String Otp,
			String ViewPatientSearch
	
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
		patientregistration.setViewPatientSearch(ViewPatientSearch);
		logger.info("Search the required data in the search box");
		Thread.sleep(2000);
		patientregistration.clickOnViewButton();
		logger.info("Clicked on the view button");
		Thread.sleep(4000);
		patientregistration.clickOnCloseButton();
		logger.info("Clicked on the close button");
				
	}
	


}
