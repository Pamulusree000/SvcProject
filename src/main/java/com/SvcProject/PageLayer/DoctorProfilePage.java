package com.SvcProject.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class DoctorProfilePage extends TestBase{

	
	
	public DoctorProfilePage ()
	{
		PageFactory.initElements(driver, this);
	}
	//---------------------------------- Variables-------------------------------------------------
	
	@FindBy(xpath="//ul[@id='Modules']//li[3]/a/span[text()='My Profile']")
	private WebElement doctorprofile_link;
	
	@FindBy(id="btnUpdate")
	private WebElement updateprofile_button;
	
	@FindBy(id="txtDoctorName")
	private WebElement doctorname_txtbox;
	
	@FindBy(id="ddlDoctorGender_chosen")
	private WebElement gender_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctorGender_chosen']/div/div/input")
	private WebElement gender_txtbox;
	
	@FindBy(id="txtDoctorMobileNo")
	private WebElement mobileno_txtbox;
	
	@FindBy(id="VerifyOTP")
	private WebElement mobileverifyotp_link;
	
	@FindBy(id="txtfOTP")
	private WebElement otp_txtboxs;
	
	@FindBy(id="btnValidate")
	private WebElement validateotp_btn;
	
	@FindBy(id="txtDoctorEmailId")
	private WebElement emailid_txtbox;
	
	@FindBy(id="txtDoctorDOB")
	private WebElement dateofbirth_datepicker;
	
	@FindBy(id="ddlDoctorCountry_chosen")
	private WebElement country_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctorCountry_chosen']/div/div/input")
	private WebElement country_txtbox;
	
	@FindBy(id="ddlDoctorState_chosen")
	private WebElement state_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctorState_chosen']/div/div/input")
	private WebElement state_txtbox;
	
	@FindBy (id="ddlDoctorDistrict_chosen")
	private WebElement district_listbox;
	
	@FindBy(xpath="//div[@class='col-sm-12']/div/div/div[3]")
	private WebElement scrolldown_option;
	
	@FindBy(xpath="//div[@id='ddlDoctorDistrict_chosen']/div/div/input")
	private WebElement district_txtbox;
	
	@FindBy(id="txtDoctorPinCode")
	private WebElement pincode_txtbox;
	
	@FindBy(id="ddlSpecialization_chosen")
	private WebElement specialization_listbox;
	
	@FindBy(xpath="//div[@id='ddlSpecialization_chosen']/div/div/input")
	private WebElement specialization_txtbox;
	
	@FindBy(id="txtDoctorMedicalLicenseNo")
	private WebElement licenseno_txtbox;
	
	@FindBy(id="ddlDoctorMedicalLicenseCountry_chosen")
	private WebElement licensecountry_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctorMedicalLicenseCountry_chosen']/div/div/input")
	private WebElement licensecountry_txtbox;
	
	@FindBy(id="ddlDoctorMedicalLicenseState_chosen")
	private WebElement licensestate_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctorMedicalLicenseState_chosen']/div/div/input")
	private WebElement licensestate_txtbox;
	
	@FindBy(id="ddlDoctorType_chosen")
	private WebElement doctortype_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctorType_chosen']/div/div/input")
	private WebElement doctortype_txtbox;
	
	@FindBy(css="label.tgl-btn")
	private WebElement virtualclinicpart_togglebtn;
	
	@FindBy(id="ddlDoctorCommandCenter_chosen")
	private WebElement commandcenter_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctorCommandCenter_chosen']/div/div/input")
	private WebElement commandcenter_txtbox;
	
	@FindBy(id="DoctorCollege")
	private WebElement doctorcollge_txtbox;
	
	@FindBy(xpath="//select[@name='DoctorDegree']/following-sibling::div/a/span")
	private WebElement degree_listbox;
	
	@FindBy(xpath="//select[@name='DoctorDegree']/following-sibling::div//input")
	private WebElement degree_txtbox;
	
	@FindBy(xpath="//table[@id='grdQualificationDetails']/tbody/tr/td[4]//span")
	private WebElement year_listbox;
	
	@FindBy(xpath="//table[@id='grdQualificationDetails']/tbody/tr/td[4]/div//input")
	private WebElement year_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_btn;
	
	@FindBy(css="button.confirm")
	private WebElement ok_btn;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message;
	
	
	//----------------------------Methods-----------------------------------------------------
	
	
	public void clickOnDoctorProfileLink()
	{
		doctorprofile_link.click();
	}
	public void clickOnUpdateProfileButton()
	{
		updateprofile_button.click();
	}
	public void setDoctorName(String DoctorName)
	{
		doctorname_txtbox.clear();
		doctorname_txtbox.sendKeys(DoctorName);
	}
	
	public void selectgender(String Gender)
	{
		gender_listbox.click();
		gender_txtbox.sendKeys(Gender,Keys.ENTER);
	}
	
	public void setMobileNo(String MobileNo,String Otp)
	{
		mobileno_txtbox.clear();
		mobileno_txtbox.sendKeys(MobileNo);
		mobileverifyotp_link.click();
		otp_txtboxs.sendKeys(Otp);
		validateotp_btn.click();
	}
	public void setEmailId(String EmailId)
	{
		emailid_txtbox.clear();
		emailid_txtbox.sendKeys(EmailId);
	}
	public void selectDateOfBirth(String DateOfBirth) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+DateOfBirth+"';", dateofbirth_datepicker);
	}
	public void selectCountry(String Country)
	{
		country_listbox.click();
		country_txtbox.sendKeys(Country,Keys.ENTER);
	}
	
	public void selectState(String State)
	{
		state_listbox.click();
		state_txtbox.sendKeys(State,Keys.ENTER);
		
	}
	public void selectDistrict(String District) throws InterruptedException
	{
		//UtilClass util=new UtilClass();
		district_listbox.click();
		district_txtbox.sendKeys(District,Keys.ENTER);
		//util.scrollToElementDown(scrolldown_option);
	}
	public void setPincode(String Pincode)
	{
		pincode_txtbox.clear();
		pincode_txtbox.sendKeys(Pincode);
	}
	public void selectSpecialization(String Specialization)
	{
		specialization_listbox.click();
		specialization_txtbox.sendKeys(Specialization,Keys.ENTER);
	}
	public void setLicenseNo(String Licenseno)
	{
		licenseno_txtbox.clear();
		licenseno_txtbox.sendKeys(Licenseno);
	}
	public void selectLicenseCountry(String LicenseCountry)
	{
		licensecountry_listbox.click();
		licensecountry_txtbox.sendKeys(LicenseCountry,Keys.ENTER);
	}
	public void selectLicenseState(String LicenseState)
	{
		licensestate_listbox.click();
		licensestate_txtbox.sendKeys(LicenseState,Keys.ENTER);
	}
	public void selectDoctorType(String DoctorType)
	{
		doctortype_listbox.click();
		doctortype_txtbox.sendKeys(DoctorType,Keys.ENTER);
		
	}
	public void clickOnVirtualClinicToggleBtn()
	{
		virtualclinicpart_togglebtn.click();
	}
	public void selectCommandCenter(String CommandCenter)
	{
		commandcenter_listbox.click();
		commandcenter_txtbox.sendKeys(CommandCenter,Keys.ENTER);
	}
	public void setDoctorCollge(String DoctorCollge)
	{
		doctorcollge_txtbox.clear();
		doctorcollge_txtbox.sendKeys(DoctorCollge);
	}
	public void selectDegree(String Degree)
	{
		degree_listbox.click();
		degree_txtbox.sendKeys(Degree,Keys.ENTER);
	}
	public void selectYear(String Year )
	{
		year_listbox.click();
		year_txtbox.sendKeys(Year,Keys.ENTER);
	}
	public void clickOnSaveBtn()
	{
		save_btn.click();
	}
	
	public void clickOnOkBtn()
	{
		ok_btn.click();
	}
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	
}
