package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class AssetDetailsTest extends TestBase{

	
	@DataProvider
	public Object [][] getAssetDetailsData1() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("assetdetails1");
		return data;
	}
	
	@DataProvider
	public Object [][] getAssetDetailsData2() throws Exception
	{
		Object [][] data = ReadExcelData.excelTestData("assetdetails2");
		return data;
	}
	
	
	@Test(dataProvider="getAssetDetailsData1",priority=1)
	public void verifyAssetDetailsScenario1(
			String Username,
			String LoginOtp,
			String AssetMasterName,
			String AssetId,
			String Manufacturer,
			String PurchaseDate,
			String WarrantyPeriod,
			String InvoiceAmount,
			String Svc,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on the sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on the sign in via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered the login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		assetdetails.clickOnAssetModule();
		logger.info("Clicked on the asset module");
		assetdetails.clickOnAssetDetails();
		logger.info("Clicked on asset details form");
		assetdetails.clickOnAddAssetDetailsButton();
		logger.info("Clicked on add asset details button");
		Thread.sleep(2000);
		assetdetails.selectAssetMasterName(AssetMasterName);
		logger.info("Selected the assetmaster name");
		assetdetails.setAssetId(AssetId);
		logger.info("Entered the asset id");
		Thread.sleep(2000);
		assetdetails.selectManufacturer(Manufacturer);
		logger.info("Selected the manufacturer");
		Thread.sleep(3000);
		assetdetails.clickOnPurchaseDatePicker();
		logger.info("Selected the datapicker");
		Thread.sleep(2000);
		assetdetails.setWarrantyPeriod(WarrantyPeriod);
		logger.info("Entered the warranty period");
		assetdetails.setInvoiceAmount(InvoiceAmount);
		logger.info("Entered the invoice amount");
		Thread.sleep(2000);
		assetdetails.selectSvc(Svc);
		logger.info("Selected the svc");
		assetdetails.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(assetdetails.getActualResponseMessage1().contains(ExpectedResponseMessage));
		}
		
		assetdetails.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	
		
	}

	@Test(dataProvider="getAssetDetailsData2",priority=2)
	public void verifyAssetDetailsScenario2(
			String Username,
			String LoginOtp,
			String AssetMasterName,
			String AssetId,
			String Manufacturer,
			String PurchaseDate,
			String WarrantyPeriod,
			String InvoiceAmount,
			String Svc,
			String ExpectedTitle,
			String ExpectedResponseMessage
			) throws InterruptedException
	{
		signinviaotp.clickOnHomeSignInButton();
		logger.info("Clicked on the sign in button");
		signinviaotp.setUsername(Username);
		logger.info("Entered the username");
		signinviaotp.clickOnSignInViaOtpButton();
		logger.info("Clicked on the sign in via otp button");
		signinviaotp.setOTP(LoginOtp);
		logger.info("Entered the login otp");
		signinviaotp.clickOnSignInButton();
		logger.info("Clicked on sign in button");
		assetdetails.clickOnAssetModule();
		logger.info("Clicked on the asset module");
		assetdetails.clickOnAssetDetails();
		logger.info("Clicked on asset details form");
		assetdetails.clickOnAddAssetDetailsButton();
		logger.info("Clicked on add asset details button");
		Thread.sleep(2000);
		assetdetails.selectAssetMasterName(AssetMasterName);
		logger.info("Selected the assetmaster name");
		assetdetails.setAssetId(AssetId);
		logger.info("Entered the asset id");
		Thread.sleep(2000);
		assetdetails.selectManufacturer(Manufacturer);
		logger.info("Selected the manufacturer");
		Thread.sleep(3000);
		assetdetails.clickOnPurchaseDatePicker();
		logger.info("Selected the datapicker");
		Thread.sleep(2000);
		assetdetails.setWarrantyPeriod(WarrantyPeriod);
		logger.info("Entered the warranty period");
		assetdetails.setInvoiceAmount(InvoiceAmount);
		logger.info("Entered the invoice amount");
		Thread.sleep(2000);
		assetdetails.selectSvc(Svc);
		logger.info("Selected the svc");
		assetdetails.clickOnSaveButton();
		logger.info("Clicked on save button");
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(assetdetails.getActualResponseMessage2().contains(ExpectedResponseMessage));
		}
		
		assetdetails.clickOnConfirmOkButton();
		logger.info("Clicked on confirm ok button");
		
	
		
	}
	
}
