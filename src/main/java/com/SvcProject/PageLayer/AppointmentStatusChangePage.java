package com.SvcProject.PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class AppointmentStatusChangePage extends TestBase{

	
	public AppointmentStatusChangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------------Variables-----------------------------------
	
	
	@FindBy(xpath="//span[text()='Support']")
	private WebElement supportmodule_link;
	
	@FindBy(xpath="//span[text()='Appointment Status Change']")
	private WebElement appointmentstatuschangeform_link;
	
	@FindBy(xpath="//div[@id='ddlHealthCenterName_chosen']/a/span")
	private WebElement svcname_listbox;
	
	@FindBy(xpath="//div[@id='ddlHealthCenterName_chosen']/div//input")
	private WebElement svcname_txtbox;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search_box;
	
	@FindBy(xpath="//a[@title='Click Here To Change']")
	private WebElement revertstatus_link;
	
	@FindBy(xpath="//div[@id='ddlAppointmentStatus_chosen']/a/span")
	private WebElement statustype_listbox;
	
	@FindBy(xpath="//div[@id='ddlAppointmentStatus_chosen']/div//input")
	private WebElement statustype_txtbox;
	
	@FindBy(id="txtAppCancelReason")
	private WebElement reason_txtbox;
	
	@FindBy(xpath="//button[@onclick='ChangeStatus()']")
	private WebElement update_button;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement yes_button;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement confirmok_button;
	
	@FindBy(id="swal2-title")
	private WebElement response_message;
	
	
	//--------------------------Methods-------------------------------------------------------------
	
	
	
	public void clickOnSupportModuleLink()
	{
		supportmodule_link.click();
	}
	public void clickOnAppointmentStatusChangeForm()
	{
		appointmentstatuschangeform_link.click();
	}
	public void selectSvcName(String SvcName)
	{
		svcname_listbox.click();
		svcname_txtbox.sendKeys(SvcName,Keys.ENTER);
	}
	public void setSearch(String Search)
	{
		search_box.sendKeys(Search);
	}
	public void clickOnRevertStatusLink()
	{
		revertstatus_link.click();
	}
	public void selectStatusType(String StatusType)
	{
		statustype_listbox.click();
		statustype_txtbox.sendKeys(StatusType,Keys.ENTER);
	}
	public void setReason(String Reason)
	{
		reason_txtbox.sendKeys(Reason);
	}
	public void clickOnUpdateButton()
	{
		update_button.click();
	}
	public void clickOnYesButton()
	{
		yes_button.click();
	}
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}

	
}
