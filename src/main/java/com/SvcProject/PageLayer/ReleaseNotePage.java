package com.SvcProject.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class ReleaseNotePage extends TestBase{

	
	
	public ReleaseNotePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//---------------------------------Variables-------------------------------
	
	@FindBy(xpath="//span[text()='Support']")
	private WebElement supportmodule_link;
	
	@FindBy(xpath="//span[text()='Release Note']")
	private WebElement releasenote_link;
	
	@FindBy(id="btnNew")
	private WebElement newrelease_button;
	
	@FindBy(id="txtRelDate")
	private WebElement releasedate_datepicker;
	
	@FindBy(id="txtverno")
	private WebElement releaseversion_txtbox;
	
	@FindBy(xpath="//div[@id='ddlReleaseType_chosen']/a/span")
	private WebElement releasetype_listbox;
	
	@FindBy(xpath="//div[@id='ddlReleaseType_chosen']/div/div/input")
	private WebElement releasetype_txtbox;
	
	@FindBy(id="txtProjectLead")
	private WebElement developmentlead_txtbox;
	
	@FindBy(xpath="//div[@id='ddlApplication_chosen']/a/span")
	private WebElement applicationtype_listbox;
	
	@FindBy(xpath="//div[@id='ddlApplication_chosen']/div/div/input")
	private WebElement applicationtype_txtbox;
	
	@FindBy(id="txtProdAppServerIp")
	private WebElement appserverip_txtbox;
	
	@FindBy(id="txtReleasePublishFilesPath")
	private WebElement releasepublishfilepath_txtbox;
	
	@FindBy(id="txtReleaseDBscriptsFilesPath")
	private WebElement releasedbscriptsfilepath_txtbox;
	
	@FindBy(id="txtProdDbServerIp")
	private WebElement dbserverip_txtbox;
	
	@FindBy(id="txtRollbackPublishFilesPath")
	private WebElement rollbackpublishfilepath_txtbox;
	
	@FindBy(id="txtRollbackDBScriptsPath")
	private WebElement rollbackdbscriptspath_txtbox;
	
	@FindBy(id="txtReldesc")
	private WebElement releasedescritpion_txtarea;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert showSweetAlert visible')]/div[4]/following::p[1]")
	private WebElement response_message;
	
	
	//-----------------------------------Methods-------------------------------------------
	
	
	public void clickOnSupportModule()
	{
		supportmodule_link.click();
	}
	public void clickOnReleaseNote()
	{
		releasenote_link.click();
	}
	public void clickOnNewReleaseButton()
	{
		newrelease_button.click();
	}
	
	public void selectDatePicker(String ReleaseDate)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+ReleaseDate+"';", releasedate_datepicker);	
	}
	public void setReleaseVersion(String ReleaseVersion)
	{
		releaseversion_txtbox.sendKeys(ReleaseVersion);
	}
	public void selectReleaseType(String ReleaseType)
	{
		releasetype_listbox.click();
		releasetype_txtbox.sendKeys(ReleaseType,Keys.ENTER);
	}
	public void setDevelopmentLead(String DevelopmentLead)
	{
		developmentlead_txtbox.sendKeys(DevelopmentLead);
	}
	public void selectApplicationType(String ApplicationType)
	{
		applicationtype_listbox.click();
		applicationtype_txtbox.sendKeys(ApplicationType,Keys.ENTER);
	}
	public void setAppServerIp(String AppServerIp)
	{
		appserverip_txtbox.sendKeys(AppServerIp);
	}
	public void setReleasePublishFilePath(String ReleasePublishFilePath)
	{
		releasepublishfilepath_txtbox.sendKeys(ReleasePublishFilePath);
	}
	public void setReleaseScriptFilePath(String ReleaseScriptFilePath)
	{
		releasedbscriptsfilepath_txtbox.sendKeys(ReleaseScriptFilePath);
	}
	public void setDbServerIp(String DbServerIp)
	{
		dbserverip_txtbox.sendKeys(DbServerIp);
	}
	public void setRollBackPublishFilePath(String RollBackPublishFilePath)
	{
		rollbackpublishfilepath_txtbox.sendKeys(RollBackPublishFilePath);
	}
	public void setRollBackScriptsPath(String RollBackScriptsPath)
	{
		rollbackdbscriptspath_txtbox.sendKeys(RollBackScriptsPath);
	}
	public void setReleaseDescription(String ReleaseDescription)
	{
		releasedescritpion_txtarea.sendKeys(ReleaseDescription);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	
	
}
