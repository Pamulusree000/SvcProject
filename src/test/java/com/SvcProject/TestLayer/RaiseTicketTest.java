package com.SvcProject.TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class RaiseTicketTest extends TestBase{

	@DataProvider
	public Object [][] getRaiseTicketData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("raiseticket");
		return data;
	}
	
	
	@Test(dataProvider="getRaiseTicketData")
	public void verifyRaiseTicket(
			String Username,
			String LoginOtp,
			String IssueType,
			String SubIssueType,
			String IssueDescription,
			String Searchs
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
		
		raiseticket.clickOnSupportModule();
		logger.info("Clicked on support module");
		Thread.sleep(3000);	
		raiseticket.clickOnRaiseTicketForm();
		logger.info("Clicked on raise ticket form");
		Thread.sleep(3000);	
		raiseticket.clickOnRaiseTicketLink();
		logger.info("Clicked on raise ticket link");
		Thread.sleep(3000);	
		raiseticket.selectIssueTypeListBox();
		logger.info("Clicked on issue type drop down");
		Thread.sleep(3000);	
		raiseticket.selectIssueTypeTextBox(IssueType);
		logger.info("Selected issue type");
		Thread.sleep(3000);	
		raiseticket.selectSubIssueTypeListBox();
		logger.info("Clicked on sub issue type drop down");
		Thread.sleep(3000);	
		raiseticket.selectSubIssueTypeTextBox(SubIssueType);
		logger.info("Selected sub issue type");
		Thread.sleep(3000);	
		raiseticket.setIssueDescription(IssueDescription);
		logger.info("Entered issue Description");
		Thread.sleep(3000);	
		raiseticket.clickOnSaveButton();
		logger.info("Clicked on Save Button");
		Thread.sleep(3000);	
		raiseticket.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		Thread.sleep(3000);	
		raiseticket.setSearchRecentTicketNumber();
		logger.info("Entered the data required in the search field");
		Thread.sleep(2000);
		raiseticket.clickOnPendingLink();
		logger.info("Clicked on the pending link");
		Thread.sleep(2000);
		raiseticket.clickOnCloseButton();
		logger.info("Clicked on close button");
		
	}
	
	
}
