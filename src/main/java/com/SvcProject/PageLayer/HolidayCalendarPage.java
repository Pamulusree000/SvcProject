package com.SvcProject.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class HolidayCalendarPage extends TestBase{
	
	
	public HolidayCalendarPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------------------Variable---------------------------------------------
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement adminmodule_link;
	
	@FindBy(xpath="//span[text()='Holiday']")
	private WebElement holidayform_link;
	
	@FindBy(id="btnNew")
	private WebElement addholiday_button;

	@FindBy(id="txtHolidayDate")
	private WebElement holidaydate_datepicker;
	
	@FindBy(id="txtDescription")
	private WebElement holidaydescription_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search_txtbox;
	
	@FindBy(xpath="//label[@class='tgl-btn']")
	private WebElement status_togglebutton;
	
	@FindBy(css="button.confirm")
	private WebElement yes_button;
	
	@FindBy(id="txtReason")
	private WebElement reason_txtbox;
	
	@FindBy(id="btnUpdateStatus")
	private WebElement statussave_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement statusresponse_message;
	
	@FindBy(css="button.confirm")
	private WebElement statusconfirmok_button;
	
	@FindBy(xpath="//a[@title='Click here to Edit']")
	private WebElement edit_button;
	
	@FindBy(id="btnSave")
	private WebElement editsave_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement editresponse_message;
	
	@FindBy(css="button.confirm")
	private WebElement editconfirmok_button;
	
	//-----------------------------Methods--------------------------------------------
	
	
	public void clickOnAdminModuleLink()
	{
		adminmodule_link.click();
	}
	public void clickOnHolidayCalendar()
	{
		holidayform_link.click();
	}
	public void clickOnAddHolidayButton()
	{
		addholiday_button.click();
	}
	public void selectHolidayDate(String HolidayDate)
	{
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+HolidayDate+"';", holidaydate_datepicker);
	}
	public void setHolidayDescription(String HolidayDescription)
	{
		holidaydescription_txtbox.sendKeys(HolidayDescription);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	

	
	
	public void setSearchBox(String SearchBox)
	{
		search_txtbox.sendKeys(SearchBox);
	}
	public void clickOnStatusToggleButton()
	{
		status_togglebutton.click();
	}
	public void clickOnYesButton()
	{
		yes_button.click();
	}
	public void setReason(String Reason)
	{
		reason_txtbox.sendKeys(Reason);
	}
	public void clickOnStatusSaveButton()
	{
		statussave_button.click();
	}
	public void clickOnStatusOkConfirmButton()
	{
		statusconfirmok_button.click();
	}
	public String getStatusActualResponseMessage()
	{
		return statusresponse_message.getText();
	}
	
	
	public void clickOnEditButton()
	{
		edit_button.click();
	}
	public void setEditDescription(String EditDescription)
	{
		holidaydescription_txtbox.clear();
		holidaydescription_txtbox.sendKeys(EditDescription);
	}
	public void clickOnEditSaveButton()
	{
		editsave_button.click();
	}
	public String getEditActualResponseMessage()
	{
		return editresponse_message.getText();
	}
	public void clickOnEditConfirmOkButton()
	{
		editconfirmok_button.click();
	}
	
}