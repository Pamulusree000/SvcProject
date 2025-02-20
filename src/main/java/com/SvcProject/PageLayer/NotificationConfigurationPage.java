package com.SvcProject.PageLayer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class NotificationConfigurationPage extends TestBase {

	
	public NotificationConfigurationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------------------Variables------------------------------------------
	
	@FindBy(xpath="//ul[@id='Modules']//li[6]/a/span[@class='title']")
	private WebElement othersmodule_link;
	
	@FindBy(xpath="//span[text()='Notification Configuration']")
	private WebElement notificationconfiguration_link;
	
	@FindBy(css="#gridNotification td:nth-child(2)")
	private List<WebElement> notificationTypes_txt;
	
	@FindBy(css="label.tgl-btn[for*='Sms']")
	private List<WebElement> sms_togglebutton;
	
	@FindBy(css="label.tgl-btn[for*='email']")
	private List<WebElement> email_togglebutton;
	
	@FindBy(css="label.tgl-btn[for*='Push']")
	private List<WebElement> push_togglebutton;
	
	@FindBy(id="btnUpdate")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message;
	
	
	//--------------------------------Methods----------------------------------------------------
	
	
	
	public void clickOnOthersModule()
	{
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click();", othersmodule_link);
		
		othersmodule_link.click();		
	}
	public void clickOnNotificationConfigurationform()
	{
		notificationconfiguration_link.click();
	}
	
	public List<String> getNotificationTypes(){
		List<String> notificationtype= new ArrayList<>();
		
		for(int i=0; i<notificationTypes_txt.size(); i++)
		{
			notificationtype.add(notificationTypes_txt.get(i).getText());
		}
		return notificationtype;
	}
	
	public Map<String, WebElement> getSmsNotifications()
	{
		Map<String, WebElement> SmsNotifications= new LinkedHashMap<>();
		for(int s=0; s<sms_togglebutton.size(); s++)
		{
			SmsNotifications.put(getNotificationTypes().get(s), sms_togglebutton.get(s));
		}
		return SmsNotifications;
	}
	public Map<String, WebElement> getEmailNotification()
	{
		Map<String, WebElement> emailnotifications = new LinkedHashMap<>();
		
		for(int e=0; e<email_togglebutton.size(); e++)
		{
			emailnotifications.put(getNotificationTypes().get(e), email_togglebutton.get(e));
		}
		return emailnotifications;
	}
	public Map<String, WebElement> getPushNotification()
	{
		Map<String, WebElement> PushNotifications = new LinkedHashMap<>();
		for(int p=0; p<push_togglebutton.size();p++)
		{
			PushNotifications.put(getNotificationTypes().get(p), push_togglebutton.get(p));
		}
		return PushNotifications;
	}
	
	public void clickOnSmsNotificationsOnBasisOfNotificationType(String NotificationTypeforSms) {
		getSmsNotifications().get(NotificationTypeforSms).click();
	}
	
	public void clickOnEmailNotificationOnBasisOfNotificationType(String NotificationTypeforEmail) {
		getEmailNotification().get(NotificationTypeforEmail).click();
	}
	
	public void clickOnPushNotificationONBasisOfNotificationType(String NotificationTypeforPush) {
		getPushNotification().get(NotificationTypeforPush).click();
	}
	
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	
	
}
