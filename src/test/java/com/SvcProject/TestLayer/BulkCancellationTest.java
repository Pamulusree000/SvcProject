package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class BulkCancellationTest extends TestBase{

	@DataProvider
	public Object [][] getBulkCancellationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("bulkcancellation");
		return data;
	}
	

	@Test(dataProvider="getBulkCancellationData")
	public void verifyBulkCancellation(
			String Username,
			String LoginOtp,
			String Doctor,
			String Phc,
			String DatePicker,
			String AppointmentNumber,
			String ExpectedTitle,
			String ExpectedResponseMessage
			
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("clicked on home signin button");
		Thread.sleep(3000);		
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(3000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("clicked on sign in via otp button");
		Thread.sleep(3000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		Thread.sleep(3000);
		signinviaotp.clickOnSignInButton();
		logger.info("clicked on signin button");
		Thread.sleep(3000);
		
		bulkcancellation.clickOnOthersModuleLink();
		logger.info("Clicked on the others module link");
		Thread.sleep(2000);
		bulkcancellation.clickOnBulkCancellationForm();
		logger.info("Clicked on bulk cancellation form");
		Thread.sleep(2000);
		bulkcancellation.clickOnNewButton();
		logger.info("Clicked on new button");
		Thread.sleep(2000);
		bulkcancellation.selectDoctor(Doctor);
		logger.info("Selected the doctor from drop down");
		Thread.sleep(2000);
		bulkcancellation.selectPhc(Phc);
		logger.info("Selected the phc from drop down");
		Thread.sleep(2000);
		bulkcancellation.selectDate(DatePicker);
		logger.info("Selected the required date");
		Thread.sleep(2000);
		bulkcancellation.clickOnLoadButton();
		logger.info("Clicked on the load button");
		Thread.sleep(2000);
		bulkcancellation.selectCheckBoxOnBasisOfAppointmentNumber(AppointmentNumber);
		logger.info("Selected the checkbox for the required appointment number");
		Thread.sleep(2000);
		bulkcancellation.clickOnCancelAppointmentButton();
		logger.info("Clicked on the cancel appointment button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(bulkcancellation.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		bulkcancellation.clickOnConfirmOkButton();
		logger.info("Clicked on the Confirm ok button");
		
	}
	
}
