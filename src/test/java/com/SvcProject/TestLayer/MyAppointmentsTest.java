package com.SvcProject.TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class MyAppointmentsTest extends TestBase {

	
	@DataProvider
	public Object[][] getMyAppointmentsData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("myappointments");
		return data;
	}

	@Test(dataProvider="getMyAppointmentsData")
	public void verifyMyAppointments(
			String Username,
			String LoginOtp,
			String FromDate,
			String ToDate
			) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		logger.info("clicked on home signin button");
		Thread.sleep(2000);		
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("clicked on sign in via otp button");
		Thread.sleep(2000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		signinviaotp.clickOnSignInButton();
		logger.info("clicked on signin button");
		Thread.sleep(3000);
		
		myappointments.clickOnMyAppointmentlink();
		logger.info("Clicked on my appointment form ");
		Thread.sleep(2000);
		myappointments.selectFromDate(FromDate);
		logger.info("Selected from date");
		Thread.sleep(3000);
		myappointments.selectToDate(ToDate);
		logger.info("Selected to date");
		Thread.sleep(2000);
		myappointments.clickOnUpcomingTab();
		logger.info("Clicked on upcoming tab");
		Thread.sleep(2000);
		myappointments.clickOnCompletedTab();
		logger.info("Clicked on completed tab");
		Thread.sleep(2000);
		myappointments.clickOnCancelledTab();
		logger.info("Clicked on cancelled tab");
		Thread.sleep(2000);
		myappointments.clickOnAllTab();
		logger.info("Clicked on all tab");
		Thread.sleep(2000);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
