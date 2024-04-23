package com.SvcProject.PageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class MyAppointmentsPage extends TestBase{

	
	public  MyAppointmentsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------------Variables---------------------------------------------------
	
	@FindBy(xpath="//span[text()='My Appointments']")
	private WebElement myappointment_link;
	
	@FindBy(id="txtFromDate")
	private WebElement fromdate_tab;
	
	@FindBy(id="txtToDate")
	private WebElement todate_tab;
	
	@FindBy(id="Upcoming")
	private WebElement upcoming_tab;
	
	@FindBy(id="Completed")
	private WebElement completed_tab;
	
	@FindBy(id="Cancelled")
	private WebElement cancelled_tab;
	
	@FindBy(id="All")
	private WebElement all_tab;
	
	
	//--------------------Methods--------------------------------------------------------
	
	public void clickOnMyAppointmentlink()
	{
		myappointment_link.click();
	}
	public void selectFromDate(String FromDate)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+FromDate+"';", fromdate_tab);
		
	}
	public void selectToDate(String ToDate)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+ToDate+"';", todate_tab);
	}
	
	public void clickOnUpcomingTab()
	{
		upcoming_tab.click();
	}
	public void clickOnCompletedTab()
	{
		completed_tab.click();
	}
	public void clickOnCancelledTab()
	{
		cancelled_tab.click();
	}
	public void clickOnAllTab()
	{
		all_tab.click();
	}
	
	
}
