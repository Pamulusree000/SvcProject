package com.SvcProject.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class SpecializationPage extends TestBase{

	
	public SpecializationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------------------------Variables-----------------------------------------------------
	
	
	@FindBy(xpath="//span[text()='Master']")
	private WebElement mastermodule_link;
	
	@FindBy(xpath="//span[text()='Specialization']")
	private WebElement specialization_link;
	
	@FindBy(id="btnNew")
	private WebElement new_button;
	
	@FindBy(id="txtSpecializationName")
	private WebElement specializationname_txtbox;
	
	@FindBy(id="txtSpecializationDesc")
	private WebElement specializationdescription_txtbox;
	
	@FindBy(id="txtSpecializationAliasName")
	private WebElement specializationaliasname_txtbox;
	
	@FindBy(id="txtNumberOfSlots")
	private WebElement specializatinnoofslots_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
//	@FindBy(css="p[style='display: block;']")
//	private WebElement specializationalreadyexist_txt;
//	
//	@FindBy(css="button.confirm")
//	private WebElement confirmok_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert showSweetAlert visible')]/div[4]/following::p[1]")
	private WebElement response_message;
	

	
	//---------------------------------Methods-----------------------------------------------------------
	
	
	public void clickOnAdminModule()
	{
		mastermodule_link.click();
	}
	public void clickOnSpecialization()
	
	{
		specialization_link.click();
	}
	public void clickOnNewButton()
	{
		new_button.click();
	}
	public void setSpecializationName(String SpecializationName)
	{
		specializationname_txtbox.sendKeys(SpecializationName);
	}
	public void setSpecializationDescription(String SpecializationDescription)
	{
		specializationdescription_txtbox.sendKeys(SpecializationDescription);
	}
	public void setSpecializationAliasName(String SpecializationAliasName)
	{
		specializationaliasname_txtbox.sendKeys(SpecializationAliasName);
	}
	public void setSpecializationNoOfSlots(String SpecializationNoOfSlots)
	{
		specializatinnoofslots_txtbox.sendKeys(SpecializationNoOfSlots);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
//	public String isSpecializationAlreadyExist()
//	{
//		return specializationalreadyexist_txt.getText();
//	}
//	
//	public void clickOnFinalOkButton()
//	{
//		if(isSpecializationAlreadyExist().equals("Specialization already exists"))
//		{
//			confirmok_button.click();
//		}else
//		{
//			finalconfirmok_button.click();
//		}
//		
//	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	
	
}