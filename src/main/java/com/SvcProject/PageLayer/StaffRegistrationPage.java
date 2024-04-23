package com.SvcProject.PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class StaffRegistrationPage extends TestBase{

	public  StaffRegistrationPage ()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//-------------------------------------------Variables------------------------------------------
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement adminmodule_link;
	
	@FindBy(xpath="//span[text()='Staff Registration']")
	private WebElement staffregistration_link;
	
	@FindBy(id="btnNew")
	private WebElement addstaff_button;
	
	@FindBy(id="txtOtherStaffFistName")
	private WebElement staffname_txtbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffGender_chosen']/a/span")
	private WebElement staffgender_listbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffGender_chosen']/div/div/input")
	private WebElement staffgender_txtbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffMarritalStatus_chosen']/a/span")
	private WebElement staffmaritalstatus_listbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffMarritalStatus_chosen']/div/div/input")
	private WebElement staffmaritalstatus_txtbox;
	
	@FindBy(id="txtOtherStaffAadharNo")
	private WebElement staffaadharno_txtbox;
	
	@FindBy(id="txtOtherStaffMobileNo")
	private WebElement staffmobileno_txtbox;
	
	@FindBy(id="VerifyOTP")
	private WebElement verifyotp_link;
	
	@FindBy(id="txtfOTP")
	private WebElement otp_txtboxes;
	
	@FindBy(id="btnValidate")
	private WebElement validateotp_button;
	
	@FindBy(id="txtOtherStaffEmailId")
	private WebElement staffemailid_txtbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffRole_chosen']/a/span")
	private WebElement staffrole_listbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffRole_chosen']/div/div/input")
	private WebElement staffrole_txtbox;
	
	@FindBy(xpath="//div[@id='ddlLstHealthCentre_chosen']/a/span")
	private WebElement svc_listbox;
	
	@FindBy(xpath="//div[@id='ddlLstHealthCentre_chosen']/div/div/input")
	private WebElement svc_txtbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffCountry_chosen']/a/span")
	private WebElement staffcountry_listbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffCountry_chosen']/div/div/input")
	private WebElement staffcountry_txtbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffState_chosen']/a/span")
	private WebElement staffstate_listbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffState_chosen']/div/div/input")
	private WebElement staffstate_txtbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffCity_chosen']/a/span")
	private WebElement staffcity_listbox;
	
	@FindBy(xpath="//div[@id='ddlOtherStaffCity_chosen']/div/div/input")
	private WebElement staffcity_txtbox;
	
	@FindBy(id="txtOtherStaffHouseNo")
	private WebElement staffhouseno_txtbox;
	
	@FindBy(id="txtOtherStaffStreet")
	private WebElement staffstreet_txtbox;
	
	@FindBy(id="txtOtherStaffAreaName")
	private WebElement staffareaname_txtbox;
	
	@FindBy(id="txtOtherStaffPinCode")
	private WebElement staffpincode_txtbox;
	
	@FindBy(id="OtherStaffCollege")
	private WebElement staffcollege_txtbox;
	
	@FindBy(xpath="//table[@id='grdQualificationDetails']/tbody/tr/td[3]/div//span")
	private WebElement staffdegree_listbox;
	
	@FindBy(xpath="//table[@id='grdQualificationDetails']/tbody/tr/td[3]/div/div//input")
	private WebElement staffdegree_txtbox;
	
	@FindBy(xpath="//table[@id='grdQualificationDetails']/tbody/tr/td[4]/div//span")
	private WebElement staffyear_listbox;
	
	@FindBy(xpath="//table[@id='grdQualificationDetails']/tbody/tr/td[4]/div/div//input")
	private WebElement staffyear_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmokbutton;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message;
	
	
	//---------------------------------------Methods-------------------------------------------------------------
	
	
	public void clickOnAdminModule()
	{
		adminmodule_link.click();
	}
	
	public void clickOnStaffRegistration() 
	{
		staffregistration_link.click();
	}
	public void clickOnAddStaffbutton()
	{
		addstaff_button.click();
	}
	public void setStaffName(String StaffName)
	{
		staffname_txtbox.sendKeys(StaffName);
	}
	public void selectStaffGender(String StaffGender)
	{
		staffgender_listbox.click();
		staffgender_txtbox.sendKeys(StaffGender,Keys.ENTER);
	}
	public void selectStaffMaritalStatus(String StaffMaritalStatus)
	{
		staffmaritalstatus_listbox.click();
		staffmaritalstatus_txtbox.sendKeys(StaffMaritalStatus,Keys.ENTER);
	}
	public void setStaffAadharNo(String StaffAadharNo)
	{
		staffaadharno_txtbox.sendKeys(StaffAadharNo);
	}
	public void setStaffMobileNo(String StaffMobileNo,String Otp)
	{
		staffmobileno_txtbox.sendKeys(StaffMobileNo);
		verifyotp_link.click();
		otp_txtboxes.sendKeys(Otp);
		validateotp_button.click();
	}
	public void setStaffEmailId(String StaffEmailId)
	{
		staffemailid_txtbox.sendKeys(StaffEmailId);
	}
	public void selectStaffRole(String StaffRole)
	{
		staffrole_listbox.click();
		staffrole_txtbox.sendKeys(StaffRole,Keys.ENTER);
	}
	
	public void selectSvc(String Svc) 
	{
		svc_listbox.click();
		svc_txtbox.sendKeys(Svc,Keys.ENTER);
	}
	public void selectStaffCountry(String StaffCountry)
	{
		staffcountry_listbox.click();
		staffcountry_txtbox.sendKeys(StaffCountry,Keys.ENTER);
	}
	public void selectStaffState(String StaffState)
	{
		staffstate_listbox.click();
		staffstate_txtbox.sendKeys(StaffState,Keys.ENTER);
	}
	public void selectStaffCity(String StaffCity) 
	{
		staffcity_listbox.click();
		staffcity_txtbox.sendKeys(StaffCity,Keys.ENTER);
	}
	public void setStaffHouseNo(String StaffHouseNo)
	{
		staffhouseno_txtbox.sendKeys(StaffHouseNo);
	}
	public void setStaffStreet(String StaffStreet)
	{
		staffstreet_txtbox.sendKeys(StaffStreet);
	}
	public void setStaffAreaName(String StaffAreaName)
	{
		staffareaname_txtbox.sendKeys(StaffAreaName);
	}
	public void setStaffPincode(String StaffPincode)
	
	{
		staffpincode_txtbox.sendKeys(StaffPincode);
	}
	public void setStaffCollege(String StaffCollege)
	{
		staffcollege_txtbox.sendKeys(StaffCollege);
	}
	public void selectStaffDegree(String StaffDegree)
	{
		staffdegree_listbox.click();
		staffdegree_txtbox.sendKeys(StaffDegree,Keys.ENTER);
	}
	public void selectStaffYear(String StaffYear)
	{
		staffyear_listbox.click();
		staffyear_txtbox.sendKeys(StaffYear,Keys.ENTER);
	}
	public void clickOnSaveButton() 
	{
		save_button.click();
	}
	public void clickOnConfirmOkButton()
	{
		confirmokbutton.click();
	}
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	
	
	
}

