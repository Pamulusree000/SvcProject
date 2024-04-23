package com.SvcProject.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class ForgotPasswordPage extends TestBase {

	
	public ForgotPasswordPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//------------------------------------------Variables---------------------------------------------------------
	
	
	@FindBy(xpath="//span[text()=\"Sign-In\"]")
	private WebElement homesignin_btn;
	
	@FindBy(id="forgotPwd")
	private WebElement forgotpassword_link;
	
	@FindBy(id="txtMobNo")
	private WebElement username_txtbox;
	
	@FindBy(id="btnsubmit")
	private WebElement submit_btn;
	
	@FindBy(id="txtOTP")
	private WebElement otp_txtbox;
	
	@FindBy(id="btnPopup")
	private WebElement otpsubmit_btn;
	
	@FindBy(id="txtUserPassword")
	private WebElement newpassword_txtbox;
	
	@FindBy(id="txtUserConfirmPassword")
	private WebElement confirmpassword_txtbox;
	
	@FindBy(id="btnUpdate")
	private WebElement update_btn;
	
	@FindBy(css="p#pErrorMessage")
	private WebElement actualerror_message;
	
	@FindBy(xpath="//div[contains(@class,'sweet-alert')]/div[4]/following::p[1]")
	private WebElement actualresponse_message;
	
	
	//-------------------------------Methods---------------------------------------------------------------
	
	
	public void clickOnHomeSignInBtn()
	{
		homesignin_btn.click();
	}
	
	public void clickOnForgotPasswordLinkTxt()
	{
		forgotpassword_link.click();
	}
	
	public void setUsername(String Username)
	{
		username_txtbox.sendKeys(Username);
	}
	
	public void clickOnSubmitBtn()
	{
		submit_btn.click();
	}
	
	public void setOtp(String Otp)
	{
		otp_txtbox.sendKeys(Otp);
	}
	
	public void clickOnOtpSubmitBtn()
	{
		otpsubmit_btn.click();
	}
	
	public void setNewPassword(String NewPassword)
	{
		newpassword_txtbox.sendKeys(NewPassword);
	}
	
	public void setConfirmPassword(String ConfirmPassword)
	{
		confirmpassword_txtbox.sendKeys(ConfirmPassword);
	}
	
	public void clickOnUpdateBtn()
	{
		update_btn.click();
	}
	public String  getActualErrorMessage()
	{
		return actualerror_message.getText();
	}
	public String getActualResponseMessage() 
	{
		return actualresponse_message.getText();
	}
}
