package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class ChangePasswordTest extends TestBase{

	
	@DataProvider
	public Object [][] getChangePassword() throws Exception
	{
		Object [][] data =ReadExcelData.excelTestData("changepassword");
		return data;
	}
	
	
	@Test(dataProvider="getChangePassword")
	public void verifyChangePasswordScenarios(
			String Username,
			String Password,
			String CurrentPassword,
			String NewPassword,
			String ConfirmPassword,
			String ExpectedTitle,
			String ExpectedValidation
			) throws InterruptedException
	{
		
		signin.clickOnSigninButton();
		logger.info("clicked on the signin button");
		Thread.sleep(2000);
		signin.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		signin.setPassword(Password);
		logger.info("Entered password");
		Thread.sleep(2000);
		signin.clickOnLoginbutton();
		logger.info("clicked on login button");
		Thread.sleep(2000);
		changepassword.clickOnOthersLink();
		logger.info("clicked on otherslink module");
		Thread.sleep(2000);
		changepassword.clickOnChangePasswordLink();
		logger.info("clicked on changepasswordlink");
		Thread.sleep(2000);
		changepassword.setCurrentPassword(CurrentPassword);
		logger.info("Entered currentpassword");
		Thread.sleep(2000);
		changepassword.setNewPassword(NewPassword);
		logger.info("Entered newpassword");
		Thread.sleep(2000);
		changepassword.setConfirmPassword(ConfirmPassword);
		logger.info("Entered confirmpassword");
		Thread.sleep(2000);
		changepassword.clickOnUpdateBtn();
		logger.info("clicked on update button");
		Thread.sleep(3000);
		
	
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(changepassword.getActualResponseMessage().contains(ExpectedValidation));
		}
	
	
	}
	
}
