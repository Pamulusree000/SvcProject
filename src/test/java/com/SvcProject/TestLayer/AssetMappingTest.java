package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class AssetMappingTest extends TestBase{

	@DataProvider
	public Object [][] getAssetMappingData1() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetmapping1");
		return data;
	}
	
	@DataProvider
	public Object [][] getAssetMappingData2() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetmapping2");
		return data;
	}
	
	
	
	@Test(dataProvider="getAssetMappingData1",priority=1)
	public void verifyAssetMappingScenario1(
			String Username,
			String LoginOtp,
			String Svc,
			String AssetID,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		assetmapping.clickOnAssetModule();
		logger.info("Clicked on asset module");
		assetmapping.clickOnAssetMapping();
		logger.info("Clicked on asset mapping");
		assetmapping.clickOnNewButton();
		logger.info("Clicked on new button");
		Thread.sleep(2000);
		assetmapping.selectSvc(Svc);
		logger.info("Selected the svc");
		Thread.sleep(2000);
		assetmapping.selectAssetID(AssetID);
		logger.info("Selected the asset id");
		assetmapping.clickOnSaveButton();
		logger.info("Clicked on save button");
		
		
		String ActualTitle=driver.getTitle();		
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(assetmapping.getResponseMessage1().contains(ExpectedResponseMessage));
		}
		
		assetmapping.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	}
	
	
	@Test(dataProvider="getAssetMappingData2",priority=2)
	public void verifyAssetMappingScenario2(
			String Username,
			String LoginOtp,
			String Svc,
			String AssetID,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on home sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on sign via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		assetmapping.clickOnAssetModule();
		logger.info("Clicked on asset module");
		assetmapping.clickOnAssetMapping();
		logger.info("Clicked on asset mapping");
		assetmapping.clickOnNewButton();
		logger.info("Clicked on new button");
		Thread.sleep(2000);
		assetmapping.selectSvc(Svc);
		logger.info("Selected the svc");
		Thread.sleep(2000);
		assetmapping.selectAssetID(AssetID);
		logger.info("Selected the asset id");
		assetmapping.clickOnSaveButton();
		logger.info("Clicked on save button");
		
		
		String ActualTitle=driver.getTitle();		
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(assetmapping.getResponseMessage2().contains(ExpectedResponseMessage));
		}
		
		assetmapping.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	}
	
	
	
	
}
