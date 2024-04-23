package com.SvcProject.PageLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class UserManagementPage extends TestBase{
	
	
	public UserManagementPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------------------Variables------------------------------------
	
	
//	@FindBy(css=".paginate_button>a")
//	private List<WebElement> pagenumbermaintanence_button;
//	
//	@FindBy(css="#grdUserROleMaintanence td:nth-child(4)")
//	private List<WebElement> mobilenumbers_txt;
	
	@FindBy(xpath="//span[text()='Support']")
	private WebElement supportmodule_link;
	
	@FindBy(xpath="//span[text()='User Management']")
	private WebElement usermanagementform_link;
	
	@FindBy(xpath="//div[@id='ddlUserRoleID_chosen']/a/span")
	private WebElement roles_listbox;
	
	@FindBy(xpath="//div[@id='ddlUserRoleID_chosen']/div//input")
	private WebElement roles_txtbox;
	
	@FindBy(css="input[type='search']")
	private WebElement search_txtbox;
	
	@FindBy(css="[onchange*=UserStatus]+label")
	private WebElement userstatus_togglebutton;
	
	@FindBy(css="[onchange*=UserStatus]")
	private WebElement userstatus_txt;
	
	@FindBy(css="[onchange*=UserBlockedStatus]+label")
	private WebElement userblocked_togglebutton;
	
	@FindBy(css="[onchange*=UserBlockedStatus]")
	private WebElement userblocked_txt;
	
	@FindBy(css="button.confirm")
	private WebElement Activate_button;
	
	@FindBy(id="txtRemarks")
	private WebElement remarks_textbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::h2")
	private WebElement response_message;
	
	
	//--------------------------------Methods------------------------------------------------------
	
	
	public void clickOnSupportModuleLink()
	{
		supportmodule_link.click();
	}
	public void clickOnUserManagementFormLink()
	{
		usermanagementform_link.click();
	}
	public void selectRoles(String Roles)
	{
		roles_listbox.click();
		roles_txtbox.sendKeys(Roles,Keys.ENTER);
	}
	public void searchMobileNumber(String MobileNumber)
	{
		search_txtbox.sendKeys(MobileNumber);
	}
	
	public void clickOnUserStatusToggleButton()
	{
		userstatus_togglebutton.click();
	}
	
	public String getUserStatusText()
	{
		return userstatus_txt.getAttribute("checked");
	}
	
	public void clickOnUserBlockedStatusToggleButton()
	{
		userblocked_togglebutton.click();
	}
	
//	public String getUserBlockedText()
//	{
//		return userblocked_txt.getAttribute("checked");
//	}

	public void clickOnActivateButton() 
	{
		Activate_button.click();	
	}
	public void setRemarks(String Remarks)
	{
		remarks_textbox.sendKeys(Remarks);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	
	public String getActualResponseMessage()
	{
		return response_message.getText();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	
	public boolean getUserToggleButtonStaus() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		return (boolean)jse.executeScript("return document.querySelector('[onchange*=UserStatus]').hasAttribute('checked');");
	}
	
//	public  void clickOnPreviousButton()
//	{
//		 pagenumbermaintanence_button.get(0).click();
//	}
//	public void clickOnNextButton()
//	{
//		pagenumbermaintanence_button.get(pagenumbermaintanence_button.size()-1).click();
//	}
//	public void clickOnFirstPageGrid()
//	{
//		pagenumbermaintanence_button.get(1).click();
//	}
//	public void clickOnLastPageGrid()
//	{
//		pagenumbermaintanence_button.get(pagenumbermaintanence_button.size()-2).click();
//	}
//	public int getLastPageNumber()
//	{
//		return  Integer.parseInt(pagenumbermaintanence_button.get(pagenumbermaintanence_button.size()-2).getText());
//	}
//	public List<String> getMobileNumbers()
//	{
//		List<String> MobileNumbers= new ArrayList<>();
//		for(int i=0; i<getLastPageNumber(); i++)
//		{
//			for(int j=0; j<mobilenumbers_txt.size(); j++)
//			{
//				MobileNumbers.add(mobilenumbers_txt.get(j).getText());
//			}
//			clickOnNextButton();
//		}
//		return MobileNumbers;
//	}

}
