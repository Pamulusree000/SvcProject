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
		logger.info("Clicked on home sign in button");
		Thread.sleep(2000);
		signup.setMobileNumber(MobileNumber);
		String mobilenumber=signup.getMobileNumber();
		logger.info("Mobile Number :"+mobilenumber);
		Thread.sleep(2000);
		signup.setName(Name);
		String name=signup.getName();
		logger.info("Name:"+name);
		Thread.sleep(2000);
		signup.setEmailId(EmailId);
		String email=signup.getEmail();
		logger.info("EmailId :"+email);
		Thread.sleep(2000);
		signup.setPassword(Password);
		String password=signup.getPassword();
		logger.info("Password :"+password);
		Thread.sleep(2000);
		signup.setConfirmPassword(ConfirmPassword);
		String confirmpassword=signup.getConfirmPassword();
		logger.info("ConfirmPassword :"+confirmpassword);
		Thread.sleep(2000);
		signup.selectGenderRadioButton(Gender);
		logger.info("Selected Gender");
		Thread.sleep(2000);
		signup.clickOnSubmitButton();
		logger.info("Clicked on submit button");
		Thread.sleep(3000);
		signup.selectTermsandUsageCheckBox();
		logger.info("Selected terms and usage checkbox");
		Thread.sleep(3000);
		signup.clickOnProceedButton();
		logger.info("Clicked on proceed button");
		Thread.sleep(2000);
		signup.setOtp(Otp);
		String otp=signup.getOtp();
		logger.info("Otp :"+otp);
		Thread.sleep(2000);
		signup.clickonSignUpButton();
		logger.info("Clicked on signup button");
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
		logger.info("Clicked on home sign in button");
		Thread.sleep(2000);
		signup.setMobileNumber(MobileNumber);
		String mobilenumber=signup.getMobileNumber();
		logger.info("Mobile Number :"+mobilenumber);
		Thread.sleep(2000);
		signup.setName(Name);
		String name=signup.getName();
		logger.info("Name:"+name);
		Thread.sleep(2000);
		signup.setEmailId(EmailId);
		String email=signup.getEmail();
		logger.info("EmailId :"+email);
		Thread.sleep(2000);
		signup.setPassword(Password);
		String password=signup.getPassword();
		logger.info("Password :"+password);
		Thread.sleep(2000);
		signup.setConfirmPassword(ConfirmPassword);
		String confirmpassword=signup.getConfirmPassword();
		logger.info("ConfirmPassword :"+confirmpassword);
		Thread.sleep(2000);
		signup.selectGenderRadioButton(Gender);
		logger.info("Selected Gender");
		Thread.sleep(2000);
		signup.clickOnSubmitButton();
		logger.info("Clicked on submit button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
				{
			Assert.assertTrue(signup.getErrorMessageText().contains(ExpectedValidation));
				}
	
	}
	

}
