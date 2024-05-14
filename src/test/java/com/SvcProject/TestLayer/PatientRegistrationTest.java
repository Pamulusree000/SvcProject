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
		String username=signinviaotp.getUsername();
		logger.info("Username :"+username);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on signinviaotp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(Otp);
		String otp=signinviaotp.getOtp();
		logger.info("Otp :"+otp);
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
		String patientname=patientregistration.getPatientRegName();
		logger.info("Patient Name :"+patientname);
		Thread.sleep(2000);
		patientregistration.setPatientRegAge(RegAge);
		String patientage=patientregistration.getPatientRegAge();
		logger.info("PatientAge :"+patientage);
		Thread.sleep(2000);
		patientregistration.selectPatientRegRelationship(RegRelationship);
		String patientrelationship=patientregistration.getPatientRegRelationship();
		logger.info("PatientRelationship :"+patientrelationship);
		Thread.sleep(2000);
		patientregistration.setPatientRegRelationshipName(RegRelationshipName);
		String patientrelationshipname=patientregistration.getPatientRegRelationshipName();
		logger.info("Patient Relationship Name :"+patientrelationshipname);
		Thread.sleep(2000);
		patientregistration.setPatientRegPincode(RegPincode);
		String patientpincode=patientregistration.getPatientRegPincode();
		logger.info("Patient Pincode :"+patientpincode);
		Thread.sleep(2000);
		patientregistration.selectPatientRegGender(RegGender);
		String patientgender=patientregistration.getPatientRegGender();
		logger.info("Patient Gender :"+patientgender);
		Thread.sleep(2000);
		patientregistration.enterRegMobileNo(RegMobileno, RegOtp);
		String mobileno=patientregistration.getMobileNo();
		String mobileotp=patientregistration.getOtp();
		logger.info("Mobile No :"+mobileno);
		logger.info("Mobile Otp :"+mobileotp);
		Thread.sleep(2000);
		patientregistration.selectPatientRegReferredsvc(RegPreferredSvc);
		String preferredsvc=patientregistration.getPatientRegReferredsvc();
		logger.info("PreferredSvc :"+preferredsvc);
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
		String username=signinviaotp.getUsername();
		logger.info("Username :"+username);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on signinviaotp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(Otp);
		String otp=signinviaotp.getOtp();
		logger.info("Otp :"+otp);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		Thread.sleep(2000);
		patientregistration.clickOnPatientRegistrationLink();
		logger.info("Clicked on patient registration link");
		Thread.sleep(2000);
		patientregistration.setDeleteAccountSearch(DeleteAccountSearch);
		String deleteaccountsearch=patientregistration.getDeleteAccountSearch();
		logger.info("Delete Account Search :"+deleteaccountsearch);
		Thread.sleep(2000);
		patientregistration.clickOnGridDeleteButton();
		logger.info("Clicked on the grid delete button");
		Thread.sleep(2000);
		patientregistration.clickOnDeleteButton();
		logger.info("Clicked on the delete button");
		Thread.sleep(2000);
		Thread.sleep(2000);
		patientregistration.setDeleteReason(DeleteReason);
		String deletereason=patientregistration.getDeleteReason();
		logger.info("Delete Reason :"+deletereason);
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
		String username=signinviaotp.getUsername();
		logger.info("Username :"+username);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on signinviaotp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(Otp);
		String otp=signinviaotp.getOtp();
		logger.info("Otp :"+otp);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		Thread.sleep(2000);
		patientregistration.clickOnPatientRegistrationLink();
		logger.info("Clicked on patient registration link");
		Thread.sleep(2000);
		
		patientregistration.setAccountStatusSearch(AccountStatusSearch);
		String accountstatussearch=patientregistration.getAccountStatusSearch();
		logger.info("Account Status Search :"+accountstatussearch);
		Thread.sleep(2000);
		patientregistration.clickOnStatusToggleButton();
		logger.info("Clicked on the status toggle button");
		Thread.sleep(2000);
		patientregistration.clickOnDeactivateButton();
		logger.info("Clicked on ok deactivate button");
		Thread.sleep(2000);
		patientregistration.setDeactivateReason(DeactivateReason);
		String deactivatereason=patientregistration.getDeactivateReason();
		logger.info("Deactivate Reason :"+deactivatereason);
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
		String username=signinviaotp.getUsername();
		logger.info("Username :"+username);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on signinviaotp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(Otp);
		String otp=signinviaotp.getOtp();
		logger.info("Otp :"+otp);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		Thread.sleep(2000);
		patientregistration.clickOnPatientRegistrationLink();
		logger.info("Clicked on patient registration link");
		Thread.sleep(2000);
		patientregistration.setEditSearchBox(EditSearch);
		String editsearchbox=patientregistration.getEditSearchBoxSearch();
		logger.info("Edit Search Box :"+editsearchbox);
		Thread.sleep(2000);
		patientregistration.clickOnEditButton();
		logger.info("Clicked on edit button");
		Thread.sleep(2000);
		patientregistration.setEditPatientRegName(RegName);
		String editpatientname=patientregistration.getEditPatientRegName();
		logger.info("Edited Patient Name :"+editpatientname);
		Thread.sleep(2000);
		patientregistration.setEditPatientRegAge(RegAge);
		String editpatientage=patientregistration.getEditPatientRegAge();
		logger.info("Edit Patient Age :"+editpatientage);
		Thread.sleep(2000);
		patientregistration.selectPatientRegRelationship(RegRelationship);
		String editpatientrelationship=patientregistration.getPatientRegRelationship();
		logger.info("Edit Patient Relationship :"+editpatientrelationship);
		Thread.sleep(2000);
		patientregistration.setEditPatientRegRelationshipName(RegRelationshipName);
		String editrelationshipname=patientregistration.getEditPatientRegRelationshipName();
		logger.info("Edit Patient Relationship Name :"+editrelationshipname);
		Thread.sleep(2000);
		patientregistration.setEditPatientRegPincode(RegPincode);
		String editpatientpincode=patientregistration.getEditPatientRegPincode();
		logger.info("Edit Patient Pincode :"+editpatientpincode);
		Thread.sleep(2000);
		patientregistration.selectPatientRegGender(RegGender);
		String editpatientgender=patientregistration.getPatientRegGender();
		logger.info("Edit Patient Gender :"+editpatientgender);
		Thread.sleep(2000);
		patientregistration.selectPatientRegReferredsvc(RegPreferredSvc);
		String editpatientpreferredsvc=patientregistration.getPatientRegReferredsvc();
		logger.info("Edit Patient PreferredSvc :"+editpatientpreferredsvc);
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
		String username=signinviaotp.getUsername();
		logger.info("Username :"+username);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on signinviaotp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(Otp);
		String otp=signinviaotp.getOtp();
		logger.info("Otp :"+otp);
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		Thread.sleep(2000);
		patientregistration.clickOnPatientRegistrationLink();
		logger.info("Clicked on patient registration link");
		Thread.sleep(2000);
		patientregistration.setViewPatientSearch(ViewPatientSearch);
		String viewpatientsearch=patientregistration.getViewPatientSearch();
		logger.info("Searched Patient :"+viewpatientsearch);
		Thread.sleep(2000);
		patientregistration.clickOnViewButton();
		logger.info("Clicked on the view button");
		Thread.sleep(4000);
		patientregistration.clickOnCloseButton();
		logger.info("Clicked on the close button");
				
	}
	


}
