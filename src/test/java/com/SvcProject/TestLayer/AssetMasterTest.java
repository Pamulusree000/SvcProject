package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;


public class AssetMasterTest extends TestBase{
	
	
	
	@DataProvider
	public Object [][] getAssetMasterData1() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetmaster1");
		return data;
	}
	
	@DataProvider
	public Object [][] getAssetMasterData2() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetmaster2");
		return data;
	}
	

	@Test(dataProvider="getAssetMasterData1",priority=1)
	public void verifyAssetMasterScenario1(
			String Username,
			String LoginOtp,
			String AssetMasterName,
			String AssetMasterSpecification,
			String AssetMasterType,
			String AssetMasterSpecialization,
			String Frequency,
			String Type,
			String ActivityOfMaintainance,
			String Description,
			String Step1,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		assetmaster.clickOnAssetModule();
		logger.info("Clicked on asset module");
		assetmaster.clickOnAssetMaster();
		logger.info("Clicked on asset master form");
		assetmaster.clickOnNewButton();
		logger.info("Clicked on new button");
		assetmaster.setAssetMasterName(AssetMasterName);
		logger.info("Entered assetmaster name");
		assetmaster.setAssetMasterSpecification(AssetMasterSpecification);
		logger.info("Entered asset specification");
		Thread.sleep(2000);
		assetmaster.selectAssetMasterType(AssetMasterType);
		logger.info("Selected asset master type");
		
		if(AssetMasterType.equals("Medical Component"))
			assetmaster.selectAssetMasterSpecialization(AssetMasterSpecialization);
		Thread.sleep(2000);
		assetmaster.clickOnMaintainanceTab();
		logger.info("Clicked on maintainance tab");
		Thread.sleep(2000);
		assetmaster.selectFrequency(Frequency);
		logger.info("Selected frequency ");
		Thread.sleep(2000);
		assetmaster.selectType(Type);
		logger.info("Selected the frequency type");
		Thread.sleep(2000);
		assetmaster.setActivityOfMaintainance(ActivityOfMaintainance);
		logger.info("Entered activity of maintainance");
		assetmaster.setDescription(Description);
		logger.info("Entered the description");
		Thread.sleep(2000);
		assetmaster.clickOnDeleteRowButton();
		logger.info("Clicked on the delete button ");
		Thread.sleep(2000);
		assetmaster.clickOnUsageProtocol();
		logger.info("Clicked on usage protocol");
		assetmaster.setStep1(Step1);
		logger.info("Entered step1");
		Thread.sleep(2000);
		assetmaster.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(assetmaster.getActualResponseMessage1().contains(ExpectedResponseMessage));
		}
		
		assetmaster.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	}

		
	
	@Test(dataProvider="getAssetMasterData2",priority=2)
	public void verifyAssetMasterScenario2(
			String Username,
			String LoginOtp,
			String AssetMasterName,
			String AssetMasterSpecification,
			String AssetMasterType,
			String AssetMasterSpecialization,
			String Frequency,
			String Type,
			String ActivityOfMaintainance,
			String Description,
			String Step1,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign in via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on signin button");
		assetmaster.clickOnAssetModule();
		logger.info("Clicked on asset module");
		assetmaster.clickOnAssetMaster();
		logger.info("Clicked on asset master form");
		assetmaster.clickOnNewButton();
		logger.info("Clicked on new button");
		assetmaster.setAssetMasterName(AssetMasterName);
		logger.info("Entered assetmaster name");
		assetmaster.setAssetMasterSpecification(AssetMasterSpecification);
		logger.info("Entered asset specification");
		Thread.sleep(2000);
		assetmaster.selectAssetMasterType(AssetMasterType);
		logger.info("Selected asset master type");
		
		if(AssetMasterType.equals("Medical Component"))
			assetmaster.selectAssetMasterSpecialization(AssetMasterSpecialization);
		Thread.sleep(2000);
		assetmaster.clickOnMaintainanceTab();
		logger.info("Clicked on maintainance tab");
		Thread.sleep(2000);
		assetmaster.selectFrequency(Frequency);
		logger.info("Selected frequency ");
		Thread.sleep(2000);
		assetmaster.selectType(Type);
		logger.info("Selected the frequency type");
		Thread.sleep(2000);
		assetmaster.setActivityOfMaintainance(ActivityOfMaintainance);
		logger.info("Entered activity of maintainance");
		assetmaster.setDescription(Description);
		logger.info("Entered the description");
		Thread.sleep(2000);
		assetmaster.clickOnDeleteRowButton();
		logger.info("Clicked on the delete button ");
		Thread.sleep(2000);
		assetmaster.clickOnUsageProtocol();
		logger.info("Clicked on usage protocol");
		assetmaster.setStep1(Step1);
		logger.info("Entered step1");
		Thread.sleep(2000);
		assetmaster.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(assetmaster.getActualResponseMessage2().contains(ExpectedResponseMessage));
		}
		
		assetmaster.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	}
	

}
