package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class UserManagementTest extends TestBase{
	
	
	@DataProvider
	public Object[][] getUserManagementData() throws Exception
	{
		Object [][] data = ReadExcelData.excelTestData("usermanagement");
		return data;
	}

	
	@Test(dataProvider="getUserManagementData")
	public void verifyUserManagement(
			String Username,
			String LoginOtp,
			String Roles,
			String MobileNumber,
			String Remarks,
			String UserStatusBlock,
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
		
		usermanagement.clickOnSupportModuleLink();
		logger.info("Clicked on support module link");
		Thread.sleep(2000);
		usermanagement.clickOnUserManagementFormLink();
		logger.info("Clicked on user management form link");
		Thread.sleep(2000);
		usermanagement.selectRoles(Roles);
		logger.info("Selected the requried role");
		Thread.sleep(2000);
		usermanagement.searchMobileNumber(MobileNumber);
		logger.info("Searched for the requried mobile number");
		Thread.sleep(2000);
	
		
		if(!usermanagement.getUserToggleButtonStaus())
		{
			usermanagement.clickOnUserBlockedStatusToggleButton();
			
		}else if (UserStatusBlock.equals("Yes"))
		{
			usermanagement.clickOnUserStatusToggleButton();
		}
		Thread.sleep(2000);		
		usermanagement.clickOnActivateButton();
		logger.info("Clicked on the activate button");
		Thread.sleep(2000);
		usermanagement.setRemarks(Remarks);
		logger.info("Entered the remarks");
		Thread.sleep(2000);
		usermanagement.clickOnSaveButton();
		logger.info("Clicked on the save button");
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(usermanagement.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		usermanagement.clickOnConfirmOkButton();
		logger.info("Clicked onthe confirm ok button");
		
	}
	
	
	

}
