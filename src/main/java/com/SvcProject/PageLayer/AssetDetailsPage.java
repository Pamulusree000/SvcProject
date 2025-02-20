package com.SvcProject.PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class AssetDetailsPage extends TestBase{

	
	public AssetDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//---------------------------Variables------------------------------------------------------------
	
	@FindBy(xpath="//span[text()='Asset']")
	private WebElement assetmodule_link;
	
	@FindBy(xpath="//span[text()='Asset Details']")
	private WebElement assetdetails_link;
	
	@FindBy(id="btnNew")
	private WebElement addassetdetails_button;
	
	@FindBy(xpath="//div[@id=\"ddlAssetMasterDetails_chosen\"]/a/span")
	private WebElement assetmastername_listbox;
	
	@FindBy(xpath="//div[@id=\"ddlAssetMasterDetails_chosen\"]/div/div/input")
	private WebElement assetmastername_txtbox;
	
	@FindBy(id="txtAssetId")
	private WebElement assetid_txtbox;
	
	@FindBy(xpath="//div[@id=\"ddlAssetManufatureId_chosen\"]/a/span")
	private WebElement manufacturer_listbox;
	
	@FindBy(xpath="//div[@id=\"ddlAssetManufatureId_chosen\"]/div/div/input")
	private WebElement manufacturer_txtbox;
	
	@FindBy(xpath="//button[text()='Today']")
	private WebElement purchasedate_datepicker;
	
	@FindBy(id="txtAssetPurchasedDate")
	private WebElement purchasedate_datepickertxtbox;
	
	@FindBy(id="txtAssetWarrantyPeriod")
	private WebElement warrantyperiod_txtbox;
	
	@FindBy(id="txtAssetInvoicedAmount")
	private WebElement invoiceamount_txtbox;
	
	@FindBy(xpath="//div[@id=\"ddlPHC_chosen\"]/a/span")
	private WebElement svc_listbox;
	
	@FindBy(xpath="//div[@id=\"ddlPHC_chosen\"]/div/div/input")
	private WebElement svc_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message1;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement response_message2;
	
	
	//--------------------------------Methods-------------------------------------------
	
	
	public void clickOnAssetModule()
	{
		assetmodule_link.click();
	}
	public void clickOnAssetDetails()
	{
		assetdetails_link.click();
	}
	public void clickOnAddAssetDetailsButton()
	{
		addassetdetails_button.click();
	}
	public void selectAssetMasterName(String AssetMasterName)
	{
		assetmastername_listbox.click();
		assetmastername_txtbox.sendKeys(AssetMasterName,Keys.ENTER);
	}
	public void setAssetId(String AssetId)
	{
		assetid_txtbox.sendKeys(AssetId);
	}
	public void selectManufacturer(String Manufacturer)
	{
		manufacturer_listbox.click();
		manufacturer_txtbox.sendKeys(Manufacturer,Keys.ENTER);
	}
	public void clickOnPurchaseDatePicker() 
	{
		
		purchasedate_datepickertxtbox.click();
		purchasedate_datepicker.click();
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].value='"+PurchaseDate+"';", purchasedate_datepickertxtbox);

	}
	public void setWarrantyPeriod(String WarrantyPeriod)
	{
		warrantyperiod_txtbox.sendKeys(WarrantyPeriod);
	}
	public void setInvoiceAmount(String InvoiceAmount)
	{
		invoiceamount_txtbox.sendKeys(InvoiceAmount);
	}
	public void selectSvc(String Svc)
	{
		svc_listbox.click();
		svc_txtbox.sendKeys(Svc,Keys.ENTER);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	public String getActualResponseMessage1()
	{
		return response_message1.getText();
	}
	public String getActualResponseMessage2()
	{
		return response_message2.getText();
	}
	
	
	
	
	
}

