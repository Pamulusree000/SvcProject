package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;


public class SignUpTest extends TestBase {

	
	@DataProvider
	public Object [][] getSignUpScenarios1Data() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("signupscenarios1");
		return data;
	}
	
	@DataProvider
	public Object [][] getSignUpScenarios2Data() throws Exception
	{
		Object [][]data=ReadExcelData.excelTestData("signupscenarios2");
		return data;
	}
	

	@Test(dataProvider="getSignUpScenarios1Data",priority=1)
	public void verifySignupScenarios1(
			String MobileNumber,
			String Name,
			String EmailId,
			String Password,
			String ConfirmPassword,
			String Gender,
			String Otp,
			String ExpectedTitle,
			String ExpectedValidation
			) throws InterruptedException
	{
		signup.clickOnHomeSigninButton();
		logger.info("clicked on home sign in button");
		Thread.sleep(2000);
		signup.setMobileNumber(MobileNumber);
		logger.info("Entered mobile number");
		Thread.sleep(2000);
		signup.setName(Name);
		logger.info("Entered name");
		Thread.sleep(2000);
		signup.setEmailId(EmailId);
		logger.info("Entered emailId");
		Thread.sleep(2000);
		signup.setPassword(Password);
		logger.info("Entered password");
		Thread.sleep(2000);
		signup.setConfirmPassword(ConfirmPassword);
		logger.info("Entered ConfirmPassword");
		Thread.sleep(2000);
		signup.selectGenderRadioButton(Gender);
		logger.info("Selected Gender");
		Thread.sleep(2000);
		signup.clickOnSubmitButton();
		logger.info("clicked on submit button");
		Thread.sleep(4000);
		signup.selectTermsandUsageCheckBox();
		logger.info("selected terms and usage checkbox");
		Thread.sleep(3000);
		signup.clickOnProceedButton();
		logger.info("clicked on proceed button");
		Thread.sleep(2000);
		signup.setOtp(Otp);
		logger.info("Entered otp");
		Thread.sleep(2000);
		signup.clickonSignUpButton();
		logger.info("clicked on signupbutton");
		Thread.sleep(6000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);	
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(signup.getErrorMessageText().contains(ExpectedValidation));
		}
		
	}
	
	
	@Test(dataProvider="getSignUpScenarios2Data",priority=2)
	public void verifySignupScenarios2(
			String MobileNumber,
			String Name,
			String EmailId,
			String Password,
			String ConfirmPassword,
			String Gender,
			String ExpectedTitle,
			String ExpectedValidation
			) throws InterruptedException
	{
		signup.clickOnHomeSigninButton();
		logger.info("clicked on home sign in button");
		Thread.sleep(2000);
		signup.setMobileNumber(MobileNumber);
		logger.info("Entered mobile number");
		Thread.sleep(2000);
		signup.setName(Name);
		logger.info("Entered name");
		Thread.sleep(2000);
		signup.setEmailId(EmailId);
		logger.info("Entered emailId");
		Thread.sleep(2000);
		signup.setPassword(Password);
		logger.info("Entered password");
		Thread.sleep(2000);
		signup.setConfirmPassword(ConfirmPassword);
		logger.info("Entered ConfirmPassword");
		Thread.sleep(2000);
		signup.selectGenderRadioButton(Gender);
		logger.info("Selected Gender");
		Thread.sleep(2000);
		signup.clickOnSubmitButton();
		logger.info("clicked on submit button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
				{
			Assert.assertTrue(signup.getErrorMessageText().contains(ExpectedValidation));
				}
	
	}
	

}
