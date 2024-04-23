package com.SvcProject.PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class SvcRegistrationPage extends TestBase{

	
	public SvcRegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------------------------Variables--------------------------------------------------------------------
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin_link;
	
	@FindBy(xpath="//span[text()='SVC Registration']")
	private WebElement svcregistratin_link;
	
	@FindBy(id="btnNew")
	private WebElement createsvc_button;
	
	@FindBy(id="txtHealthCenterCode")
	private WebElement svccode_txtbox;
	
	@FindBy(id="txtHealthCenterName")
	private WebElement svcname_txtbox;
	
	@FindBy(id="txtHealthCenterShortName")
	private WebElement svcshortname_txtbox;
	
	@FindBy(id="txtHealthCenterAddress")
	private WebElement svcaddress_txtbox;
	
	@FindBy(id="txtHealthCentreLandMark")
	private WebElement svclandmark_txtbox;
	
	@FindBy(id="txtHealthCenterPhone")
	private WebElement svcmobileno_txtbox;
	
	@FindBy(xpath="//div[@id='ddlHealthCenterConstituency_chosen']/a/span")
	private WebElement svcconstituency_listbox;
	
	@FindBy(xpath="//div[@id='ddlHealthCenterConstituency_chosen']/div/div/input")
	private WebElement svcconstituency_txtbox;
	
	@FindBy(xpath="//div[@id='ddlHealthCenterWard_chosen']/a/span")
	private WebElement svcward_listbox;
	
	@FindBy(xpath="//div[@id='ddlHealthCenterWard_chosen']/div/div/input")
	private WebElement svcward_txtbox;
	
	@FindBy(id="txtHealthCenterPinCode")
	private WebElement svcpincode_txtbox;
	
	@FindBy(id="txtHealthCenterContactName")
	private WebElement svccontactname_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message;
	
	
	//-------------------------------------------Methods----------------------------------------------------------------------
	
	
	
	public void clickOnAdmin()
	{
		admin_link.click();
	}
	public void clickOnStaffRegistration()
	{
		svcregistratin_link.click();
	}
	public void clickOnCreateSvcButton()
	{
		createsvc_button.click();
	}
	public void setSvcCode(String SvcCode)
	{
		svccode_txtbox.sendKeys(SvcCode);
	}
	public void setSvcName(String SvcName)
	{
		svcname_txtbox.sendKeys(SvcName);
	}
	public void setSvcShortName(String SvcShortName)
	{
		svcshortname_txtbox.sendKeys(SvcShortName);
	}
	public void setSvcAddress(String SvcAddress)
	{
		svcaddress_txtbox.sendKeys(SvcAddress);
	}
	public void setSvcLandMark(String SvcLandMark)
	{
		svclandmark_txtbox.sendKeys(SvcLandMark);
	}
	public void setSvcMobileNo(String SvcMobileNo)
	{
		svcmobileno_txtbox.sendKeys(SvcMobileNo);
	}
	public void selectSvcConstituency(String SvcConstituency)
	
	{
		svcconstituency_listbox.click();
		svcconstituency_txtbox.sendKeys(SvcConstituency,Keys.ENTER);
	}
	public void selectSvcWard(String SvcWard)
	{
		svcward_listbox.click();
		svcward_txtbox.sendKeys(SvcWard,Keys.ENTER);
	}
	public void setSvcPincode(String SvcPincode)
	{
		svcpincode_txtbox.sendKeys(SvcPincode);
	}
	public void setSvcContactName(String SvcContactName)
	{
		svccontactname_txtbox.sendKeys(SvcContactName);
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
	
}