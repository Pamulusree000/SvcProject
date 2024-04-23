package com.SvcProject.PageLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



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
	
}
