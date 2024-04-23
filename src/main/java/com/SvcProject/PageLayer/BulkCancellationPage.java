package com.SvcProject.PageLayer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class BulkCancellationPage extends TestBase{

	
	public BulkCancellationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------------------Variable---------------------------------------------
	
	
	@FindBy(xpath="//ul[@id='Modules']//li[8]/a/span[@class='title']")
	private WebElement othersmodule_link;
	
	@FindBy(xpath="//span[text()='Bulk Cancellation']")
	private WebElement bulkcancellationform_link;
	
	@FindBy(id="btnNew")
	private WebElement new_button;
	
	@FindBy(xpath="//div[@id='ddlDoctor_chosen']/a/span")
	private WebElement doctor_listbox;
	
	@FindBy(xpath="//div[@id='ddlDoctor_chosen']/div//input")
	private WebElement doctor_textbox;
	
	@FindBy(xpath="//div[@id='ddlPHC_chosen']/a/span")
	private WebElement phc_listbox;
	
	@FindBy(xpath="//div[@id='ddlPHC_chosen']/div//input")
	private WebElement phc_textbox;
	
	@FindBy(id="txtAppointmentCancelDate")
	private WebElement canceldate_datepicker;
	
	@FindBy(id="btnLoad")
	private WebElement load_button;
	
	@FindBy(css="#grdDoctorCnclApt td:nth-child(2)")
	private List<WebElement> appointmentno_txt;
	
	@FindBy(css="input[name='IsChecked']")
	private List<WebElement> deleteappointment_checkbox;
	
	@FindBy(id="btnCancelAppointment")
	private WebElement cancelappointment_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	//---------------------------------Methods--------------------------------------
	
	
	public void clickOnOthersModuleLink()
	{
		othersmodule_link.click();	
	}
	public void clickOnBulkCancellationForm()
	{
		bulkcancellationform_link.click();
	}
	public void clickOnNewButton()
	{
		new_button.click();
	}
	public void selectDoctor(String Doctor)
	{
		doctor_listbox.click();
		doctor_textbox.sendKeys(Doctor,Keys.ENTER);
	}
	public void selectPhc(String Phc)
	{
		phc_listbox.click();
		phc_textbox.sendKeys(Phc,Keys.ENTER);
	}
	public void selectDate(String DatePicker)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+DatePicker+"';", canceldate_datepicker);
	}
	public void clickOnLoadButton()
	{
		load_button.click();
	}
	
	public List<String> getAppointmentNumbers()
	{
		List<String> appointmentnumbers= new ArrayList<>();
		for(int i=0; i<appointmentno_txt.size(); i++)
		{
			appointmentnumbers.add(appointmentno_txt.get(i).getText());
		}
		return appointmentnumbers;
	}
	
	public Map<String, WebElement> selectDeleteAppointment()
	{
		Map<String, WebElement> DeleteAppointments= new LinkedHashMap<>();
		
		for(int d=0; d<deleteappointment_checkbox.size(); d++)
		{
			DeleteAppointments.put(getAppointmentNumbers().get(d), deleteappointment_checkbox.get(d));
		}
		return DeleteAppointments;
	}
	public void selectCheckBoxOnBasisOfAppointmentNumber (String AppointmentNumber)
	{
		selectDeleteAppointment().get(AppointmentNumber).click();
	}
	
	public void clickOnCancelAppointmentButton()
	{
		cancelappointment_button.click();
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
