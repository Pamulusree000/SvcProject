package com.SvcProject.PageLayer;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class BookAppointmentPage extends TestBase{

	
	public BookAppointmentPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//-----------------------------------Variables---------------------------------------------------------
	
	@FindBy(xpath="//div[@id='remove-scroll']/div/ul/li[4]/a/span")
	private WebElement bookappointment_link;
	
	@FindBy(id="ddlSpecialization_chosen")
	private WebElement specialization_listbox;
	
	@FindBy(xpath="//div[@id='ddlSpecialization_chosen']/div/div/input")
	private WebElement specilization_textbox;
	
	@FindBy(id="SearchSVCDtls")
	private WebElement search_txtbox;
	
	@FindBy(xpath="//button[@class='btn btn-primary pull-right'] [@data-target='8']")
	private WebElement bookappointment_btn;

	@FindBy(xpath="//span[@class='slot-date']/p[text()='14-Feb-2024']")
	private WebElement slotdate_link;
	
	@FindBy(xpath="//div[@id='13-Feb-2024']/li/a/span/p/span[text()='0']")
	private WebElement availableslots_link;
	
	@FindBy(xpath="//div[@href='#14-Feb-2024']/div/ul[2]/li[8]/a/span[text()='02:30 PM']")
	private WebElement bookslot_btn;
	
	@FindBy(id="SearchDoctor")
	private WebElement doctorsearch_txtbox;
	
	@FindBy(id="rdDoctor4")
	private WebElement doctor_radiobtn;
	
	@FindBy(id="rdSelf")
	private WebElement self_radiobtn;
	
	@FindBy(id="rdOthers")
	private WebElement family_radiobtn;
	
	@FindBy(xpath="//div[@id='ddlPatient_chosen']")
	private WebElement family_listbox;
	
	@FindBy(xpath="//div[@id='ddlPatient_chosen']/div/div/input")
	private WebElement familyname_txtbox;
	
	@FindBy(id="btnConfirm")
	private WebElement confirmclinic_btn;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_btn;
	
	
	
	
	
	@FindBy(xpath="//div[@id='sync28']//p[@style='text-align:center;']")
	private List<WebElement> date_list;
	
	//-----------------------------------Methods-----------------------------------------------------
	
	
	
	
	public void clickOnBookAppointmentLink()
	{
		bookappointment_link.click();
	}
	
	public void selectSpecializationlist(String Specialization)
	{
		specialization_listbox.click();
		specilization_textbox.sendKeys(Specialization,Keys.ENTER);
	}
	
	public void setSvcSearchtxt (String SvcSearch)
	{
		search_txtbox.sendKeys(SvcSearch);
	}
	
	public void clickOnBookAppointmentBtn()
	{
		bookappointment_btn.click();
	}
	
	public void clickOnSlotDate()
	{
		slotdate_link.click();
	}
	
	public void clickOnSlotBtn()
	{
		bookslot_btn.click();
	}
	
	public void setDoctorSearch(String DoctorSearch)
	{
		doctorsearch_txtbox.sendKeys(DoctorSearch);
	}
	
	public void clickOnRadioBtn()
	{
		doctor_radiobtn.click();
	}
	
	public void clickOnSelfRadioButton() {
		self_radiobtn.click();
	}
	
	public void clickOnFamilyRadioBtn(String FamilyName)
	{
		family_radiobtn.click();
		family_listbox.click();
		familyname_txtbox.sendKeys(FamilyName,Keys.ENTER);
	}
	
	public void clickOnConfirmClinicbtn()
	{
		confirmclinic_btn.click();
	}
	
	public void clickOnConfirmOkBtn()
	{
		confirmclinic_btn.click();
	}
	
	
	public void selectDate(String date) {
		for(int i=0; i<date_list.size(); i++) {
			if(date_list.get(i).getText().equals(date)) {
				date_list.get(i).click();
				break;
			}
		}
	}
	
	
	public String getTodayDate() {
		return date_list.get(0).getText();
	}
	
	public String getTomorrowDate() {
		return date_list.get(1).getText();
	}
	
	
	
	
}
