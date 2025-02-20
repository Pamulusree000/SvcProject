package com.SvcProject.PageLayer;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class LeavePage extends TestBase{

	
	public LeavePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------Variables--------------------------------------
	
	
	@FindBy(xpath="//span[text()='Others']")
	private WebElement othersmodule_link;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leaveform_link;
	
	@FindBy(id="btnNew")
	private WebElement addleave_button;
	
	@FindBy(xpath="//input[@id='LeaveUserType']/..")
	private List<WebElement> leaverequestfor_radiobutton;
	
	@FindBy(xpath="//div[@id='ddlRoleName_chosen']/a/span")
	private WebElement role_listbox;
	
	@FindBy(xpath="//div[@id='ddlRoleName_chosen']/div//input")
	private WebElement role_txtbox;
	
	@FindBy(xpath="//div[@id='ddlUserName_chosen']/a/span")
	private WebElement name_listbox;
	
	@FindBy(xpath="//div[@id='ddlUserName_chosen']/div//input")
	private WebElement name_txtbox;
	
	@FindBy(xpath="//input[@name='optradio']/..")
	private List<WebElement> leavetype_radiobutton;
	
	@FindBy(id="txtLeaevReason")
	private WebElement reason_txtbox;
	
	@FindBy(id="txtFromDate")
	private WebElement fromdate_datepicker;
	
	@FindBy(id="txtToDate")
	private WebElement todate_datepicker;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.swal2-confirm")
	private WebElement yes_button;
	
	@FindBy(css="button.swal2-confirm")
	private WebElement ok_button;
	
	
	//------------------------------Methods--------------------------------------------------------------
	
	
	public void clickOnOtherModule()
	{
		othersmodule_link.click();
	}
	public void clickOnLeaveForm()
	{
		leaveform_link.click();
	}
	public void clickOnAddLeaveButton() 
	{
		addleave_button.click();
	}
	public void selectLeaveRequest(String LeaveRequestFor)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		for(int i=0; i<leaverequestfor_radiobutton.size(); i++)
		{
			if(leaverequestfor_radiobutton.get(i).getText().trim().equalsIgnoreCase(LeaveRequestFor))
			{
				jse.executeScript("arguments[0].click();", leaverequestfor_radiobutton.get(i));
				break;
			}
		}
	}
	public void selectRole(String Role)
	{
		role_listbox.click();
		role_txtbox.sendKeys(Role,Keys.ENTER);
	}
	public void selectName(String Name)
	{
		name_listbox.click();
		name_txtbox.sendKeys(Name,Keys.ENTER);
		
	}
	public void selectLeaveType(String LeaveType)
	{
		for(int i=0; i<leavetype_radiobutton.size(); i++)
		{
			if(leavetype_radiobutton.get(i).getText().trim().equalsIgnoreCase(LeaveType))
			{
				leavetype_radiobutton.get(i).click();
				break;
			}
		}
	}
	
	public void setReasonTextBox(String Reason)
	{
		reason_txtbox.sendKeys(Reason);
	}
	public void selectFromDate(String Fromdate)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+Fromdate+"';", fromdate_datepicker);
	}
	public void selectToDate(String Todate)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+Todate+"';", todate_datepicker);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public void clickOnYesButton()
	{
		yes_button.click();
	}
	public void clickOnOkButton()
	{
		ok_button.click();
	}
	
	
	
}
