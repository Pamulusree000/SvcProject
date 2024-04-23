package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class ReleaseNoteTest extends TestBase{

	
	@DataProvider
	public Object [][] releaseNoteData() throws Exception
	{
		Object [][] data =ReadExcelData.excelTestData("releasenote");
		 return data;
	}

	
	@Test(dataProvider="releaseNoteData")
	public void verifyReleaseNote(
			String Username,
			String LoginOtp,
			String ReleaseDate,
			String ReleaseVersion,
			String ReleaseType,
			String DevelopmentLead,
			String ApplicationType,
			String AppServerIp,
			String ReleasePublishFilePath,
			String ReleaseScriptFilePath,
			String DbServerIp,
			String RollBackPublishFilePath,
			String RollBackScriptsPath,
			String ReleaseDescription,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home sign in button");
		Thread.sleep(3000);		
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		Thread.sleep(3000);
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		Thread.sleep(3000);
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered the otp");
		Thread.sleep(3000);
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		Thread.sleep(3000);
		releasenote.clickOnSupportModule();
		logger.info("Clicked on support module");
		releasenote.clickOnReleaseNote();
		logger.info("Clicked on release note");
		releasenote.clickOnNewReleaseButton();
		logger.info("Clicked on new release button");
		releasenote.selectDatePicker(ReleaseDate);
		logger.info("Selected the release date");
		releasenote.setReleaseVersion(ReleaseVersion);
		logger.info("Entered the release version");
		Thread.sleep(2000);
		releasenote.selectReleaseType(ReleaseType);
		logger.info("Selected the release type");
		releasenote.setDevelopmentLead(DevelopmentLead);
		logger.info("Entered the development lead");
		Thread.sleep(2000);
		releasenote.selectApplicationType(ApplicationType);
		logger.info("Selected the applicatin type");
		releasenote.setAppServerIp(AppServerIp);
		logger.info("Entered the app server Ip");
		releasenote.setReleasePublishFilePath(ReleasePublishFilePath);
		logger.info("Entered the release publish file path");
		releasenote.setReleaseScriptFilePath(ReleaseScriptFilePath);
		logger.info("Entered the release script file path");
		releasenote.setDbServerIp(DbServerIp);
		logger.info("Entered the db server Ip");
		releasenote.setRollBackPublishFilePath(RollBackPublishFilePath);
		logger.info("Entered the roll back publish file path");
		releasenote.setRollBackScriptsPath(RollBackScriptsPath);
		logger.info("Entered the roll back scripts path");
		releasenote.setReleaseDescription(ReleaseDescription);
		logger.info("Entered the release description");
		releasenote.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(3000);
		
		String ActualTitle=driver.getTitle();	
	
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
		Assert.assertTrue(releasenote.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		Thread.sleep(3000);
		releasenote.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	}
	
}
