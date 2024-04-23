package com.SvcProject.PageLayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.SvcProject.TestBase.TestBase;
import com.SvcProject.Utilities.PropertiesFile;


public class PatientProfilePage extends TestBase {
	
	

	public PatientProfilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//----------------------------Variables--------------------------------------------------------------------
	
	@FindBy(xpath="//div[@id='remove-scroll']/div/ul//li/a/span[text()='My Profile']")
	private WebElement myProfile_link;
	
	@FindBy(xpath="//button[text()='Update Profile']")
	private WebElement updateProfile_btn;
	
	@FindBy(id="txtPatientName")
	private WebElement patientname_txtbox;
	
	@FindBy(id="txtPatientDOB")
	private WebElement patientdateofbirth_txtbox;
	
	@FindBy(id="txtPatientAge")
	private WebElement patientage_txtbox;
	
	@FindBy(css="div#ddlPatientSpouseRelation_chosen")
	private WebElement relationship_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatientSpouseRelation_chosen']/div/div/input")
	private WebElement relationship_textbox;
	
	@FindBy(id="txtPatientSpouseName")
	private WebElement relationshipname_txtbox;
	
	@FindBy(id="txtPatientPinCode")
	private WebElement patientpincode_txtbox;
	
	@FindBy(css="div#ddlPatientGender_chosen")
	private WebElement gender_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatientGender_chosen']/div/div/input")
	private WebElement gender_txtbox;
	
	@FindBy(id="txtPatientMobileNo")
	private WebElement patientmobileno_txtbox;
	
	@FindBy(id="VerifyOTP")
	private WebElement verify_link;
	
	@FindBy(id="txtfOTP")
	private WebElement otp_txtboxs;
	
	@FindBy(id="btnValidate")
	private WebElement validate_btn;
	
	@FindBy(css="div#ddlPreferedHealthCenter_chosen")
	private WebElement preferredsvc_listbox;
	
	@FindBy(xpath="//div[@id='ddlPreferedHealthCenter_chosen']/div/div/input")
	private WebElement preferredsvc_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement update_btn;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert showSweetAlert visible')]/div[4]/following::p[1]")
	private WebElement responsemessage;
	

	@FindBy(id="btnAdd")
	private WebElement recorddata_button;
	
	@FindBy(id="HEIGHT")
	private WebElement height_option;
	
	@FindBy(id="txtHeightinFt")
	private WebElement heightft_txtbox;
	
	@FindBy(id="txtHeightInches")
	private WebElement heightinches_txtbox;
	
	@FindBy(id="btnSaveHeight")
	private WebElement heightsave_button;
	
	@FindBy(id="WEIGHT")
	private WebElement weight_option;
	
	@FindBy(id="txtWeight")
	private WebElement weight_txtbox;
	
	@FindBy(id="btnSaveWeight")
	private WebElement weightsave_button;
	
	@FindBy(id="BLOOD GLUCOSE")
	private WebElement bloodglucose_option;
	
	@FindBy(id="txtPatientGlucoseLevel")
	private WebElement bloodglucosereadings_txtbox;
	
	@FindBy(xpath="//div[@id='ddlPatientGlucose_chosen']/a/span")
	private WebElement type_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatientGlucose_chosen']/div/div/input")
	private WebElement type_txtbox;
	
	@FindBy(id="btnSaveBG")
	private WebElement bloodglucosesave_button;
	
	@FindBy(id="BLOOD PRESSURE")
	private WebElement bloodpressue_option;
	
	@FindBy(id="txtBPSystolic")
	private WebElement systolicupper_txtbox;
	
	@FindBy(id="txtBPDiastolic")
	private WebElement diastoliclower_txtbox;
	
	@FindBy(id="btnSaveBP")
	private WebElement bpsave_button;
	
	@FindBy(id="FAMILY HISTORY")
	private WebElement familyhistory_option;
	
	@FindBy(xpath="//div[@id='ddlFHRelation_chosen']/a/span")
	private WebElement familymedicalrelationship_listbox;
	
	@FindBy(xpath="//div[@id='ddlFHRelation_chosen']/div/div/input")
	private WebElement familymedicalrelatinship_txtbox;
	
	@FindBy(id="txtFHCondition")
	private WebElement condition_txtbox;
	
	@FindBy(id="rdMedium")
	private WebElement severity_raidobutton;
	
	@FindBy(id="btnSaveFamilyMedicalHis")
	private WebElement familymedicalhissave_button;
	
	@FindBy(id="ALLERGY")
	private WebElement allergy_option;
	
	@FindBy(id="txtAllergy")
	private WebElement allergy_txtbox;
	
	@FindBy(xpath="//div[@id='ddlAllergyType_chosen']/a/span")
	private WebElement allergytype_listbox;
	
	@FindBy(xpath="//div[@id='ddlAllergyType_chosen']/div/div/input")
	private WebElement allergytype_txtbox;
	
	@FindBy(xpath="//div[@id='ddlAllergyReaction_chosen']/a/span")
	private WebElement allergyreaction_listbox;
	
	@FindBy(xpath="//div[@id='ddlAllergyReaction_chosen']/div/div/input")
	private WebElement allergyreaction_txtbox;
	
	@FindBy(id="btnSaveAllergy")
	private WebElement allergysave_button;
	
	@FindBy(id="CHOLESTEROL")
	private WebElement cholesterol_option;
	
	@FindBy(id="txtPatientTotalCholestral")
	private WebElement totalcholesterol_txtbox;
	
	@FindBy(id="btnSaveCholestral")
	private WebElement cholesterolsave_button;
	
	@FindBy(css="button.confirm")
	private WebElement recorddataconfirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert showSweetAlert visible')]/div[4]/following::h2")
	private WebElement recorddataresponse_message;
	
	
	@FindBy(id="Locker")
	private WebElement healthlocker_tab;
	
	@FindBy(id="txtfOTP")
	private WebElement lockerotp_txtboxes;
	
	@FindBy(id="btnValidate")
	private WebElement otpvalidate_button;
	
	@FindBy(id="AddDoc")
	private WebElement adddocuments_button;
	
	@FindBy(xpath="//div[@id='ddlDocumentCategory_chosen']/a/span")
	private WebElement documenttype_listbox;
	
	@FindBy(xpath="//div[@id='ddlDocumentCategory_chosen']/div/div/input")
	private WebElement documenttype_txtbox;
	
	@FindBy(id="fileUpload")
	private WebElement selectfiles_option;
	
	@FindBy(id="txtReportTitle")
	private WebElement reporttitle_txtbox;
	
	@FindBy(id="btnAddFiles")
	private WebElement addfiles_button;
	
	@FindBy(css="button.confirm")
	private WebElement healthlockerconfirmok_button;
	
	@FindBy(id="btnUploadFiles")
	private WebElement uploadfiles_button;
	
	@FindBy(css="p[style='display: block;']")
	private WebElement healthlockerresponsemessage;
	
	
	//------------------------------Methods---------------------------------------------------------------
	
	
	
	public void clickOnMyProfileLink()
	{
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].click();", myProfile_link);
	}
	
	public void clickOnUpdateProfileBtn()
	{
		JavascriptExecutor Jse=((JavascriptExecutor)driver);
		Jse.executeScript("arguments[0].click();", updateProfile_btn);
	}
	
	public void setPatientName(String patientname)
	{
		patientname_txtbox.clear();
		patientname_txtbox.sendKeys(patientname);
	}
	
	public void setPatientDateOfBirth(String date)
	{
			patientdateofbirth_txtbox.clear();
			patientdateofbirth_txtbox.sendKeys(date);
	}
	
	public void setAge(String Age) {
		
		patientage_txtbox.clear();
		patientage_txtbox.sendKeys(Age);
	}
	
	public void selectRelationship(String Relation)
	{
		relationship_listbox.click();
		relationship_textbox.sendKeys(Relation,Keys.ENTER);
		
	}
	
	public void setRelationshipname(String Relationname)
	{
		relationshipname_txtbox.clear();
		relationshipname_txtbox.sendKeys(Relationname);
	}
	
	public void setPincode(String Pincode)
	{
		patientpincode_txtbox.clear();
		patientpincode_txtbox.sendKeys(Pincode);
	}
	
	public void selectGender(String Gender)
	{
		gender_listbox.click();
		gender_txtbox.sendKeys(Gender,Keys.ENTER);
	}
	
	
	public void setMobileNo(String MobileNo,String Otp)
	{
		patientmobileno_txtbox.clear();
		patientmobileno_txtbox.sendKeys(MobileNo);
		verify_link.click();
		otp_txtboxs.sendKeys(Otp);
		validate_btn.click();
		
	}
	
	public void selectPreferedSvc(String PreferedSvc)
	{
		preferredsvc_listbox.click();
		preferredsvc_txtbox.sendKeys(PreferedSvc,Keys.ENTER);
		
	}
	
	public void clickOnUpdateBtn()
	{
		update_btn.click();
	}
	
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	
	public String getActualResponseMessage()
	{
		return responsemessage.getText();
	}
	
	public void setHeight(String HeightFt,String HeightInches) throws InterruptedException
	{
		recorddata_button.click();
		height_option.click();
		heightft_txtbox.sendKeys(HeightFt);
		heightinches_txtbox.sendKeys(HeightInches);
		Thread.sleep(2000);
		heightsave_button.click();
		
	}
	public void setWeight(String Weight) throws InterruptedException
	{
		recorddata_button.click();
		weight_option.click();
		weight_txtbox.sendKeys(Weight);
		Thread.sleep(2000);
		weightsave_button.click();
		
	}
	public void setBloodGlucose(String Readings,String Type) throws InterruptedException
	{
		recorddata_button.click();
		bloodglucose_option.click();
		bloodglucosereadings_txtbox.sendKeys(Readings);
		type_listbox.click();
		Thread.sleep(2000);
		type_txtbox.sendKeys(Type,Keys.ENTER);
		Thread.sleep(2000);
		bloodglucosesave_button.click();
	
	}
	public void setBloodPressure(String Systolic,String Diastolic) throws InterruptedException
	{
		recorddata_button.click();
		bloodpressue_option.click();
		Thread.sleep(2000);
		systolicupper_txtbox.sendKeys(Systolic);
		Thread.sleep(2000);
		diastoliclower_txtbox.sendKeys(Diastolic);
		Thread.sleep(2000);
		bpsave_button.click();
		
	}
	public void setFamilyHistory(String FamilyMedicalRelationship,String Condition) throws InterruptedException
	{
		recorddata_button.click();
		familyhistory_option.click();
		familymedicalrelationship_listbox.click();
		Thread.sleep(2000);
		familymedicalrelatinship_txtbox.sendKeys(FamilyMedicalRelationship,Keys.ENTER);
		Thread.sleep(2000);
		condition_txtbox.sendKeys(Condition);
		severity_raidobutton.click();
		Thread.sleep(2000);
		familymedicalhissave_button.click();

	}
	public void setAllergy(String Allergy,String AllergyType,String AllergyReaction) throws InterruptedException
	{
		recorddata_button.click();
		allergy_option.click();
		allergy_txtbox.sendKeys(Allergy);
		allergytype_listbox.click();
		Thread.sleep(2000);
		allergytype_txtbox.sendKeys(AllergyType,Keys.ENTER);
		allergyreaction_listbox.click();
		Thread.sleep(2000);
		allergyreaction_txtbox.sendKeys(AllergyReaction,Keys.ENTER);
		Thread.sleep(2000);
		allergysave_button.click();
		
	}
	public void setCholesterol(String TotalCholesterol) throws InterruptedException
	{
		recorddata_button.click();
		cholesterol_option.click();
		totalcholesterol_txtbox.sendKeys(TotalCholesterol);
		Thread.sleep(2000);
		cholesterolsave_button.click();
		
	}
	public void clickOnRecordDataConfirmOkButton()
	{
		recorddataconfirmok_button.click();
	}

	public String getActualRecordDataResponseMessages()
	{
		return recorddataresponse_message.getText();
	}
	public void setHealthLockerDocuments(String LockerOtp) throws InterruptedException 
	{ 
		
		healthlocker_tab.click();
		Thread.sleep(2000);
		lockerotp_txtboxes.sendKeys(LockerOtp);
		otpvalidate_button.click();
	}
		
	public void UploadDocuments(String[] DocumentType, String ExpectedAddResponseMessage, String ExpectedUploadFileResponseMessage) throws IOException, InterruptedException
	{
		PropertiesFile propfile = new PropertiesFile();
		List<String> HealthLockerDocuments = propfile.getHealthLockerDocuments();
		for(int i=0; i<HealthLockerDocuments.size(); i++) {
			adddocuments_button.click();
			documenttype_listbox.click();
			Thread.sleep(2000);
			documenttype_txtbox.sendKeys(DocumentType[i],Keys.ENTER);
			Thread.sleep(2000);
			selectfiles_option.sendKeys(System.getProperty("user.dir")+HealthLockerDocuments.get(i));
			Thread.sleep(2000);
			addfiles_button.click();
			Thread.sleep(2000);
			Assert.assertTrue(healthlockerresponsemessage.getText().contains(ExpectedAddResponseMessage));
			Thread.sleep(2000);
			healthlockerconfirmok_button.click();
			Thread.sleep(3000);
			uploadfiles_button.click();
			Thread.sleep(5000);
			Assert.assertTrue(healthlockerresponsemessage.getText().contains(ExpectedUploadFileResponseMessage));
			healthlockerconfirmok_button.click();
			Thread.sleep(2000);
		}
		
	}
	
}
