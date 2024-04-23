package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class PatientProfileTest extends TestBase {

	
	@DataProvider
	public Object [][] getPatientProfiledata () throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("patientprofile");
		return data;
		
	}

	@Test (dataProvider="getPatientProfiledata")
	public void verifyPatientProfile(
			String Username,
			String Password,
			String Name,
			String Age,
			String Relationship,
			String RelationshipName,
			String Pincode,
			String Gender,
			String PreferredSvc,
			String ExpectedTitle,
			String ExpectedResponseMessage,
			String HeightFt,
			String HeightInches,
			String ExpectedHeightResponseMessage,
			String Weight,
			String ExpectedWeightResponseMessage,
			String Readings,
			String Type,
			String ExpectedBGResponseMessage,
			String Systolic,
			String Diastolic,
			String ExpectedBPResponseMessage,
			String FamilyMedicalRelationship,
			String Condition,
			String ExpectedFamilyMedicalHistoryResponseMessage,
			String Allergy,
			String AllergyType,
			String AllergyReaction,
			String ExpectedAllergyResponseMessage,
			String TotalCholesterol,
			String ExpectedCholesterolResponseMessage,
			String LockerOtp,
			String DocumentType1,
			String DocumentType2,
			String DocumentType3,
			String DocumentType4,
			String ExpectedAddResponseMessage,
			String ExpectedUploadFileResponseMessage
			
			) throws Exception
	{
		
		signin.clickOnSigninButton();
		logger.info("Clicked on home signin button");
		Thread.sleep(2000);
		signin.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		signin.setPassword(Password);
		logger.info("Entered Password");
		Thread.sleep(2000);
		signin.clickOnLoginbutton();
		logger.info("Clicked on login button");
		Thread.sleep(3000);
		patientprofile.clickOnMyProfileLink();
		logger.info("Clicked on my profile link");
		Thread.sleep(2000);
		patientprofile.clickOnUpdateProfileBtn();
		logger.info("Clicked on update profile button");
		Thread.sleep(2000);
	
		patientprofile.setPatientName(Name);
		logger.info("Entered patient name");
		Thread.sleep(2000);
		patientprofile.setAge(Age);
		logger.info("Entered patient age");
		Thread.sleep(2000);
		patientprofile.selectRelationship(Relationship);
		logger.info("Selected patient relationship");
		Thread.sleep(2000);
		patientprofile.setRelationshipname(RelationshipName);
		logger.info("Entered relationship name");
		Thread.sleep(2000);
		patientprofile.setPincode(Pincode);
		logger.info("Entered pincode");
		Thread.sleep(2000);
		//patientprofile.enterMobileNo("8459685968", "otp");
		patientprofile.selectGender(Gender);
		logger.info("Selected Gender");
		Thread.sleep(2000);
		patientprofile.selectPreferedSvc(PreferredSvc);
		logger.info("Selected preferred svc");
		Thread.sleep(2000);
		patientprofile.clickOnUpdateBtn();
		logger.info("Clicked on update button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(patientprofile.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		patientprofile.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		Thread.sleep(2000);
		
		//height
		patientprofile.setHeight(HeightFt, HeightInches);
		logger.info("Entered height and Clicked on save button");
		Thread.sleep(2000);
		
		Assert.assertTrue(patientprofile.getActualRecordDataResponseMessages().contains(ExpectedHeightResponseMessage));
		
		Thread.sleep(2000);
		patientprofile.clickOnRecordDataConfirmOkButton();
		
		//weight
		patientprofile.setWeight(Weight);
		logger.info("Entered weight and Clicked on save button");
		Thread.sleep(2000);
		
		Assert.assertTrue(patientprofile.getActualRecordDataResponseMessages().contains(ExpectedWeightResponseMessage));
		Thread.sleep(2000);
		patientprofile.clickOnRecordDataConfirmOkButton();
		
		//blood glucose
		
		patientprofile.setBloodGlucose(Readings, Type);
		logger.info("Entered blood glucose and Clicked on save button");
		Thread.sleep(2000);
		
		Assert.assertTrue(patientprofile.getActualRecordDataResponseMessages().contains(ExpectedBGResponseMessage));
		Thread.sleep(2000);
		patientprofile.clickOnRecordDataConfirmOkButton();
		
		//blood pressure
		
		patientprofile.setBloodPressure(Systolic, Diastolic);
		logger.info("Entered blood pressue and Clicked on save button");
		Thread.sleep(2000);
		
		Assert.assertTrue(patientprofile.getActualRecordDataResponseMessages().contains(ExpectedBPResponseMessage));
		Thread.sleep(2000);
		patientprofile.clickOnRecordDataConfirmOkButton();
		
		//family history
		
		patientprofile.setFamilyHistory(FamilyMedicalRelationship, Condition);
		logger.info("Entered family medical history and Clicked on save button");
		Thread.sleep(2000);
		
		Assert.assertTrue(patientprofile.getActualRecordDataResponseMessages().contains(ExpectedFamilyMedicalHistoryResponseMessage));
		Thread.sleep(2000);
		patientprofile.clickOnRecordDataConfirmOkButton();
		
		//Allergy
		
		patientprofile.setAllergy(Allergy, AllergyType, AllergyReaction);
		logger.info("Entered Allergy and Clicked on save button");
		Thread.sleep(2000);
		
		Assert.assertTrue(patientprofile.getActualRecordDataResponseMessages().contains(ExpectedAllergyResponseMessage));
		Thread.sleep(2000);
		patientprofile.clickOnRecordDataConfirmOkButton();
		
		//Cholesterol
		
		patientprofile.setCholesterol(TotalCholesterol);
		logger.info("Entered Cholesterol and Clicked on save button");
		Thread.sleep(2000);
		
		Assert.assertTrue(patientprofile.getActualRecordDataResponseMessages().contains(ExpectedCholesterolResponseMessage));
		Thread.sleep(2000);
		patientprofile.clickOnRecordDataConfirmOkButton();
		
		//HealthLocker
		
		patientprofile.setHealthLockerDocuments(LockerOtp);
		logger.info("Clicked on healthlocker tab and Entered otp ");
		Thread.sleep(2000);
		
		String[] DocumentType = {DocumentType1, DocumentType2, DocumentType3, DocumentType4};
		
		patientprofile.UploadDocuments(DocumentType, ExpectedAddResponseMessage, ExpectedUploadFileResponseMessage);
		logger.info("Selected the documents and uploaded the documents");	
		
	}
	
	
}
