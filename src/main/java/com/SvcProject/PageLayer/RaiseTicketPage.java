package com.SvcProject.PageLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class RaiseTicketPage extends TestBase {

	
	public RaiseTicketPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------Variables------------------------------------------------------
	
	@FindBy(xpath="//span[text()='Support']")
	private WebElement supportmodule_link;
	
	@FindBy(xpath="//span[text()='Raise Ticket']")
	private WebElement raiseticketform_link;
	
	@FindBy(id="RaiseTicket")
	private WebElement raisetikcet_link;
	
	@FindBy(xpath="//div[@id='ddlIssueType_chosen']/a/span")
	private WebElement issuetype_listbox;
	
	@FindBy(xpath="//div[@id='ddlIssueType_chosen']/div/div/input")
	private WebElement issuetype_txtbox;
	
	@FindBy(xpath="//div[@id='ddlSubIssueType_chosen']/a/span")
	private WebElement subissuetype_listbox;
	
	@FindBy(xpath="//div[@id='ddlSubIssueType_chosen']/div/div/input")
	private WebElement subissuetype_txtbox;
	
	@FindBy(id="txtIssueDesc")
	private WebElement issuedescription_txtbox;
	
	@FindBy(id="btnSave")
	private WebElement save_button;
	
	@FindBy(css="button.confirm")
	private WebElement confirmok_button;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search_txtbox;
	
	@FindBy(xpath="//label[@title='Click here to View Ticket status']/u")
	private WebElement pending_link;
	
	@FindBy(xpath="//button[text()='Close']")
	private WebElement close_button;
	
	@FindBy(css="#grdTicketDtls td:nth-child(2)")
	private List<WebElement> ticketNumbers_txt;
	
	//----------------------------Methods------------------------------------------------------------------------
	
	
	public void clickOnSupportModule()
	{
		supportmodule_link.click();
	}
	public void clickOnRaiseTicketForm()
	{
		raiseticketform_link.click();
	}
	public void clickOnRaiseTicketLink()
	{
		raisetikcet_link.click();
	}
	public void selectIssueTypeListBox()
	{
		issuetype_listbox.click();
	}
	public void selectIssueTypeTextBox(String IssueType)
	{
		issuetype_txtbox.sendKeys(IssueType,Keys.ENTER);
	}
	public void selectSubIssueTypeListBox()
	{
		subissuetype_listbox.click();
	}
	public void selectSubIssueTypeTextBox(String SubIssueType)
	{
		subissuetype_txtbox.sendKeys(SubIssueType,Keys.ENTER);
	}
	public void setIssueDescription(String IssueDescription)
	{
		issuedescription_txtbox.sendKeys(IssueDescription);
	}
	public void clickOnSaveButton()
	{
		save_button.click();
	}
	public void clickOnConfirmOkButton()
	{
		confirmok_button.click();
	}
	public void setSearchRecentTicketNumber()
	{
		search_txtbox.sendKeys(getTicketNumbers().get(getTicketNumbers().size()-1));
	}
	public void clickOnPendingLink()
	{
		pending_link.click();
	}
	public void clickOnCloseButton()
	{
		close_button.click();
	}

	public List<String> getTicketNumbers(){
		List<String> ticketNumbers = new ArrayList<>();
		for(WebElement ticketNumber_txt : ticketNumbers_txt)
			ticketNumbers.add(ticketNumber_txt.getText());
		
		return ticketNumbers;
	}
	
}
