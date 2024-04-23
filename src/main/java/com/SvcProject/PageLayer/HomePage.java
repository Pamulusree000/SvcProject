package com.SvcProject.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SvcProject.TestBase.TestBase;



public class HomePage extends TestBase{
	
	
	public HomePage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@href='./login/login']/span")
	private WebElement homelogin_link;
	
//	@FindBy(xpath="//nav[@id='navbar']/ul/li//a[@href='./login/login']/span")
//	private WebElement homesignin_btn;
	
	@FindBy(xpath="//nav[@id='navbar']/ul/li//a[@href='/Login/Register']/span")
	private WebElement homesignup_btn;
	

	public String getSignInText() {
		return homelogin_link.getText();
	}
	
	public String getSignUpText() {
		return homesignup_btn.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
}
