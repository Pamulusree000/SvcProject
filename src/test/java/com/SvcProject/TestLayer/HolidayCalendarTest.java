package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class HolidayCalendarTest extends TestBase{

	
	@DataProvider
	public Object[][] getHolidayCalendarDate() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("holidaycalendar");
		return data;
	}
	
	@DataProvider
	public Object[][] getHolidayCalendarStatusData() throws Exception
	{
		Object[][] data=ReadExcelData.excelTestData("holidaycalendarstatus");
		return data;
	}

	@DataProvider
	public Object[][] getHolidayCalendarEditData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("holidaycalendaredit");
		return data;
	}
	
	
	@Test(dataProvider="getHolidayCalendarDate",priority=1)
	public void verifyHolidayCalendar(
			String Username,
			String LoginOtp,
			String HolidayDate,
			String HolidayDescription,
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
		
		holidaycalendar.clickOnAdminModuleLink();
		logger.info("Clicked on the Admin Module ");
		Thread.sleep(2000);
		holidaycalendar.clickOnHolidayCalendar();
		logger.info("Clicked on the holiday Calendar");
		Thread.sleep(2000);
		holidaycalendar.clickOnAddHolidayButton();
		logger.info("Clicked on the add holiday button");
		Thread.sleep(2000);
		holidaycalendar.selectHolidayDate(HolidayDate);
		logger.info("Selected the holiday date");
		Thread.sleep(2000);
		holidaycalendar.setHolidayDescription(HolidayDescription);
		logger.info("Entered the holiday description");
		Thread.sleep(2000);
		holidaycalendar.clickOnSaveButton();
		logger.info("Clicked on the save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(holidaycalendar.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		holidaycalendar.clickOnConfirmOkButton();
		logger.info("Clicked on the confirm ok button");
	}
	

	
	@Test(dataProvider="getHolidayCalendarStatusData",priority=2)
	public void verifyHolidayCalendarStatus(
			String Username,
			String LoginOtp,
			String SearchBox,
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
		
		holidaycalendar.clickOnAdminModuleLink();
		logger.info("Clicked on the Admin Module ");
		Thread.sleep(2000);
		holidaycalendar.clickOnHolidayCalendar();
		logger.info("Clicked on the holiday Calendar");
		Thread.sleep(2000);
		holidaycalendar.setSearchBox(SearchBox);
		logger.info("Entered the required data in the search box");
		Thread.sleep(2000);
		holidaycalendar.clickOnStatusToggleButton();
		logger.info("Clicked on the toggle button");
		Thread.sleep(2000);
		holidaycalendar.clickOnYesButton();
		logger.info("Clicked on the yes button");
		Thread.sleep(2000);
		holidaycalendar.setReason(Reason);
		logger.info("Entered the reason");
		Thread.sleep(2000);
		holidaycalendar.clickOnStatusSaveButton();
		logger.info("Clicked on the save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(holidaycalendar.getStatusActualResponseMessage().contains(ExpectedResponseMessage));
		}
		holidaycalendar.clickOnStatusOkConfirmButton();
		logger.info("Clicked on the confirm button");
	
	}
	
	
	@Test(dataProvider="getHolidayCalendarEditData")
	public void verifyHolidayCalendarUpdate(
			String Username,
			String LoginOtp,
			String SearchBox,
			String HolidayDate,
			String EditDescription,
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
		
		holidaycalendar.clickOnAdminModuleLink();
		logger.info("Clicked on the Admin Module ");
		Thread.sleep(2000);
		holidaycalendar.clickOnHolidayCalendar();
		logger.info("Clicked on the holiday Calendar");
		Thread.sleep(2000);
		holidaycalendar.setSearchBox(SearchBox);
		logger.info("Entered the required data in the search box");
		Thread.sleep(2000);
		holidaycalendar.clickOnEditButton();
		logger.info("Clicked on edit button");
		Thread.sleep(2000);
		holidaycalendar.selectHolidayDate(HolidayDate);
		logger.info("Selected the holiday date");
		Thread.sleep(2000);
		holidaycalendar.setEditDescription(EditDescription);
		logger.info("Entered the holiday description");
		Thread.sleep(2000);
		holidaycalendar.clickOnSaveButton();
		logger.info("Clicked on the save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(holidaycalendar.getEditActualResponseMessage().contains(ExpectedResponseMessage));
		}
		holidaycalendar.clickOnConfirmOkButton();
		logger.info("Clicked on the confirm ok button");
	}
	
}
