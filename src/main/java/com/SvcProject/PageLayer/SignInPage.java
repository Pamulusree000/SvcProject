package com.SvcProject.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class SignInPage extends TestBase{
	
	public SignInPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	//---------------------------------Variable--------------------------------------------------------
	
	
	@FindBy(xpath="//nav[@id='navbar']/ul/li//a[@href='./login/login']/span")
	private WebElement signin_button;
	
	@FindBy(id="txtMobNo")
	private WebElement username_textbox;
	
	@FindBy(id="txtloginpwd")
	private WebElement password_textbox;
	
	@FindBy(id="btnLogin")
	private WebElement login_button;
	
	@FindBy(css="p#pErrorMessage")
	private WebElement error_txt;
	
	
	//-------------------------------Methods---------------------------------------------
	
	
	public void clickOnSigninButton ()
	{
		signin_button.click();
	}
	
	public void setUsername(String Username) {
		username_textbox.sendKeys(Username);
	}
	
	public void setPassword(String Password)
	{
		password_textbox.sendKeys(Password);
	}
	
	public void clickOnLoginbutton()
	{
		login_button.click();
		
	}
	
	public String getErrorText() {
		return error_txt.getText();
	}
	
	
	
	
}
