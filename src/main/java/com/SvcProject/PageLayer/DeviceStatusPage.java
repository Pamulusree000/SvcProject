package com.SvcProject.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class DeviceStatusPage extends TestBase{

	
	public DeviceStatusPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------Variables-----------------------------------------
	
	
	@FindBy(xpath="//span[text()='Device Status']")
	private WebElement devicestatus_link;
	
	@FindBy(id="btnNew")
	private WebElement update_button;
	
	@FindBy(xpath="//input[@id='switched165']/following::label[@for='switched165']")
	private WebElement devicestatus_togglebutton;
	
	@FindBy(id="DailyComment165")
	private WebElement comments_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message1;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::h2")
	private WebElement resposne_message2;
	
	//---------------------------Methods--------------------------------------------
	
	
	public void clickOnDeviceStatus()
	{
		devicestatus_link.click();
	}
	public void clickOnUpdateButton()
	{
		update_button.click();
	}
	public void clickOnDeviceStatusToggleButton()
	{
		devicestatus_togglebutton.click();
	}
	public void setCommentsTextBox(String Comments)
	{
		comments_txtbox.sendKeys(Comments);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	public String getActualResponseMessage1()
	{
		return response_message1.getText();
	}
	public String getActualResponseMessage2()
	{
		return resposne_message2.getText();
	}
	
	
}
