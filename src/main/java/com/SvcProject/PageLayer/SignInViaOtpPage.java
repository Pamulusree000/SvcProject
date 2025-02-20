package com.SvcProject.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;

public class SignInViaOtpPage extends TestBase {

	
	//private static final CharSequence Otp = null;

	public SignInViaOtpPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------------------------Variables---------------------------------------------------------
	
	@FindBy(xpath="//span[text()=\"Sign-In\"]")
	private WebElement homesignin_button;
	
	@FindBy(id="txtMobNo")
	private WebElement username_textbox;
	
	@FindBy(id="btnOTP")
	private WebElement signinviaotp_button;
	
	@FindBy(id="txtOTP")
	private WebElement otp_textbox;
	
	@FindBy(css="i#timer")
	private WebElement timer_txt;
	
	@FindBy(id="btnResend")
	private WebElement resendotp_link;
	
	@FindBy(id="btnLoginOTP")
	private WebElement signin_button;
	
	@FindBy(css="p#pErrorMessage")
	private WebElement error_txt;

	
	
	//----------------------action method---------------------------------
	
	
	
	public void clickOnHomeSignInButton()
	{
		homesignin_button.click();
	}
	
	public void setUsername(String Username)
	{
		username_textbox.sendKeys(Username);
	}
	
	public void clickOnSignInViaOtpButton()
	{
		signinviaotp_button.click();
	}
	
//	public void setOtp(String Otp)
//	{
//		otptextbox.sendKeys(Otp);
//	}
	
	public String getTimer() {
		return timer_txt.getText();
	}
	
	public void setOTP(String Otp) {
		if(getTimer().equals("0:00")) {
			resendotp_link.click();
		}else
		{
			otp_textbox.sendKeys(Otp);
		}
	}
	
	public String getErrorText()
	{
		return error_txt.getText();
	}
	
	public void clickOnSignInButton()
	{
		signin_button.click();
	}

	
}
