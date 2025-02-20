package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;



public class SignInTest extends TestBase{
	
	@DataProvider
	public Object[][] getSignInData() throws Exception
	{
		Object[][] data = ReadExcelData.excelTestData("signin");
		return data;
	}

	
	@Test(dataProvider = "getSignInData")
	public void verifyLogin (
			String Username,
			String Password, 
			String ExpectedTitle, 
			String ExpectedValidation
			) throws InterruptedException
	{
		
		signin.clickOnSigninButton();
		logger.info("Clicked on home signin button");
		Thread.sleep(2000);
		signin.setUsername(Username);
		logger.info("Entered username");
		Thread.sleep(2000);
		signin.setPassword(Password);
		logger.info("Entered pasword");
		Thread.sleep(2000);
		signin.clickOnLoginbutton();
		logger.info("clicked on login button");
		Thread.sleep(3000);
		String Actualtitle=driver.getTitle();
		//System.out.println(title);
		
			Assert.assertEquals(Actualtitle, ExpectedTitle);
			if(Actualtitle.equals("i~Virtual Vaidya"))
				Assert.assertTrue(signin.getErrorText().contains(ExpectedValidation));
		
	}
	
}
