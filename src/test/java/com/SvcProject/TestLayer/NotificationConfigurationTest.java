package com.SvcProject.TestLayer;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.ReadExcelData;

public class NotificationConfigurationTest extends TestBase{
	
	
	
	
	@DataProvider
	public Object [][] getNotificationConfigurationData() throws Exception
	{
		Object [][] data=ReadExcelData.excelTestData("notificationconfiguration");
		return data;
	}
	
	
	@Test(dataProvider="getNotificationConfigurationData")
	public void verifyNotificationConfiguration(
			String Username,
			String LoginOtp,
			String NotificationTypeforSms,
			String NotificationTypeforEmail,
			String NotificationTypeforPush,
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
		Thread.sleep(3000);
		notificationconfiguration.clickOnOthersModule();
		Thread.sleep(2000);
		notificationconfiguration.clickOnNotificationConfigurationform();
		Thread.sleep(2000);
		notificationconfiguration.clickOnSmsNotificationsOnBasisOfNotificationType(NotificationTypeforSms);
		Thread.sleep(2000);
		notificationconfiguration.clickOnEmailNotificationOnBasisOfNotificationType(NotificationTypeforEmail);
		Thread.sleep(2000);
		notificationconfiguration.clickOnPushNotificationONBasisOfNotificationType(NotificationTypeforPush);
		Thread.sleep(2000);
		notificationconfiguration.clickOnSaveButton();
		Thread.sleep(2000);
		
		String ActualTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if(ActualTitle.equals("Smart Virtual Clinic"))
		{
			Assert.assertTrue(notificationconfiguration.getActualResponseMessage().contains(ExpectedResponseMessage));
		}
		
		notificationconfiguration.clickOnConfirmOkButton();
		
		
	}

}
