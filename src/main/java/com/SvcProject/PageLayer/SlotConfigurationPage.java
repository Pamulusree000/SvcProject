package com.SvcProject.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class SlotConfigurationPage extends TestBase{

	
	public SlotConfigurationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//---------------------------Variables---------------------------------------------------------
	
	@FindBy(xpath="//span[text()='Master']")
	private WebElement mastermodule_link;
	
	@FindBy(xpath="//span[text()='Slot Configuration']")
	private WebElement slotconfiguration_link;
	
	@FindBy(id="txtFromTime")
	private WebElement fromtime_txtbox;
	
	@FindBy(id="txtToTime")
	private WebElement totime_txtbox;
	
	@FindBy(id="txtTimeInterval")
	private WebElement timeinterval_txtbox;
	
	@FindBy(id="txtSM_EffectiveDate")
	private WebElement date_datepicker;
	
	@FindBy(id="btnUpdate")
	private WebElement update_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(id="btnHCSlots")
	private WebElement healthcenterslots_button;
	
	@FindBy(css="label[for='toogle7']")
	private WebElement healthcentersundaystatus_togglebutton;
	
	@FindBy(id="btnSave")
	private WebElement healthcenterslotsave_button;
	
	@FindBy(css="button.confirm")
	private WebElement healthcenterslotconfirmok_button;
	
	@FindBy(id="btnDocSlots")
	private WebElement doctorslots_button;
	
	@FindBy(css="label[for='toogle7']")
	private WebElement doctorsundaystatus_togglebutton;
	
	@FindBy(id="btnSave")
	private WebElement doctorslotsave_button;
	
	@FindBy(css="button.confirm")
	private WebElement doctorslotconfirmok_button;
	
	//-----------------------------------Methods-----------------------------------------
	
	public void clickOnMasterModule()
	{
		mastermodule_link.click();
	}
	
	public void clickOnSlotConfiguration()
	{
		slotconfiguration_link.click();
	}
	public void setFromTime(String FromTime)
	{
		fromtime_txtbox.sendKeys(FromTime);
	}
	public void setToTime(String ToTime)
	{
		totime_txtbox.sendKeys(ToTime);
	}
	public void setTimeInterval(String TimeInterval)
	{
		timeinterval_txtbox.sendKeys(TimeInterval);
	}
	
	public void selectDatePicker(String Date)
	{
		JavascriptExecutor jse= ((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].value='"+Date+"';", date_datepicker);
	}
	public void clickOnUpdateButton()
	{
		update_button.click();
	}
	
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	public void clickOnHealthCenterSlotButton()
	{
		healthcenterslots_button.click();
	}
	public void clickOnHealthCenterStatusButton()
	{
		healthcentersundaystatus_togglebutton.click();
	}
	public void clickOnHealthCenterSlotSaveButton()
	{
		healthcenterslotsave_button.click();
	}
	public void clickOnHealthCenterConfirmOkButton()
	{
		healthcenterslotconfirmok_button.click();
	}
	public void clickOnDoctorSlotButton()
	{
		doctorslots_button.click();
	}
	public void clickOnDoctorStatusButton()
	{
		doctorsundaystatus_togglebutton.click();
	}
	public void clickOnDoctorSlotSaveButton()
	{
		doctorslotsave_button.click();
	}
	public void clickOnDoctorSlotConfrimOkButton()
	{
		doctorslotconfirmok_button.click();
	}
	
	
}
