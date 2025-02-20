package com.SvcProject.PageLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.WebDriverUtils;



public class PatientRegistrationPage extends TestBase{

	
	public PatientRegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//-------------------------------------Variables--------------------------------------
	
	
	@FindBy(xpath="//div[@id='remove-scroll']/div//li[3]/a/span[text()='Patient Registration']") 
	private WebElement patientregistration_link;
	
	@FindBy(id="btnNew")
	private WebElement addpatient_Btn;
	
	@FindBy(id="txtPatientName")
	private WebElement patientregname_txtbox;
	
	@FindBy(id="txtPatientDOB")
	private WebElement patientregdateofbirth_txtbox;
	
	@FindBy(id="txtPatientAge")
	private WebElement patientregage_txtbox;
	
	@FindBy(id="ddlPatientSpouseRelation_chosen")
	private WebElement patientregrelationship_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatientSpouseRelation_chosen']/div/div/input")
	private WebElement patientregrelationship_txtbox;
	
	@FindBy(id="txtPatientSpouseName")
	private WebElement patientregrelationshipname_txtbox;
	
	@FindBy(id="txtPatientPinCode")
	private WebElement patientregpincode_txtbox;
	
	@FindBy(css="div#ddlPatientGender_chosen")
	private WebElement patientreggender_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatientGender_chosen']/div/div/input")
	private WebElement patientreggender_txtbox;
	
	@FindBy(id="txtPatientMobileNo")
	private WebElement patientregmobileno_txtbox;
	
	@FindBy(id="VerifyOTP")
	private WebElement patientregverifyotp_link;
	
	@FindBy(id="txtfOTP")
	private WebElement patientregotp_txtboxs;
	
	@FindBy(id="btnValidate")
	private WebElement patientregvalidateotp_btn;
	
	@FindBy(id="ddlPreferedHealthCenter_chosen")
	private WebElement patientregpreferredsvc_listbox;
	
	@FindBy(xpath="//div[@id='ddlPreferedHealthCenter_chosen']/div/div/input")
	private WebElement patientregpreferredsvc_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement patientregsave_Btn;
	
	@FindBy(css="button.confirm")
	private WebElement Patientregsuccessfullok_btn;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement responsemessage;
	
	@FindBy(css="#grdPatientDetails tr>td:nth-child(2)")
	private List<WebElement> PatientName_txt;
	
	
	
	@FindBy(xpath="//input[@type=\"search\"]")
	private WebElement search_txtbox;
	
	@FindBy(xpath="//a[@title='Click Here to Delete']")
	private WebElement griddelete_button;
	
	@FindBy(css="button.confirm")
	private WebElement delete_button;
	
	@FindBy(id="txtReason")
	private WebElement deleteReason_txtbox;
	
	@FindBy(id="btnDelete")
	private WebElement deleteaccount_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::h2")
	private WebElement deleteresponse_message;
	
	@FindBy(css="button.confirm")
	private WebElement deleteconfirmok_button;
	
	
	
	@FindBy(css="label.tgl-btn[for*='switch']")
	private WebElement status_togglebutton;
	
	@FindBy(css="button.confirm")
	private WebElement deactivate_button;
	
	@FindBy(id="txtReason")
	private WebElement deactivatereason_txtbox;
	
	@FindBy(id="btnDeactivate")
	private WebElement confirmdeactivate_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::h2")
	private WebElement deactivateresponse_message;
	
	@FindBy(css="button.confirm")
	private WebElement deactivateconfirmok_button;
	
	
	
	@FindBy(xpath="//a[@title=\"Click here to View\"]")
	private WebElement view_button;
	
	@FindBy(id="btnClose")
	private WebElement close_button;
	
	
	
	@FindBy(xpath="//a[@title='Click here to Edit']")
	private WebElement edit_button;
	
	@FindBy(id="btnSave")
	private WebElement update_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement updateresponse_message;
	
	@FindBy(css="button.confirm")
	private WebElement updateconfirmok_button;
	
	
	//------------------------------------------------Methods-----------------------------------------------------
	
	
	
	public void clickOnPatientRegistrationLink()
	{
		patientregistration_link.click();
		
	}
	
	public void clickOnAddPatientBtn()
	{
		addpatient_Btn.click();
	}
	
	public void setPatientRegName(String RegName)
	{
		patientregname_txtbox.sendKeys(RegName);
	}
	
	public void setPatientRegAge(String RegAge)
	{
		patientregage_txtbox.sendKeys(RegAge);
	}
	
	public void selectPatientRegRelationship(String RegRelationship)
	{
		patientregrelationship_listbox.click();
		patientregrelationship_txtbox.sendKeys(RegRelationship,Keys.ENTER);
		
	}
	public void setPatientRegRelationshipName(String RegRelationshipName)
	{
		patientregrelationshipname_txtbox.sendKeys(RegRelationshipName);
	}
	public void setPatientRegPincode(String RegPincode)
	{
		patientregpincode_txtbox.sendKeys(RegPincode);
	}
	
	public void selectPatientRegGender(String RegGender)
	{
		patientreggender_listbox.click();
		patientreggender_txtbox.sendKeys(RegGender,Keys.ENTER);
	}
	
	public void enterRegMobileNo(String RegMobileno,String RegOtp)
	{
		patientregmobileno_txtbox.sendKeys(RegMobileno);
		patientregverifyotp_link.click();
		patientregotp_txtboxs.sendKeys(RegOtp);
		patientregvalidateotp_btn.click();
	
	}
	
	public void selectPatientRegReferredsvc(String RegReferredSvc)
	{
		patientregpreferredsvc_listbox.click();
		patientregpreferredsvc_txtbox.sendKeys(RegReferredSvc,Keys.ENTER);
		
	}
	public void clickOnPatientRegSaveBtn()
	{
		patientregsave_Btn.click();
	}
	
	public void clickOnPatientSuccessfullOkBtn()
	{
		Patientregsuccessfullok_btn.click();
	}
	
	public String getActualResponseMessage()
	{
		return responsemessage.getText();
	}
	
	public List<String> getAllPatientsName(){
		List<String> allPatient = new ArrayList<>();
		for(WebElement patients_txt: PatientName_txt) {
			allPatient.add(patients_txt.getText());
		}	
		return allPatient;
	}
	
	//---------------------------deleteaccount----------------------------
	
	public void setDeleteAccountSearch(String DeleteAccountSearch)
	{
		search_txtbox.sendKeys(DeleteAccountSearch);
	}
	public void clickOnGridDeleteButton()
	{
		griddelete_button.click();
	}
	public void clickOnDeleteButton()
	{
		delete_button.click();
	}
	public void setDeleteReason(String DeleteReason)
	{
		deleteReason_txtbox.sendKeys(DeleteReason);
	}
	public void clickOnDeleteAccountButton()
	{
		deleteaccount_button.click();
	}
	public String getActualDeleteResponseMessage()
	{
		return deleteresponse_message.getText();
	}
	public void clickOnDeleteConfirmOkButton()
	{
		deleteconfirmok_button.click();
	}
	//---------------------------accountstatus-----------------------------------
	
	public void setAccountStatusSearch(String AccountStatusSearch)
	{
		search_txtbox.sendKeys(AccountStatusSearch);
	}
	public void clickOnStatusToggleButton()
	{
		status_togglebutton.click();
	}
	public void clickOnDeactivateButton()
	{
		deactivate_button.click();
	}
	public void setDeactivateReason(String DeactivateReason)
	{
		deactivatereason_txtbox.sendKeys(DeactivateReason);
	}
	public void clickOnConfirmDeactivateButton()
	{
		confirmdeactivate_button.click();
	}
	public String getActualDeactivateResponseMessage()
	{
		return deactivateresponse_message.getText();
	}
	public void clickOnDeactivateConfirmOkButton()
	{
		deactivateconfirmok_button.click();
	}
	//--------------------------view-------------------------------------------
	
	public void setViewPatientSearch(String ViewPatientSearch)
	{
		search_txtbox.sendKeys(ViewPatientSearch);
	}
	public void clickOnViewButton()
	{
		view_button.click();
	}
	public void clickOnCloseButton()
	{
		close_button.click();
	}
	//----------------------------edit-------------------------------------------
	
	
	
	public void setEditSearchBox(String EditSearch)
	{
		search_txtbox.sendKeys(EditSearch);
	}
	
	public void clickOnEditButton()
	{
		edit_button.click();
	}
	public void setEditPatientRegName(String RegName)
	{
		patientregname_txtbox.clear();
		patientregname_txtbox.sendKeys(RegName);
	}
	public void setEditPatientRegAge(String RegAge)
	{
		patientregage_txtbox.clear();
		patientregage_txtbox.sendKeys(RegAge);
	}
	public void setEditPatientRegRelationshipName(String RegRelationshipName)
	{
		patientregrelationshipname_txtbox.clear();
		patientregrelationshipname_txtbox.sendKeys(RegRelationshipName);
	}
	public void setEditPatientRegPincode(String RegPincode)
	{
		patientregpincode_txtbox.clear();
		patientregpincode_txtbox.sendKeys(RegPincode);
	}
	public void enterEditRegMobileNo(String RegMobileno,String RegOtp)
	{
		patientregmobileno_txtbox.clear();
		patientregmobileno_txtbox.sendKeys(RegMobileno);
		patientregverifyotp_link.click();
		patientregotp_txtboxs.sendKeys(RegOtp);
		patientregvalidateotp_btn.click();
	
	}
	public void clickOnUpdateButton()
	{
		update_button.click();
	}
	public String getUpdateResponseMessage()
	{
		return updateresponse_message.getText();
	}
	public void clickOnUpdateConfirmOkButton()
	{
		updateconfirmok_button.click();
	}
	
	
}
