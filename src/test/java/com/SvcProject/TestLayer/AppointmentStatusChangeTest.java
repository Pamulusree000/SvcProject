package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class AppointmentStatusChangeTest extends TestBase{

	
	@DataProvider
	public Object[][] getAppointmentStatusChangeData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("appointmentstatuschange");
		return data;
	}

	
	@Test(dataProvider="getAppointmentStatusChangeData")
	public void verifyAppointmentStatusChange(
			String Username,
			String LoginOtp,
			String SvcName,
			String Search,
			String StatusType,
			String Reason,
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
		
		
		appointmentstatuschange.clickOnSupportModuleLink();
		logger.info("Clicked on support module link");
		Thread.sleep(2000);
		appointmentstatuschange.clickOnAppointmentStatusChangeForm();
		logger.info("Clicked on appointmentstatuschange form ");
		Thread.sleep(2000);
		appointmentstatuschange.selectSvcName(SvcName);
		logger.info("Selected the svc name");
		Thread.sleep(2000);
		appointmentstatuschange.setSearch(Search);
		logger.info("Search the required data");
		Thread.sleep(2000);
		appointmentstatuschange.clickOnRevertStatusLink();
		logger.info("Clicked on the revert status link");
		Thread.sleep(2000);
		appointmentstatuschange.selectStatusType(StatusType);
		logger.info("Selected the status type");
		Thread.sleep(2000);
		appointmentstatuschange.setReason(Reason);
		logger.info("Entered the reason");
		Thread.sleep(2000);
		appointmentstatuschange.clickOnUpdateButton();
		logger.info("Clicked on the update button");
		Thread.sleep(2000);
		appointmentstatuschange.clickOnYesButton();
		logger.info("Clicked on the yes button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(appointmentstatuschange.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		appointmentstatuschange.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
		appointmentstatuschange.selectSvcName(SvcName);
		logger.info("Selected the svc name");
		Thread.sleep(2000);
			
	}
	
	
}
