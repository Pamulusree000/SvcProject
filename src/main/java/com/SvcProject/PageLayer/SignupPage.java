package com.SvcProject.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class SignupPage extends TestBase {
	
	public SignupPage (){
		
		PageFactory.initElements(driver, this);
	}
	
	
	//------------------------------------------Variables-------------------------------------------------------------------
	
	@FindBy(xpath="//nav[@id='navbar']/ul/li//a[@href='/Login/Register']/span")
	private WebElement homesignup_button;
	
	@FindBy(id="txtMobNo")
	private WebElement mobilenumber_textbox;
	
	@FindBy(id="txtUserName")
	private WebElement name_textbox;
	
	@FindBy(id="txtUserEmail")
	private WebElement emailid_textbox;
	
	@FindBy(id="txtPwd")
	private WebElement password_textbox;
	
	@FindBy(id="txtCpwd")
	private WebElement confirmpassword_textbox;
	
	@FindBy(css="input[id='Gender'][value='1']")
	private WebElement male_radiobutton;
	
	@FindBy(css="input[id='Gender'][value='2']")
	private WebElement female_radiobtn;
	
	@FindBy(css="input[id='Gender'][value='3']")
	private WebElement others_radiobtn;
	
	@FindBy(id="btnSubmit")
	private WebElement submit_button;
	
	@FindBy(xpath="//div[@id='Idterms1']//label/b")
	private WebElement termsandusage_checkbox;
	
	@FindBy(id="btnProceed")
	private WebElement proceed_button;
	
	@FindBy(id="txtOTP")
	private WebElement otp_textbox;
	
	@FindBy(id="btnSignUp")
	private WebElement signup_button;
	
	@FindBy(css="p#pErrorMessage")
	private WebElement error_message;
	
	
	//---------------------------------Methods-----------------------------------------------------------------
	
	
	public void clickOnHomeSigninButton()	
	{
		homesignup_button.click();
	}
	
	public void setMobileNumber (String MobileNumber) 
	{
		mobilenumber_textbox.sendKeys(MobileNumber);
	}
	
	public void setName (String Name)
	{
		name_textbox.sendKeys(Name);
	}
	
	public void setEmailId (String Email )
	{
		emailid_textbox.sendKeys(Email);
	}
	
	public void setPassword(String Password)
	{
		password_textbox.sendKeys(Password);
	}
	
	public void setConfirmPassword(String ConfirmPassword)
	{
		confirmpassword_textbox.sendKeys(ConfirmPassword);
	}
	
	public void selectGenderRadioButton(String Gender)
	{
		if(Gender.equalsIgnoreCase("Male"))
		{
			male_radiobutton.click();
		}else if(Gender.equalsIgnoreCase("Female"))
		{
			female_radiobtn.click();
		}else
		{
			others_radiobtn.click();
		}
	}
	
	public void clickOnSubmitButton()
	{
		submit_button.click();
	}
	
	public void selectTermsandUsageCheckBox()
	{
		termsandusage_checkbox.click();
	}
	
	public void clickOnProceedButton()
	{
		proceed_button.click();
	}
	
	public void setOtp (String Otp)
	{
		otp_textbox.sendKeys(Otp);
	}
	
	public void clickonSignUpButton()
	{
		signup_button.click();
	}
	
	public String getErrorMessageText()
	{
		return error_message.getText();
	}
	
}
