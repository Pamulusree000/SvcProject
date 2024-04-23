package com.SvcProject.TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class LeaveTest extends TestBase{
	
	
	
	@DataProvider
	public Object[][] getLeaveData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("leave");
		return data;
	}
	
	
	
	@Test(dataProvider="getLeaveData")
	public void verifyLeave(
			String Username,
			String LoginOtp,
			String LeaveRequestFor,
			String Role,
			String Name,
			String LeaveType,
			String Reason,
			String Fromdate,
			String Todate
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
		Thread.sleep(2000);
		
		leavepage.clickOnOtherModule();
		logger.info("Clicked on the others module");
		Thread.sleep(2000);
		leavepage.clickOnLeaveForm();
		logger.info("Clicked on the leave form");
		Thread.sleep(2000);
		leavepage.clickOnAddLeaveButton();
		logger.info("Clicked on the add leave button");
		Thread.sleep(2000);
		leavepage.selectLeaveRequest(LeaveRequestFor);
		logger.info("Selected the leave request for");
		Thread.sleep(2000);
		
		if(LeaveRequestFor.trim().equals("Other"))
		{
		leavepage.selectRole(Role);
		logger.info("Selected the role");
		Thread.sleep(2000);
		leavepage.selectName(Name);
		logger.info("Selected the name");
		Thread.sleep(2000);
		}
		leavepage.selectLeaveType(LeaveType);
		logger.info("Selected the Leave type");
		Thread.sleep(2000);
		leavepage.setReasonTextBox(Reason);
		logger.info("Selected the reason for leave");
		Thread.sleep(2000);
		leavepage.selectFromDate(Fromdate);
		logger.info("Selected the fromdate");
		Thread.sleep(2000);
		leavepage.selectToDate(Todate);
		logger.info("Selected the Todate");
		Thread.sleep(2000);
		leavepage.clickOnSaveButton();
		logger.info("Clicked on the save button");
		leavepage.clickOnYesButton();
		logger.info("Clicked on the yes button");
		leavepage.clickOnOkButton();
		logger.info("Clicked on ok button");
		
	}
	
	
	

}
